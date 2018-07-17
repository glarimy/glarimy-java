package com.glarimy.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ApplicationThree {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("testfile.txt"));
		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
		BufferedWriter writer = new BufferedWriter(new FileWriter("testfile.txt", true));
		writer.write("\nHave a great day!");
		writer.close();
	}

}
