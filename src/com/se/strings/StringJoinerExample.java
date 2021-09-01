package com.se.strings;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner str = new StringJoiner("-", "@", "!");
		str.add("Hyderabad");
		str.add("Vijaywada");
		str.add("Eluru");
		str.add("Gannavaram");
		System.out.println(str);
		
		
		

	}

}
