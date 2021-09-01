package com.ds.bt;

import java.util.*;
import java.util.stream.Collectors;

import com.se.inheritance.B;



public class Test extends B{
	
	{
		System.out.println("C");
	}
	
	static {
		System.out.println("D");
	}
	
	Test(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		
		int arr[] = {24, 2, 4, 233, 7667, 2, 23, 24, 4, 5, 4 };
		HashMap<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);





	}

	private static int doSomething(int value){
		try{
			System.out.println("try block");
			return value/10;
		}
		catch(Exception e){
			return value;
		}
		finally{
			System.out.println("finally block");
			return 100;

		}
	}


	

	

}
