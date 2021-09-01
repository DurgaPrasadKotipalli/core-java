package com.se.employee;

import java.util.HashMap;
import java.util.Map;

public class ThreadDemo {

	public static void main(String[] args) {
		
		/*
		Runnable r = () -> {
			for(int i=0; i<5; i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
		
		*/
		
		Map m = new HashMap();
		m.put("A", "B");
		m.put("A", m.put("A", "C"));
		System.out.println(m.get("A"));
				

	}
	
	static class MyTestClass{
		public void sum() {
			System.out.println(" it is static class method");
		}
	}

}
