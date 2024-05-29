package com.se.arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int a[] = {5, 6,7,8, 12, 15,23};
        boolean isArraySorted = true;
        for(int i=0; i<a.length-1; i++){
            if(a[i] > a[i+1]){
                isArraySorted = false;
            }
        }
        if(isArraySorted){
            System.out.println("the given array is sorted");
        }else{
            System.out.println("The given array is not sorted");
        }
    }
}
