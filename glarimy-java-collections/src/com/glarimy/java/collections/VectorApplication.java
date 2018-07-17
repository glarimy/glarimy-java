package com.glarimy.java.collections;

import java.util.List;
import java.util.Vector;

public class VectorApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> technologies = new Vector<>();
		List<String> spring = new Vector<>();
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