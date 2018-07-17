package com.glarimy.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Set<String> technologies = new TreeSet<>();
		Set<String> spring = new HashSet<>();
		spring.add("core");
		spring.add("aop");
		spring.add("data");
		spring.add("mvc");

		technologies.add("Java");
		technologies.add("JavaScript");
		technologies.add("HTML");
		technologies.add("CSS");
		technologies.add("JavaScript");

		int size = technologies.size();
		boolean empty = technologies.isEmpty();
		technologies.remove("Java");
		boolean contains = technologies.contains("Java");
		String[] array = technologies.toArray(new String[0]);
		technologies.addAll(spring);
	}
}