package com.glarimy.java.jdbc.six;

public class DirectoryAppliation {
	public static void main(String[] args) throws Exception {
		Directory directory = new ReliableDirectory();
		int id = 0;

		try {
			id = directory.save(new Employee("Krishna", 100, true));
			Employee result = directory.find(id);
			System.out.println(result);
		} catch (DirectoryException de) {
			de.printStackTrace();
		} finally {
			System.out.println("Thanks for using Directory!");
		}
	}
}