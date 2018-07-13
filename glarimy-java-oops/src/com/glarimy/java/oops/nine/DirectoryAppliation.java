package com.glarimy.java.oops.nine;

public class DirectoryAppliation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Directory directory = new ReliableDirectory();

		int id = directory.save(new Employee("", 100, true));
		Employee result = directory.find(id);

		id = directory.save(new Employee("Krishna", 100, true));
		result = directory.find(id);
	}
}