package com.se.arrays;


//Find the element before which all the elements are smaller than it and
// after which all the elements are greater.
public class ElementSeachInArray {

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        int n = arr.length;
        System.out.println("The element is " + findElement(arr, n));
    }


    static int findElement(int[] arr, int n) {
        // leftMax[i] stores maximum of arr[0..i-1]
        int[] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        System.out.println("input array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Fill leftMax[]1..n-1]
        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        System.out.println("Left max ");
        for (int i = 0; i < n; i++) {
            System.out.print(leftMax[i] + " ");
        }

        System.out.println("------ ");
        // Initialize minimum from right
        int rightMin = Integer.MAX_VALUE;

        int[] right = new int[n];

        right[n - 1] = Integer.MAX_VALUE;

        for (int i = n - 1; i > 0; i--) {
            right[i - 1] = Math.min(right[i], arr[i]);
        }
        System.out.println("Right min ");
        for (int i = 0; i < n; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println("---------- ");
        for (int i = n - 1; i >= 0; i--) {
            // Check if we found a required element
            if (leftMax[i] < arr[i] && right[i] > arr[i])
                return arr[i];
        }

        /*
         * // Traverse array from right for (int i = n - 1; i >= 0; i--) { // Check if
         * we found a required element if (leftMax[i] < arr[i] && rightMin > arr[i])
         * return i;
         *
         * // Update right minimum rightMin = Math.min(rightMin, arr[i]); }
         */

        // If there was no element matching criteria
        return -1;


    }

}
