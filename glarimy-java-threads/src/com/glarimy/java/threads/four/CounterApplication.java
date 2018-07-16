package com.glarimy.java.threads.four;

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
		try {
			thread.join();
			System.out.println("Thread: " + Thread.currentThread().getName() + " => Completed job!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
