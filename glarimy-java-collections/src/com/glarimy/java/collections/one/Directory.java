package com.glarimy.java.collections.one;

public interface Directory {
	int save(Employee employee) throws InvalidEmployeeException, DirectoryException;

	Employee find(int id) throws EmployeeNotFoundException, DirectoryException;
}