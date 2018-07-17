package com.glarimy.java.io;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 9181794692207636636L;
	private int id;
	private String name;
	private double salary;
	private boolean permanent;

	public Employee() {
		salary = 100;
	}

	public Employee(String name, double salary, boolean permanent) {
		this.name = name;
		this.salary = salary;
		this.permanent = permanent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent + "]";
	}

}
