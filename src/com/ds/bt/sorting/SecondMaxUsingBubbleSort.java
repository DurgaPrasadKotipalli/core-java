package com.ds.bt.sorting;

public class SecondMaxUsingBubbleSort {

    public static void main(String args[])
    {
        //int arr[] ={7, 8, 15, 1, 4, 3 };
        int arr[] = {15,9,0,25,2,43,1};
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i == 3){
                break;
            }

        }
        max = arr[arr.length-3];
        System.out.println("second max element :: "+max);
        System.out.println("array after sorting last two elements: ");
        for(int value : arr){
            System.out.print(value+" ");
        }
    }
}
