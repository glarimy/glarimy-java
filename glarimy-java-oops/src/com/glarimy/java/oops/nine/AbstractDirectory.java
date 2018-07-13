package com.glarimy.java.oops.nine;

public abstract class AbstractDirectory implements Directory {
	public boolean isValid(Employee employee) {
		if (employee == null || employee.getName() == null || employee.getName().trim().length() == 0
				|| employee.getSalary() < 0)
			return false;
		return true;
	}

	public abstract int save(Employee employee);

	public abstract Employee find(int id);
}
