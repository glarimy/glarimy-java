package com.glarimy.java.threads.two;

public class CounterApplication {

	public static void main(String[] args) {
		Thread thread = new Counter();
		thread.start();
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Submitted job!");
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Completed job!");
	}

}
