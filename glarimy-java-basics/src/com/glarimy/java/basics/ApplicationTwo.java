package com.glarimy.java.basics;

import java.util.Scanner;

public class ApplicationTwo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter pincode: ");
		int pincode = Integer.parseInt(scanner.nextLine());
		System.out.println("Hello " + name + " of " + pincode);
	}
}
