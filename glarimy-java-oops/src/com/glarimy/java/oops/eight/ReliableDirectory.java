package com.glarimy.java.oops.eight;

public class ReliableDirectory extends SimpleDirectory {
	@Override
	public int save(Employee employee) {
		if (employee == null || employee.getName() == null || employee.getName().trim().length() == 0
				|| employee.getSalary() < 0) {
			System.out.println("Invalid employee");
			return 0;
		} else
			return super.save(employee);
	}
}
