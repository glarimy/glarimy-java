package com.glarimy.java.jdbc.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Application {

	public static void main(String[] args) throws Exception {
		int id = 234;
		String name = "Mohan";

		String sql = "insert into Directory (eid, name) values (" + id + ", '" + name + "')";

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/yodlee?user=root&password=admin");
		Statement statement = connection.createStatement();
		statement.execute(sql);
		statement.close();
		connection.close();
	}

}
