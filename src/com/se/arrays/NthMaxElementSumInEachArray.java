package com.se.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
            HashSet<Integer> hs = new HashSet<>();
            for(int k=0; k<inter.length; k++){
                hs.add(inter[k]);
            }
            ArrayList<Integer> al = new ArrayList<>();
            al.addAll(hs);
            System.out.println(" ----Array with out duplicates------------ ");
            System.out.println(al);
            System.out.println(" ---------------- ");
            if(al.size() >= 3){
                System.out.println(" 3rd largest---------- "+al.get(al.size()-3));
                result[i] = al.get(al.size()-3);
            }else if(al.size() == 2){
                System.out.println(" 3rd largest---------- "+al.get(al.size()-2));
                result[i] = al.get(al.size()-2);
            }
            else{
                System.out.println(" 3rd largest---------- "+al.get(al.size()-1));
                result[i] = al.get(al.size()-1);
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
