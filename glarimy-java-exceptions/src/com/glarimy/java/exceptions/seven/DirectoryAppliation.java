package com.glarimy.java.exceptions.seven;

public class DirectoryAppliation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Directory directory = new ReliableDirectory();
		int id = 0;

		try {
			id = directory.save(new Employee("Krishna", 100, true));
			Employee result = directory.find(id);
		} catch (DirectoryException de) {
			de.printStackTrace();
		} finally {
			System.out.println("Thanks for using Directory!");
		}
	}
}