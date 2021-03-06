package com.glarimy.java.oops.ten;

public class ReliableDirectory extends AbstractDirectory {
	private static ReliableDirectory INSTANCE;
	private Employee[] entries;
	private static int ID;
	private int index;
	private static final int size = 10;

	private ReliableDirectory() {
		entries = new Employee[size];
	}

	public static ReliableDirectory getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ReliableDirectory();
		return INSTANCE;
	}

	@Override
	public int save(Employee employee) {
		if (super.isValid(employee)) {
			if (index < size) {
				employee.setId(++ID);
				entries[index] = employee;
				return employee.getId();
			} else {
				System.out.println("Directory is already filled");
				return 0;
			}
		} else {
			System.out.println("Invalid employee");
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
