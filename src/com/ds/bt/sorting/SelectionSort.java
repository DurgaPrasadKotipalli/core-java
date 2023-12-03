package com.ds.bt.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[])
    {
        int arr[] = {14, 256, 10, 56, 100, 4, 1, 13, 0};
        SelectionSort s = new SelectionSort();
        s.sort(arr);
        System.out.println("Array after sorting "+ Arrays.toString(arr));
    }
    public void sort(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
