package com.se.strings;

public class equalsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		
		if(str1 == str2) {
			System.out.println("both are pointing are same reference");
		}
		
		if(str1.equals(str2)) {
			System.out.println("both are equal");
		}
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

	}

}
