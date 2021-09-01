package com.hacker.test;

import java.time.Instant;

public class BeautifulNumber {

	public static void main(String[] args) {
		int num = 36;
		int result = num;

		Instant instant = Instant.now();
		System.out.println(instant);
		
		while(result != 1 && result != 4) {
			result = isHappyNumber(result);
		}
		
		if(result == 1)
			System.out.println(num+ " is a happy number ");
		
		else if(result == 4)
			System.out.println(num+ " is not a happy number ");
		
		else
			System.out.println(result+ " logic is wrong");

	}
	
	
	public static int isHappyNumber(int num) {
		int rem=0, sum=0;
		
		while(num >0 ) {
			rem = num%10;
			sum = sum+(rem*rem);
			num = num/10;
		}
		
		return sum;
	}
	

}
