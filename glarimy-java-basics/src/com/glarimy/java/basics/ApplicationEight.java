package com.glarimy.java.basics;

public class ApplicationEight {
	public static int countOf(int[] data) {
		return data.length;
	}

	public static int sumOf(int[] data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++)
			sum += data[i];
		return sum;
	}

	public static int[] reverseOf(int[] data) {
		int invertedData[] = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			invertedData[data.length - i - 1] = data[i];
		}
		return invertedData;
	}

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("COUNT: " + countOf(array));
		System.out.println("SUM: " + sumOf(array));
		System.out.println("Original Array: ");
		print(array);
		System.out.println("Inverted Array: ");
		print(reverseOf(array));
	}
}