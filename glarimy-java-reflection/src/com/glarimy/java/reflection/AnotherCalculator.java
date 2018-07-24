package com.glarimy.java.reflection;

public class AnotherCalculator implements ICalculator {
	private static AnotherCalculator INSTANCE;
	private ILogger logger;

	private AnotherCalculator() {
	}

	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	public static AnotherCalculator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new AnotherCalculator();
		return INSTANCE;
	}

	public int add(int first, int second) {
		logger.log("adding numbers");
		return first + second;
	}

	@Override
	public int multiply(int first, int second) {
		logger.log("Multiplying");
		return first * second;
	}

}
