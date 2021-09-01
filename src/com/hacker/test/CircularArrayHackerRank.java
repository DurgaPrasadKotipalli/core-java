package com.hacker.test;

public class CircularArrayHackerRank {

	public static void main(String[] args) {
		
		String inputArray[] = {"aaa", "bbb", "ccc", "ddd", "eee", "fff"};
		
		int distance = solution(inputArray, 1, "fff");
		
		System.out.println("shortest distrance is "+distance);
		
    }
	
	private static int solution(String[] input, int startPositon, String target) {
		
		int forwardCount =0;
		int backwardCount = 0;
		
		boolean found=false;
		
	    if(input[startPositon] == target) {
			return 0;
		}
		int pos = startPositon;
		while(!found) {
			pos++;
			if(pos>input.length) {
				pos = 0;
			}
			
			if(input[pos] != target ) {
				forwardCount++;
			}else {
				forwardCount++;
				found = true;
			}
		}
		
		
		found = false;
		pos = startPositon;
		while(!found) {
			pos--;
			if(pos<0) {
				pos = input.length-1;
			}
			
			if(input[pos] != target ) {
				backwardCount++;
			}else {
				backwardCount++;
				found = true;
			}
		}
		
		System.out.println("forward count "+forwardCount);
		System.out.println("backward Count "+backwardCount);
		return forwardCount>backwardCount ? backwardCount : forwardCount;
	}

}
