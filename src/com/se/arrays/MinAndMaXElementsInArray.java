package com.se.arrays;

public class MinAndMaXElementsInArray {
    public static void main(String[] args) {
       int a[] = {3, 5, 4, 1, 9};
       int max = a[0];
       int min = a[0];
       for(int i=0; i<a.length; i++){
           if(a[i]> max){
               max = a[i];
           }
           if(a[i] < min){
               min = a[i];
           }
       }

        System.out.println("min element ::"+min+", max element :: "+max);
    }
}
