package com.hacker.test;

import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		
		
		String str = "|**|*|*";
		List<Integer> startIndices = new ArrayList<>();
		startIndices.add(1);
		//startIndices.add(1);
		List<Integer> endIndices = new ArrayList<>();
		endIndices.add(6);
		//endIndices.add(6);
		Solution2 sol = new Solution2();
		
		System.out.println(" The number of items :: "+sol.numberOfItem(str, startIndices, endIndices));
		
		
		
	      

	}
	
	public int numberOfItem(String value, List<Integer> start, List<Integer> end){
		int startIndex =0, endIndex =0;
		for(int i=start.get(0)-1; i<end.get(0)-1; i++) {
			if( value.charAt(i) == '|') {
				startIndex = i;
				break;
			}
		}
		
		System.out.println("startIndex of | is "+startIndex);
		
		for(int i= end.get(0)-1; i>=start.get(0)-1; i--) {
			if(value.charAt(i) == '|') {
				endIndex = i;
				break;
			}
		}
		
		System.out.println("endIndex of | is "+endIndex);
		
		if(startIndex == endIndex) {
			return 0;
		}
		int count =0;
		
		for(int i=startIndex; i<endIndex; i++) {
			
			if(value.charAt(i) != '|') {
				count++;
			}
		}
		return count;
	}

}
