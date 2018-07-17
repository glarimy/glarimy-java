package com.glarimy.java.collections;

import java.util.StringTokenizer;

public class StringTokenizerApplication {

	public static void main(String[] args) {
		String address = "Glarimy Technology Services, Bengaluru";

		StringTokenizer st = new StringTokenizer(address, ", ");
		System.out.println("Number of tokens: " + st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}