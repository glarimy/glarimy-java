package com.glarimy.java.oops.four;

public class Directory {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Krishna", 100, true);

		System.out.println("ID: " + employee.getId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Permaent: " + employee.isPermanent());
		System.out.println("Salary: " + employee.getSalary());
	}
}
