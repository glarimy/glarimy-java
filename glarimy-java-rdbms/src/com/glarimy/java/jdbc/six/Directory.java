package com.glarimy.java.jdbc.six;

public interface Directory {
	int save(Employee employee) throws InvalidEmployeeException, DirectoryException;

	Employee find(int id) throws EmployeeNotFoundException, DirectoryException;
}