package com.glarimy.java.exceptions.six;

public class ReliableDirectory implements Directory {
	private Employee[] entries;
	private static int ID;
	private int index;
	private static final int size = 10;

	public ReliableDirectory() {
		entries = new Employee[size];
	}

	@Override
	public int save(Employee employee) throws InvalidEmployeeException, DirectoryException {
		if (employee == null || employee.getName() == null || employee.getName().trim().length() == 0
				|| employee.getSalary() < 0)
			throw new InvalidEmployeeException();
		if (index < size) {
			employee.setId(++ID);
			entries[index] = employee;
			return employee.getId();
		} else {
			throw new DirectoryException();
		}
	}

	@Override
	public Employee find(int id) throws EmployeeNotFoundException, DirectoryException {
		for (int i = 0; i < size && entries[i] != null; i++) {
			if (entries[i].getId() == id)
				return entries[i];
		}
		throw new EmployeeNotFoundException();
	}
}
