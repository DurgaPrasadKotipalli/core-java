package com.se.gc;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println(rt.totalMemory());
		System.out.println(rt.freeMemory());
		System.out.println();
		for(int i=1; i<=1000; i++) {
			Date d = new Date();
			d = null;
		}
		
		System.out.println(rt.freeMemory());
		rt.gc();
		System.out.println(rt.freeMemory());

	}

}
