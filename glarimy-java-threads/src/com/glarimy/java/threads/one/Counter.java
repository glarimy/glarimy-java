package com.glarimy.java.threads.one;

public class Counter implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " => " + i);
		}
	}

}
