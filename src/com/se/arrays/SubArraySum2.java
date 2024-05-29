package com.se.arrays;

public class SubArraySum2 {

    // Function to find the Smallest Subarray with
    // Sum K from an Array
    static int smallestSubarraySumK(int[] arr, int k)
    {
        int result = Integer.MAX_VALUE;
        System.out.println("max value "+result);

        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum == k){
                    result = Math.min(result, (j-i+1));
                }
            }
        }
        return result;
    }

    public static void main (String[] args) {

        int[] arr = { 2, 4, 6, 10, 2, 1};
        int k = 12;

        int result = smallestSubarraySumK(arr, k);
        if (result == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(result);
    }
}
