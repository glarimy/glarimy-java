package com.glarimy.java.oops.eight;

public class DirectoryAppliation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Directory directory = new SimpleDirectory();
		
		int id = directory.save(new Employee("", 100, true));
		Employee result = directory.find(id);

		directory = new ReliableDirectory();

		id = directory.save(new Employee("", 100, true));
		result = directory.find(id);

		id = directory.save(new Employee("Krishna", 100, true));
		result = directory.find(id);
	}
}