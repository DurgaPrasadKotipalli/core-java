package com.se.dp;

public class NthStore {

	public static void main(String[] args) {

		int n = 4;
		System.out.println("Number of ways to reach top : " + countWaysOfStairCase(n));

	}

	static int countWaysOfStairCase(int s) {
		return fib(s+1);
	}

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n -1 ) + fib(n - 2);
	}

}
