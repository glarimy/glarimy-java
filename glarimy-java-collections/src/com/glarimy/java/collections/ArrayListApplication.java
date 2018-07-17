package com.glarimy.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> technologies = new ArrayList<>();
		List<String> spring = new ArrayList<>();
		spring.add("core");
		spring.add("aop");
		spring.add("data");
		spring.add("mvc");

		technologies.add("Java");
		technologies.add("JavaScript");
		technologies.add("HTML");
		technologies.add("CSS");

		int size = technologies.size();
		boolean empty = technologies.isEmpty();
		List<String> sublist = technologies.subList(1, 3);
		int index = technologies.indexOf("Java");
		String first = technologies.get(0);
		technologies.remove("Java");
		boolean contains = technologies.contains("Java");
		String[] array = technologies.toArray(new String[0]);
		technologies.addAll(spring);
	}
}