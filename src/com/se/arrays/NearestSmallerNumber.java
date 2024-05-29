package com.se.arrays;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 6, 4, 10, 2, 1 };
        int n = arr.length;
        int result[] = printPrevSmaller2(arr, n);
        System.out.println(Arrays.toString(result));
    }


    public static int[] printPrevSmaller2(int arr[], int n){
        int result[] = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++){
            while(!s.empty() && s.peek() >= arr[i]){
                s.pop();
            }
            if(s.empty()){
                result[i] = -1;
            }
            else{
                result[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return result;
    }

    public static int[] printPrevSmaller(int arr[], int n){
        int result[] = new int[n];

        result[0] = -1;

        for(int i=1; i<n; i++){
            int j;
            for(j=i-1; j>=0; j--){
                if(arr[i] > arr[j]){
                    result[i] = arr[j];
                    break;
                }
            }
            if(j== -1){
                result[i] = -1;
            }
        }
        return result;
    }
}
