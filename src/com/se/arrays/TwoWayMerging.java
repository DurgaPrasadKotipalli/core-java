package com.se.arrays;

import java.util.Arrays;

public class TwoWayMerging {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {2, 5, 6};
        int c[] = merge(a, b);
        System.out.println(Arrays.toString(c));

    }

    public static int[] merge(int a[], int b[])
    {
        int m = a.length;
        int n = b.length;
        int c[] = new int[m+n];

        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(a[i] > b[j])
            {
                c[k] = b[j];
                j++;
            }else{
                c[k] = a[i];
                i++;
            }
            k++;
        }

        while(i<m){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<n){
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }
}
