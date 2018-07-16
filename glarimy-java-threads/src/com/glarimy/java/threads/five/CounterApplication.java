package com.glarimy.java.threads.five;

public class CounterApplication {

	public static void main(String[] args) throws Exception {
		Thread thread = new Thread(new Counter(25));
		thread.start();
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Submitted job!");
		thread.join();
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Completed job!");
	}

}
