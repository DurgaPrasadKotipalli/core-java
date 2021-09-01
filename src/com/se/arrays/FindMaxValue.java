package com.se.arrays;


// Max value in an array of increasing and then decreasing order
// array can be in increasing order
// array can be in decreasing order
// array in increasing and decreasing order
public class FindMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {6,9,15,25, 35,47, 50, 41, 29, 23, 8 , 6};
      
      int maxValue = FindMaxValue.findMaxValueIn(arr, 0, arr.length-1);
      
      System.out.println("max value is "+maxValue);
	}
	
	public static int findMaxValueIn(int arr[], int start, int end) {
		
		if(start == end) {
			return arr[start];
		}
		
		if(start+1 == end) {
			if(arr[start] > arr[end]) {
				return arr[start];
			}else {
				return arr[end];
			}
		}
		
		int mid = (start+end)/2;
		
        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
        	return arr[mid];
        }
        
        if(arr[mid]> arr[mid+1] && arr[mid] < arr[mid-1]){
        	return findMaxValueIn(arr, start, mid-1);
        }else {
        	return findMaxValueIn(arr, mid+1, end);
        }
	}

}
