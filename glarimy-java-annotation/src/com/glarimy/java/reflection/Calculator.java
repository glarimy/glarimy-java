package com.glarimy.java.reflection;

public class Calculator implements ICalculator {
	@Override
	public int add(int first, int second){
		return first+second;
	}
	
	@Override
	public int multiply(int first, int second){
		return first*second;
	}
}
