package com.glarimy.java.io;

import java.io.File;

public class ApplicationOne {

	public static void main(String[] args) {
		File file = new File("testfile.txt");
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Is a directory? " + file.isDirectory());
		System.out.println("Size: " + file.length());

		File directory = new File("temp");
		if (directory.exists())
			directory.delete();
		directory.mkdir();
	}

}
