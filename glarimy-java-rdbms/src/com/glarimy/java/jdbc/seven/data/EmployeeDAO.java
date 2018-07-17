package com.glarimy.java.jdbc.seven.data;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.glarimy.java.jdbc.seven.api.Employee;

public class EmployeeDAO {
	private Connection connection;
	private PreparedStatement saveOne;
	private PreparedStatement findOne;

	public EmployeeDAO() throws Exception {
		Properties props = new Properties();
		props.load(new FileReader("configuration.properties"));
		Class.forName(props.getProperty("driver", "com.mysql.jdbc.Driver"));
		connection = DriverManager.getConnection(
				props.getProperty("url", "jdbc:mydql://localhost:3306/glarimy?user=root&password=admin"));
		saveOne = connection.prepareStatement("insert into employee (name, salary, permanent) values (?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		findOne = connection.prepareStatement("select * from employee where eid=?");

	}

	public int create(Employee employee) throws Exception {
		saveOne.setString(1, employee.getName());
		saveOne.setDouble(2, employee.getSalary());
		saveOne.setBoolean(3, employee.isPermanent());
		saveOne.executeUpdate();
		ResultSet keys = saveOne.getGeneratedKeys();
		keys.next();
		return keys.getInt(1);
	}

	public Employee read(int eid) throws Exception {
		Employee employee = null;
		findOne.setInt(1, eid);
		ResultSet records = findOne.executeQuery();
		if (records.next()) {
			employee = new Employee();
			employee.setId(records.getInt("eid"));
			employee.setName(records.getString("name"));
			employee.setSalary(records.getDouble("salary"));
			employee.setPermanent(records.getBoolean("permanent"));
		}
		return employee;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		saveOne.close();
		findOne.close();
		connection.close();
	}
}
