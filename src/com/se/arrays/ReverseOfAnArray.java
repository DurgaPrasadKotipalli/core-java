package com.se.arrays;

import java.util.Arrays;

public class ReverseOfAnArray {

    public static void main(String[] args) {
        int a[] = {3, 5, 239, 7, 2, 28, 9};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int a[]){
        int i, j;
        for(i=0, j=a.length-1; i<j; i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
