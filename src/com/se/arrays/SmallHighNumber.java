package com.se.arrays;
/*
Given an array and a target. if target is < array element, return small element in the array
 if target is > array elements, return highest element in the array
 if target == array element, return that array element
 if target lies between array elements, return element in the array which is < target
 */
public class SmallHighNumber {

    public static void main(String[] args) {
        int[] arr = {3,7,9};
        int length = arr.length;
        int target = 14;
        int output = -1;
        if(target < arr[0]){
            output = arr[0];
        }
        if(target >arr[length-1]){
            output= arr[length-1];
        }
        else{
            for(int i=0; i<length ; i++){
                if(target == arr[i]){
                    output = arr[i];
                }
            }
        }
        if(output == -1){
            for(int i=0; i<length; i++){
                if(arr[i]>target){
                    output = arr[i-1];
                    break;
                }
            }
        }
        System.out.println(output);
    }
}
