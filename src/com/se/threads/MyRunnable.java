package com.se.threads;

public class MyRunnable implements Runnable {

	ThreadLocal<Integer> threadLocal = new ThreadLocal() {
		protected Integer initialValue() {
			return 0;
		}
	};
	
	int  count = 0;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			threadLocal.set(threadLocal.get() + 1);
			//++count;
			System.out.println(Thread.currentThread().getName() + " count " +threadLocal.get());
		}
	}

}
