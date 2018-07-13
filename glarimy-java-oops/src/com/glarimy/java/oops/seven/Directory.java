package com.glarimy.java.oops.seven;

/**
 * Directory stores and finds employees
 * @author glarimy
 *
 */
public interface Directory {
	/**
	 * Stores an employee if the space is avaiable
	 * @param employee new employee
	 * @return id associated with the new employee or 0 if there no space
	 */
	int save(Employee employee);

	/**
	 * 
	 * @param id
	 * @return
	 */
	Employee find(int id);
}