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
        /*
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Optional<Integer> any = list.stream().filter(x -> x > 1).findAny();
		if (any.isPresent()) {
			Integer result = any.get();
			//System.out.println(result);
		}
		
		*/
		
		myTest obj[][] = new myTest[3][];
		//System.out.println(obj[2][0].toString());
		
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
