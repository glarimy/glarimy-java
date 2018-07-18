package com.glarimy.java.servlets.directory.service;

import com.glarimy.java.servlets.directory.api.Directory;
import com.glarimy.java.servlets.directory.api.DirectoryException;
import com.glarimy.java.servlets.directory.api.Employee;
import com.glarimy.java.servlets.directory.api.EmployeeNotFoundException;
import com.glarimy.java.servlets.directory.api.InvalidEmployeeException;
import com.glarimy.java.servlets.directory.data.EmployeeDAO;

public class ReliableDirectory implements Directory {
	private EmployeeDAO dao;

	public ReliableDirectory() throws Exception {
		dao = new EmployeeDAO();
	}

	@Override
	public int save(Employee employee) {
		if (employee == null || employee.getName() == null || employee.getName().trim().length() == 0
				|| employee.getSalary() < 0)
			throw new InvalidEmployeeException();
		try {
			return dao.create(employee);
		} catch (Exception e) {
			throw new DirectoryException();
		}
	}

	@Override
	public Employee find(int id) {
		try {
			Employee employee = dao.read(id);
			if (employee != null)
				return employee;
			else
				throw new EmployeeNotFoundException();
		} catch (Exception e) {
			throw new DirectoryException();
		}
	}
}
