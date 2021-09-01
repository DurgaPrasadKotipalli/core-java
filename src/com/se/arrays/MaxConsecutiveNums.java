package com.se.arrays;

import java.util.HashSet;

public class MaxConsecutiveNums {

	public static void main(String[] args) {
		 int arr[] = {1, 94, 93, 1000, 5, 92, 78};
		 int n = arr.length;
		 System.out.println(findLongestConseqSubseq(arr, n));

	}
	
	
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   int ans =0;
	   
	   HashSet<Integer> nums = new HashSet<>();
	   for(int i=0; i<arr.length; i++) {
		   nums.add(arr[i]);
	   }
		
	   for(int value: arr) {
		 //  nums.add(value);
	   }
	   
	   if(arr.length == 0) {
		   return 0;
	   }
	   
	   if(arr.length == 1) {
		   return arr[0];
	   }
	   
	   for(int i=0; i<arr.length; i++) {
		   if(nums.contains(arr[i])) {
			   int j  = arr[i];
			   
			   while(nums.contains(j)) {
				   j++;
			   }
			   
			   ans = Math.max(ans, j-arr[i]);
		   }
	   }
		return ans;
	}
	 

}
