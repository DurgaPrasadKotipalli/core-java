package com.se.arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		
		int arr[] = {1,3,0,0,4,0,9};
		

       int result[] = moveZeros(arr);
       
       for(int i=0; i<result.length; i++) {
    	   System.out.println(result[i]);
       }
		

	}
	
	public static int[] moveZeros(int arr[]) {
		
		int result[] = new int[arr.length];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				result[count]=arr[i];
				count++;
			}
		}
		
		/*
		while(count< arr.length) {
			result[count++] = 0;
		}
		*/
		return result;
		
	}

}
