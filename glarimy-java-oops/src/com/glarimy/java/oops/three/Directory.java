package com.glarimy.java.oops.three;

public class Directory {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Krishna", 100, true);

		System.out.println("ID: " + employee.id);
		System.out.println("Name: " + employee.name);
		System.out.println("Permaent: " + employee.permanent);
		System.out.println("Salary: " + employee.salary);
	}
}
