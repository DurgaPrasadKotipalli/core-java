package com.se.arrays;


abstract class myclass{
	myclass(){
		
	}
}

public class TestArrayContains {

	public static void main(String[] args) {
		
		String[] values = { "AB", "BC", "CD", null };
		String testValue = null;
		boolean contains = contains(values, testValue);
		System.out.println("Does Array  contains value " + testValue + " is " + contains);

	}
	
	
	public static boolean contains(Object array[], String value) {
		
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(value)) {
				return true;
			}
		}
		
		return false;
	}

}
