package com.glarimy.java.basics;

import java.util.Scanner;

public class ApplicationFive {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 25;
		System.out.print("Enter you option: 1) Square 2) Cube 3) Double > ");
		int option = Integer.parseInt(scanner.nextLine());

		switch (option) {
		case 1:
			System.out.println(number * number);
			break;
		case 2:
			System.out.println(number * number * number);
			break;
		case 3:
			System.out.println(number + number);
			break;
		default:
			System.out.println("Unsupported option!");
		}
	}
}
