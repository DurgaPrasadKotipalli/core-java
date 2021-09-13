package com.ds.bt;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        int target = 4;
        Arrays.sort(arr);
        System.out.println("array after sorting ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int n = arr.length;
        int result = binarySearh(0, n - 1, arr, target);
        System.out.println("element " + target + " found at index = " + result);


    }

    public static int binarySearh(int start, int end, int[] arr, int target) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearh(mid + 1, end, arr, target);
            } else if (arr[mid] > target) {
                return binarySearh(start, mid - 1, arr, target);
            }
        }
        return -1;
    }
}
