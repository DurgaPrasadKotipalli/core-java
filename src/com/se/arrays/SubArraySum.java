package com.se.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

    public static void main(String[] args){
        System.out.println("All Non-empty Subarrays");
        int arr[] = new int[]{2, 4, 6, 10, 2, 1};
        System.out.println(minSubArrayLength(arr, arr.length, 12));
    }


    static int minSubArrayLength( int arr[], int n, int target)
    {
       int lengthOfSubArray = -1;
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                System.out.println("");
                int sum =0;
                List<Integer> list = new ArrayList<>();
                for (int k=i; k<=j; k++) {
                    sum += arr[k];
                    list.add(arr[k]);
                }//for
                System.out.println(list+":: sum : "+sum);
                if(lengthOfSubArray == -1 && sum == target ){
                    lengthOfSubArray = list.size();
                }

                if(sum == target && list.size() < lengthOfSubArray){
                    lengthOfSubArray = list.size();
                }

            }//for
        }//for
        return lengthOfSubArray;
    }
}
