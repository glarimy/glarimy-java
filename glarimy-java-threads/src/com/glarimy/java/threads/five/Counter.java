package com.glarimy.java.threads.five;

public class Counter implements Runnable {
	private int limit;

	public Counter(int limit) {
		this.limit = limit;
	}

	@Override
	public void run() {
		for (int i = 0; i < limit; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " => " + i);
		}
	}

}
