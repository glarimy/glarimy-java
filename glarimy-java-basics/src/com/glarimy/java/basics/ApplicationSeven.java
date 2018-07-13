package com.glarimy.java.basics;

public class ApplicationSeven {
	public static void main(String[] args) {
		int data[] = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;

		System.out.println("Count: " + data.length);
		System.out.print("Data: ");
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");

		for (int i = 0; i < data.length; i++)
			sum += data[i];

		System.out.println("\nSum: " + sum);

		int invertedData[] = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			invertedData[data.length - i - 1] = data[i];
		}
		System.out.print("Inverted Data: ");
		for (int i = 0; i < invertedData.length; i++)
			System.out.print(invertedData[i] + " ");
	}
}