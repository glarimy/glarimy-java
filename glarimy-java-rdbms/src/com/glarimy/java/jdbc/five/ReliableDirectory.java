package com.glarimy.java.jdbc.five;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ReliableDirectory implements Directory {
	private static ReliableDirectory INSTANCE;
	private Connection connection;
	private PreparedStatement saveOne;
	private PreparedStatement findOne;

	private ReliableDirectory() throws Exception {
		Properties props = new Properties();
		props.load(new FileReader("configuration.properties"));
		Class.forName(props.getProperty("driver", "com.mysql.jdbc.Driver"));
		connection = DriverManager.getConnection(
				props.getProperty("url", "jdbc:mydql://localhost:3306/glarimy?user=root&password=admin"));
		saveOne = connection.prepareStatement("insert into employee (name, salary, permanent) values (?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		findOne = connection.prepareStatement("select * from employee where eid=?");
	}

	public static synchronized ReliableDirectory getInstance() throws Exception {
		if (INSTANCE == null)
			INSTANCE = new ReliableDirectory();
		return INSTANCE;
	}

	@Override
	public int save(Employee employee) {
		if (employee == null || employee.getName() == null || employee.getName().trim().length() == 0
				|| employee.getSalary() < 0)
			throw new InvalidEmployeeException();

		try {
			saveOne.setString(1, employee.getName());
			saveOne.setDouble(2, employee.getSalary());
			saveOne.setBoolean(3, employee.isPermanent());
			saveOne.executeUpdate();
			ResultSet keys = saveOne.getGeneratedKeys();
			keys.next();
			return keys.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DirectoryException();
		}
	}

	@Override
	public Employee find(int id) {
		try {
			findOne.setInt(1, id);
			ResultSet records = findOne.executeQuery();
			if (records.next()) {
				Employee employee = new Employee();
				employee.setId(records.getInt("eid"));
				employee.setName(records.getString("name"));
				employee.setSalary(records.getDouble("salary"));
				employee.setPermanent(records.getBoolean("permanent"));
				return employee;
			} else {
				throw new EmployeeNotFoundException();
			}
		} catch (Exception e) {
			throw new DirectoryException();
		}
	}
}
