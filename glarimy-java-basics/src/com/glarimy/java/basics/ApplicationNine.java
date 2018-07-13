package com.glarimy.java.basics;

public class ApplicationNine {
	public static void fibonacci(int number) {
		int previous = 0;
		int current = 1;
		int next;
		System.out.print(previous + " " + current);

		for (int i = 2; i < number; ++i) {
			next = previous + current;
			previous = current;
			current = next;
			System.out.print(" " + current);
		}
	}

	public static void main(String[] args) {
		int number = 25;
		fibonacci(number);
	}
}