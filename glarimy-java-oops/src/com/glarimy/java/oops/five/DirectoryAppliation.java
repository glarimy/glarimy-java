package com.glarimy.java.oops.five;

public class DirectoryAppliation {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Krishna", 100, true);

		Directory directory = new Directory();
		directory.save(employee);
		
		Employee result = directory.find(1);
		System.out.println("ID: " + result.getId());
		System.out.println("Name: " + result.getName());
		System.out.println("Permaent: " + result.isPermanent());
		System.out.println("Salary: " + result.getSalary());
	}
}