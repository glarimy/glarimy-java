package com.glarimy.java.threads.seven;

public class CounterApplication {
	public static void main(String[] args) throws Exception {
		Counter counter = new Counter();
		Thread first = new Thread(new CountingJob(counter));
		Thread second = new Thread(new CountingJob(counter));
		first.start();
		second.start();
	}
}
