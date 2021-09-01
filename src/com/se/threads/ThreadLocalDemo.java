package com.se.threads;

public class ThreadLocalDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		t1.start();
		t1.join();
		t2.start();
		
		
		

	}

}
