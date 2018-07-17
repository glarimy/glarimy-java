package com.glarimy.java.jdbc.five;

public class DirectoryAppliation {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		Directory directory = ReliableDirectory.getInstance();
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