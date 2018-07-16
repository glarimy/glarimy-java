package com.glarimy.java.threads.six;

public class Counter implements Runnable {
	private int limit;
	private long interval;

	public Counter(int limit, long interval) {
		this.limit = limit;
		this.interval = interval;
	}

	@Override
	public void run() {
		for (int i = 0; i < limit; i++) {
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {

			}
			System.out.println("Thread: " + Thread.currentThread().getName() + " => " + i);
		}
	}

}
