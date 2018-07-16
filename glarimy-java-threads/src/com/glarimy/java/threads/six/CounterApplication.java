package com.glarimy.java.threads.six;

public class CounterApplication {

	public static void main(String[] args) throws Exception {
		Thread thread = new Thread(new Counter(25, 1000));
		thread.start();
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Submitted job!");
		thread.join();
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Completed job!");
	}

}
