package com.glarimy.java.oops.seven;

public class SimpleDirectory implements Directory {
	private Employee[] entries;
	private static int ID;
	private int index;
	private static final int size = 10;

	public SimpleDirectory() {
		entries = new Employee[size];
	}

	@Override
	public int save(Employee employee) {
		if (index < size) {
			employee.setId(++ID);
			entries[index] = employee;
			return employee.getId();
		} else {
			System.out.println("Directory is already filled");
			return 0;
		}
	}

	@Override
	public Employee find(int id) {
		for (int i = 0; i < size && entries[i] != null; i++) {
			if (entries[i].getId() == id)
				return entries[i];
		}
		System.out.println("Employee not found!");
		return null;
	}
}