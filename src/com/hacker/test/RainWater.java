package com.hacker.test;

public class RainWater {

	static int array[] = new int[] { 5, 3, 4, 6, 3, 6 };

	public static void main(String[] args) {
		System.out.println("Maximum water " + findWater(array.length));
	}

	static int findWater(int n) {
		int maxLeft[] = new int[n];

		int maxRight[] = new int[n];

		int water = 0;

		maxLeft[0] = array[0];
		for (int i = 1; i < n; i++)
			maxLeft[i] = Math.max(maxLeft[i - 1], array[i]);

		maxRight[n - 1] = array[n - 1];
		for (int i = n - 2; i >= 0; i--)
			maxRight[i] = Math.max(maxRight[i + 1], array[i]);

		for (int i = 0; i < n; i++)
			water += Math.min(maxLeft[i], maxRight[i]) - array[i];

		return water;
	}

}
