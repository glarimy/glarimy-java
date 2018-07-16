package com.glarimy.java.threads.seven;

public class Counter {
	private int number;

	public void print() {
		for (int i = 0; i < 25; i++) {
			try {
				Thread.sleep(100);
				System.out.println("Thread: " + Thread.currentThread().getName() + " => " + number++);
				//notify();
			} catch (InterruptedException e) {

			}
		}
	}
}
