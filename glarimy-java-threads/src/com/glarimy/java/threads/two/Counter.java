package com.glarimy.java.threads.two;

public class Counter extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " => " + i);
		}
	}

}
