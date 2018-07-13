package com.glarimy.java.oops.five;

public class Directory {
	private Employee[] entries;
	private int index;
	private int size = 10;

	public Directory() {
		entries = new Employee[size];
	}

	public void save(Employee employee) {
		if (index < size) {
			entries[index] = employee;
		} else {
			System.out.println("Directory is already filled");
		}
	}

	public Employee find(int id) {
		for (int i = 0; i < size && entries[i] != null; i++) {
			if (entries[i].getId() == id)
				return entries[i];
		}
		System.out.println("Employee not found!");
		return null;
	}
}