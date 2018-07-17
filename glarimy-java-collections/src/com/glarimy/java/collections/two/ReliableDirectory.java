package com.glarimy.java.collections.two;

import java.util.HashMap;
import java.util.Map;

public class ReliableDirectory implements Directory {
	private Map<Integer, Employee> entries;
	private static int ID;

	public ReliableDirectory() {
		entries = new HashMap<>();
	}

	@Override
	public int save(Employee employee) throws InvalidEmployeeException, DirectoryException {
		if (employee == null || employee.getName() == null || employee.getName().trim().length() == 0
				|| employee.getSalary() < 0)
			throw new InvalidEmployeeException();
		employee.setId(++ID);
		entries.put(employee.getId(), employee);
		return employee.getId();
	}

	@Override
	public Employee find(int id) throws EmployeeNotFoundException, DirectoryException {
		Employee employee = entries.get(id);
		if (employee == null)
			throw new EmployeeNotFoundException();
		return employee;
	}
}
