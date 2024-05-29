package com.ds.bt.pseudo;

import java.util.Arrays;

/*
Given an array of integers, write a function that returns true if there is a triplet (a, b, c)
that satisfies a2 + b2 = c2.
*/
public class PythagorianTriplets {
    public static void main(String[] args) {
        int arr[]= {3, 2, 4, 6, 5};
        pythagorianTriplet(arr);
    }

    public static void pythagorianTriplet(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            a[i] = a[i]*a[i];
        }
        Arrays.sort(a);
        boolean found = false;
        for(int i = n-1; i>=2; i-- ){
            int l = 0;
            int r = i-1;

            while(l<r){
                if(a[l]+a[r] == a[i]){
                    System.out.println("pythagorian triplets ::"+Math.sqrt(a[l])+", "+Math.sqrt(a[r])+", "+Math.sqrt(a[i]));
                    found = true;
                    l++;
                    r--;
                }
                else if(a[l]+a[r] < a[i]){
                    l++;
                }
                else{
                    r--;
                }
            }
        }

        if(!found){
            System.out.println("No pythagorian triplets found in the given array");
        }
    }
}
