package com.se.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String args[]){
        int a[] = { 2, 7, 11, 15 };

        int n = 9;
        int outputArr[] = twoSum2(a, n);
        System.out.println(Arrays.toString(outputArr));
    }

    public static int[] twoSum(int arr[], int target){
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int requiredNumber = target - arr[i];

            if(indexMap.containsKey(requiredNumber)){
                int outputArr[] = {indexMap.get(requiredNumber), i};
                return outputArr;
            }
            indexMap.put(arr[i], i);
        }

        return null;
    }



    public static int[] twoSum2(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int value = target-numbers[i];
            if(map.containsKey(value)){
                int output[] =  {map.get(value), i};
                return output;
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
