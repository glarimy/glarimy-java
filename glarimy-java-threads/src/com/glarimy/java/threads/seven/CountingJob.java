package com.glarimy.java.threads.seven;

public class CountingJob implements Runnable {
	private Counter counter;

	public CountingJob(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.print();
	}

}
