package com.se.arrays;

import java.util.Arrays;

public class NthMaxElementSumInEachArray {
    // Driver code
    public static void main(String[] args) {
        int[][] arr = new int[][] { {5,5,3,4,6,8,8,9},
                                    {2,4,6,9,8,7,7},
                                    {7,6,6,3,2,1},
                                    {9,4} };
        // Calling the function
        nthMaxElementInEachArray(4, arr);
    }

    // Function to get max element
    public static void nthMaxElementInEachArray(int no_of_rows, int[][] arr) {
        int i = 0;
        int[] result = new int[no_of_rows];

        while (i < no_of_rows) {
            int[] inter = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                inter[j] = arr[i][j];
            }
            Arrays.sort(inter);
            System.out.println(" ---------------- ");
            for(int k=0; k<inter.length; k++){
                System.out.println(inter[k]);
            }
            if(inter.length >= 3){
                System.out.println(" 3rd largest---------- "+inter[inter.length-3]);
                result[i] = inter[inter.length-3];
            }else if(inter.length == 2){
                System.out.println(" 3rd largest---------- "+inter[inter.length-2]);
                result[i] = inter[inter.length-2];
            }
            else{
                System.out.println(" 3rd largest---------- "+inter[inter.length-1]);
                result[i] = inter[inter.length-1];
            }
            i++;
        }
        printArray(result);
    }

    // Print array element
    private static void printArray(int[] result) {
        int sum= 0;
        for (int i =0; i<result.length;i++) {
            System.out.println(result[i]);
        }

    }
}
