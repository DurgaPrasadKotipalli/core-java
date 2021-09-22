package com.se.arrays;

import java.util.*;


interface A{
	
	default void wish() {
		System.out.println("A Hello");
	}
}

class B {
	protected int j = 12;
	
	public void wish() {
		System.out.println("B Hello ");
	}
}
public class myTest extends B implements A{

	public static void main(String[] args) throws InterruptedException {


		myTest obj[][] = new myTest[3][];
		//System.out.println(obj[2][0].toString());

		// create a list
		List<String> list = Arrays.asList("Hello ",
				"G", "E", "E", "K", "S!");
        boolean value = list.stream().allMatch((x -> x.equals("E")));
		System.out.println("value = " + value);
		// using parallelStream()
		// method for parallel stream
		list.stream().forEach(System.out::print);

		HashMap<Integer, Integer> hm = new HashMap<>();
		
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.putIfAbsent(1, 40);
		
		
		
		
		System.out.println(hm);
	
		
		
		
		

	}
	
	@Override
	public void wish() {
		A.super.wish();
	}

}
