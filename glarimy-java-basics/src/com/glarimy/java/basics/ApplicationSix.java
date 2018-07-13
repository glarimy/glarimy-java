package com.glarimy.java.basics;

public class ApplicationSix {
	public static void main(String[] args) {
		int number = 25;
		while (number > 0)
			System.out.print(number-- + " ");
		System.out.println();
		while (number < 25)
			System.out.print(number++ + " ");
		System.out.println();
		
		for (int index = 0; index < 25; index++) {
			System.out.print(index + " ");
		}
	}
}
