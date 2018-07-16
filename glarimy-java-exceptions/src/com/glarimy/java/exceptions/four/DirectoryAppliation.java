package com.glarimy.java.exceptions.four;

public class DirectoryAppliation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Directory directory = new ReliableDirectory();
		int id = 0;

		try {
			id = directory.save(new Employee("", 100, true));
		} catch (DirectoryException de) {
			de.printStackTrace();
		}

		try {
			Employee result = directory.find(id);
		} catch (DirectoryException de) {
			de.printStackTrace();
		}
	}
}