package com.se.arrays;

import java.util.HashMap;

public class SubArrayExceedingSum {

	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 10, 2, 1};
		int n = arr.length;

		int K = 12;

		int len = subArraylen(arr, n, K);

		if (len == Integer.MAX_VALUE)
		{
			System.out.print("-1");
		}
		else
		{
			System.out.print(len + "\n");
		}

	}
	
	

	// Function to find the length of the
	// smallest subarray with sum K
	static int subArraylen(int arr[], int n, int K)
	{
		// Stores the frequency of
		// prefix sums in the array
		HashMap<Integer,
				Integer> mp = new HashMap<Integer,
											Integer>();

		mp.put(arr[0], 0);

		for (int i = 1; i < n; i++)
		{
			arr[i] = arr[i] + arr[i - 1];
			mp.put(arr[i], i);
		}
		
		System.out.println("Hash map : "+mp);

		// Initialize len as Integer.MAX_VALUE
		int len = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++)
		{

			// If sum of array till i-th
			// index is less than K
			if (arr[i] < K) {

				// No possible subarray
				// exists till i-th index
				continue;
			}
			else
			{

				// Find the exceeded value
				int x = K - arr[i];

				// If exceeded value is zero
				if (x == 0)
					len = Math.min(len, i);

				if (mp.containsValue(x))
					continue;
				else
				{
					len = Math.min(len, i );
				}
			}
		}
		return len;
	}

	
	


}
