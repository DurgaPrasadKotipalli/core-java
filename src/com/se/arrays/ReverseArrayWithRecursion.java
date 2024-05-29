package com.se.arrays;

import java.util.Arrays;

public class ReverseArrayWithRecursion {

    public static void main(String[] args) {
        int a[] = {5, 3, 1, 2, 0};
        reverseWithRecursion(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }
    public static void reverseWithRecursion(int a[], int start, int end){

        if(start >= end) {
            return;
        }else{
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            reverseWithRecursion(a, ++start, --end);
        }

    }
}
