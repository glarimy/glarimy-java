package com.glarimy.java.exceptions.one;

public class ReliableDirectory implements Directory {
	private Employee[] entries;
	private static int ID;
	private int index;
	private static final int size = 10;

	public ReliableDirectory() {
		entries = new Employee[size];
	}

	@Override
	public int save(Employee employee) throws Exception {
		if (employee == null || employee.getName() == null || employee.getName().trim().length() == 0
				|| employee.getSalary() < 0)
			throw new Exception("Invalid Employee");
		if (index < size) {
			employee.setId(++ID);
			entries[index] = employee;
			return employee.getId();
		} else {
			throw new Exception("Insufficient Space");
		}
	}

	@Override
	public Employee find(int id) throws Exception {
		for (int i = 0; i < size && entries[i] != null; i++) {
			if (entries[i].getId() == id)
				return entries[i];
		}
		throw new Exception("Employee Not Found!");
	}
}
