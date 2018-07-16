package com.glarimy.java.threads.one;

import com.glarimy.java.threads.two.Counter;

public class CounterApplication {

	public static void main(String[] args) {
		Thread thread = new Thread(new Counter());
		thread.start();
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Submitted job!");
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Completed job!");
	}

}
