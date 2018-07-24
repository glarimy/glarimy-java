package com.glarimy.java.reflection;

public class QueryApplication {
	public static void main(String[] args) throws Exception {
		SimpleQueryGenerator generator = new SimpleQueryGenerator();
		Book book = new Book();
		book.setIsbn(123);
		book.setTitle("Java Reflection");
		String query = generator.getSaveQuery(book);
		System.out.println(query);
	}
}
