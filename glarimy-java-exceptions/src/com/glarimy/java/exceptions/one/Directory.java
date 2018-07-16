package com.glarimy.java.exceptions.one;

public interface Directory {
	int save(Employee employee) throws Exception;

	Employee find(int id) throws Exception;
}