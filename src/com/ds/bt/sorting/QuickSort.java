package com.ds.bt.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {10, 15, 9, 17, 31, 26};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }//88866 39153
    public static void quickSort(int a[], int l, int h){
        System.out.println("low "+l);
        System.out.println("low "+h);
        if(l<h){
            int pivot = partition(a, l, h);
            System.out.println("pivot : "+pivot);
            quickSort(a, l, pivot-1);
            quickSort(a, pivot+1, h);
        }
    }

    public static int partition(int a[], int l, int h){
        int pivot = a[h];
        int i=l;
        for(int j=l; j<h; j++){
            if(a[j]<pivot){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }

        }//for
        System.out.println("first iteration "+Arrays.toString(a));
        System.out.println("i "+i);
        //swap ith position with pivot
        int temp = a[i];
        a[i] = pivot;
        a[h] = temp;
        System.out.println("After pivot swap with ith element "+Arrays.toString(a));
        return i;

    }
}
