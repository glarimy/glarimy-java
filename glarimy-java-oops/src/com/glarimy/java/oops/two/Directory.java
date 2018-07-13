package com.glarimy.java.oops.two;

public class Directory {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 1;
		employee.name = "Krishna";
		employee.permanent = true;

		System.out.println("ID: " + employee.id);
		System.out.println("Name: " + employee.name);
		System.out.println("Permaent: " + employee.permanent);
		System.out.println("Salary: " + employee.salary);
	}
}
