package com.se11.exam;

public class Test {

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        int n = arr.length;
        findElement(arr, n);
    }

    public static void findElement(int[] arr, int n){
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        leftMax[0] = Integer.MIN_VALUE;

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i-1] );
        }

        rightMin[n-1] = Integer.MAX_VALUE;

        for(int i= n-1; i>0; i--){
            rightMin[i-1] = Math.min(rightMin[i], arr[i]);
        }

       for(int i=n-1; i>0; i--){
           if(leftMax[i]<arr[i] && rightMin[i]>arr[i]){
               System.out.println(arr[i]);
           }
       }
    }
}
