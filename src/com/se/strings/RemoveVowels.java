package com.se.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RemoveVowels {

	public static void main(String[] args) {
		String value = "India";
		
		System.out.println(removeVowels(value));

	}
	
	
	public static String removeVowels(String str) {
		char chars[] = str.toCharArray();
		
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<chars.length; i++) {
			
			if(!vowels.contains(str.charAt(i))) {
				sb = sb.append(str.charAt(i));
			}
			
		}
		return sb.toString();
	}

}
