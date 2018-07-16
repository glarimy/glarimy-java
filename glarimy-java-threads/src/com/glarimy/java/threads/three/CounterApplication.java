package com.glarimy.java.threads.three;

public class CounterApplication {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("Thread: " + Thread.currentThread().getName() + " => " + i);
				}
			}

		});
		
		thread.start();
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Submitted job!");
		System.out.println("Thread: " + Thread.currentThread().getName() + " => Completed job!");
	}

}
