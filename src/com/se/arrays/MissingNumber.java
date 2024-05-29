package com.se.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        findMissingNumber(a);
    }
    public static void findMissingNumber(int[] a1)
    {
        int n = a1.length;
        int sumOfNNumbers = (n+1)*(n+2)/2;
        int sum = 0;
        for(int i=0;i<a1.length;i++){
            sum = sum + a1[i];
        }
        int missingNumber =  sumOfNNumbers - sum;
        System.out.println(missingNumber);
    }
}

