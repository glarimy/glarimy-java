package com.glarimy.java.jdbc.two;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Application {

	public static void main(String[] args) throws Exception {
		int id = 234;
		String name = "Mohan";

		String sql = "insert into Directory (eid, name) values (" + id + ", '" + name + "')";

		Properties properties = new Properties();
		properties.load(new FileReader("configuration.properties"));
		String driverName = properties.getProperty("driver");
		String url = properties.getProperty("url");
		Class.forName(driverName);
		Connection connection = DriverManager.getConnection(url);
		Statement statement = connection.createStatement();
		statement.execute(sql);
		statement.close();
		connection.close();
	}

}