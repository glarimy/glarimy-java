package com.glarimy.java.servlets.directory.api;

public interface Directory {
	int save(Employee employee) throws InvalidEmployeeException, DirectoryException;

	Employee find(int id) throws EmployeeNotFoundException, DirectoryException;
}