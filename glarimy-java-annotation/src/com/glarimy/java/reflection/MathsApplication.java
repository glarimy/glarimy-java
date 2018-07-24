package com.glarimy.java.reflection;

public class MathsApplication {
	public static void main(String[] args) throws Exception {
		ICalculator calc = (ICalculator) ObjectFactory.get("calculator");
		int sum = calc.add(1, 4);
		System.out.println(sum);
	}
}
