package com.glarimy.java.jdbc.four;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		PreparedStatement insert = connection.prepareStatement("insert into Directory (eid, name) values (?,?)");
		PreparedStatement readAll = connection.prepareStatement("select * from Directory");
		PreparedStatement readOne = connection.prepareStatement("select * from Directory where eid=?");
		PreparedStatement delete = connection.prepareStatement("delete from Directory");
		
		// inserting a record
		int id = 123;
		String name = "Krishna";

		insert.setInt(1, id);
		insert.setString(2, name);
		insert.execute();

		id = 234;
		name = "Mohan";
		insert.setInt(1, id);
		insert.setString(2, name);
		insert.execute();

		// reading all records
		System.out.println("All Records:");
		ResultSet records = readAll.executeQuery();
		while (records.next()) {
			System.out.print("ID: " + records.getInt("eid"));
			System.out.println(" Name: " + records.getString("name"));
		}

		// reading a record
		System.out.println("Krishna's record");
		readOne.setInt(1, 123);
		records = readOne.executeQuery();
		while (records.next()) {
			System.out.print("ID: " + records.getInt("eid"));
			System.out.println(" Name: " + records.getString("name"));
		}

		// deleting a record
		delete.execute();

		connection.close();
	}

}