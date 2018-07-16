package com.glarimy.java.exceptions.two;

public interface Directory {
	int save(Employee employee) throws InvalidEmployeeException, InsufficientSpaceException;

	Employee find(int id) throws EmployeeNotFoundException;
}