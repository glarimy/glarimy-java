package com.glarimy.java.jdbc.five;

public interface Directory {
	int save(Employee employee) throws InvalidEmployeeException, DirectoryException;

	Employee find(int id) throws EmployeeNotFoundException, DirectoryException;
}