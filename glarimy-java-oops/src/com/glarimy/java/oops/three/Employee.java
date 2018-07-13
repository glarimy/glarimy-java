package com.glarimy.java.oops.three;

public class Employee {
	int id;
	String name;
	double salary;
	boolean permanent;

	public Employee() {
		salary = 100;
	}

	public Employee(int id, String name, double salary, boolean permanent) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.permanent = permanent;
	}

}
