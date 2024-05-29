package com.regular;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num =10;
        int a[] = fibonacci(num);
        System.out.println("Fibonacci series of "+num+" is ::"+ Arrays.toString(a));
    }

    public static int[] fibonacci(int n){
        int a[] = new int[n];
        int f1 = 0, f2 = 1, f=0;
        if(n>0){
            a[0] = 0;
        }
        if( n >1){
            a[1] = 1;
        }

        for(int i=2;i<n; i++){
          a[i] = a[i-1]+a[i-2];
        }

        return a;
    }
}
