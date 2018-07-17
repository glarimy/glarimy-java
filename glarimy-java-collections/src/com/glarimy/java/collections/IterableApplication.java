package com.glarimy.java.collections;

import java.util.ArrayList;
import java.util.List;

public class IterableApplication {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Krishna");
		names.add("Mohan");
		names.add("Koyya");
		names.add("Glarimy");
		
		for (String name : names)
			System.out.println(name);
	}
}