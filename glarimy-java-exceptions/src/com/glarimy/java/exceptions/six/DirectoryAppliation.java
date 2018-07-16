package com.glarimy.java.exceptions.six;

public class DirectoryAppliation {
	@SuppressWarnings("unused")
	public static void main(String[] args)  {
		Directory directory = new ReliableDirectory();
		int id = 0;

		id = directory.save(new Employee("", 100, true));
		Employee result = directory.find(id);
	}
}