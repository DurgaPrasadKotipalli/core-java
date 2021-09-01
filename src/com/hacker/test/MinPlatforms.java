package com.hacker.test;

import java.util.Arrays;

public class MinPlatforms {

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1020, 1130, 1900, 2000 };
		int n = 6;
		System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));

	}

	// Returns minimum number of platforms reqquired
	public static int findPlatform(int array[], int departure[], int n) {

		// plat_needed indicates number of platforms
		// needed at a time
		Arrays.sort(array);
		Arrays.sort(departure);

		int plat_needed = 1, maxPlatform = 1;
		int i = 1, j = 0;

		while (i < n && j < n) {

			if (array[i] <= departure[j]) {
				plat_needed++;
				i++;
				if (plat_needed > maxPlatform)
					maxPlatform = plat_needed;
			} else if (array[i] > departure[j]) {
				plat_needed--;
				j++;
			}

		}

		return maxPlatform;
	}

}
