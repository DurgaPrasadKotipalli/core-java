package com.ds.bt.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    static int countOfIterations=0;

    public static void main(String args[])
    {
        int a[]={15,9,0,25,2,43,1};//1
        //int a[]= {0, 1, 2, 9, 15, 25, 43};
        BubbleSort b=new BubbleSort();//1 System.out.println("Array before sort");
        System.out.println(Arrays.toString(a));
         b.sort(a);
        System.out.println("Array After sort method");
        System.out.println(Arrays.toString(a));
        System.out.println(countOfIterations);
    }

    public void sort(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            countOfIterations++;
            boolean isArraySorted = false;
            for(int j=0; j<a.length-1-i; j++)
            {
                countOfIterations++;
                if(a[j] > a[j+1])
                {
                    isArraySorted = true;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if(isArraySorted == false)
            {
                break;
            }
        }
    }
}
