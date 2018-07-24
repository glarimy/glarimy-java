package com.glarimy.java.reflection;

public class SimpleLogger implements ILogger {
	@Override
	public void log(String message) {
		System.out.println(message);
	}
}
