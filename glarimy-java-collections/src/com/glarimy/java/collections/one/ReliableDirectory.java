package com.glarimy.java.collections.one;

import java.util.ArrayList;
import java.util.List;

public class ReliableDirectory implements Directory {
	private List<Employee> entries;
	private static int ID;

	public ReliableDirectory() {
		entries = new ArrayList<>();
	}

	@Override
	public int save(Employee employee) throws InvalidEmployeeException, DirectoryException {
		if (employee == null || employee.getName() == null || employee.getName().trim().length() == 0
				|| employee.getSalary() < 0)
			throw new InvalidEmployeeException();
		employee.setId(++ID);
		entries.add(employee);
		return employee.getId();
	}

	@Override
	public Employee find(int id) throws EmployeeNotFoundException, DirectoryException {
		for (Employee employee : entries) {
			if (employee.getId() == id)
				return employee;
		}
		throw new EmployeeNotFoundException();
	}
}
