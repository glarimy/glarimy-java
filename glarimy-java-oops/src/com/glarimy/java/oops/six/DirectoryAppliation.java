package com.glarimy.java.oops.six;

public class DirectoryAppliation {
	public static void main(String[] args) {
		Employee employee = new Employee("Krishna", 100, true);

		Directory directory = new Directory();
		int id = directory.save(employee);

		System.out.println("New employee is issued ID: " + id);

		Employee result = directory.find(id);
		System.out.println("ID: " + result.getId());
		System.out.println("Name: " + result.getName());
		System.out.println("Permaent: " + result.isPermanent());
		System.out.println("Salary: " + result.getSalary());
	}
}