package com.glarimy.java.io;

import java.io.FileReader;
import java.io.FileWriter;

public class ApplicationTwo {

	public static void main(String[] args) throws Exception {
		final int EOF = -1;
		FileReader reader = new FileReader("testfile.txt");
		int c;
		while ((c = reader.read()) != EOF)
			System.out.print((char) c);
		reader.close();

		FileWriter writer = new FileWriter("testfile.txt", true);
		writer.write("\n");
		writer.write("Hope you would enjoy it");
		writer.close();
	}

}
