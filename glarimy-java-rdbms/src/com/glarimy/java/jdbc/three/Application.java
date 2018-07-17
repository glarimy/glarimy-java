package com.glarimy.java.jdbc.three;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Application {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.load(new FileReader("configuration.properties"));
		String driverName = properties.getProperty("driver");
		String url = properties.getProperty("url");
		Class.forName(driverName);
		Connection connection = DriverManager.getConnection(url);
		Statement statement = connection.createStatement();

		// inserting a record
		int id = 123;
		String name = "Krishna";

		String sql = "insert into Directory (eid, name) values (" + id + ", '" + name + "')";
		statement.execute(sql);

		id = 234;
		name = "Mohan";
		sql = "insert into Directory (eid, name) values (" + id + ", '" + name + "')";
		statement.execute(sql);

		// reading all records
		System.out.println("All Records:");
		sql = "select * from Directory";
		ResultSet records = statement.executeQuery(sql);
		while (records.next()) {
			System.out.print("ID: " + records.getInt("eid"));
			System.out.println(" Name: " + records.getString("name"));
		}

		// reading a record
		System.out.println("Krishna's record");
		sql = "select * from Directory where eid=" + 123;
		records = statement.executeQuery(sql);
		while (records.next()) {
			System.out.print("ID: " + records.getInt("eid"));
			System.out.println(" Name: " + records.getString("name"));
		}

		// deleting a record
		sql = "delete from Directory";
		statement.execute(sql);

		statement.close();
		connection.close();
	}

}