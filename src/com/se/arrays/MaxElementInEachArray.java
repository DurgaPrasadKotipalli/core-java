package com.se.arrays;

public class MaxElementInEachArray {

    public static void main(String[] args) {
        int[][] arr = new int[][] { {3, 4, 1, 8},
                {1, 4, 9, 11},
                {76, 34, 21, 1},
                {2, 1, 4, 5} };
        // Calling the function
        maxelement(4, arr);
    }

    public static void maxelement(int no_of_rows, int[][] array){

        int max=0;
        int i=0;
        int result[] = new int[no_of_rows];

        while(i<no_of_rows){

            for(int j=0; j<array[i].length; j++){

                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
            result[i] = max;
            max =0;
            i++;
        }
        
        printArray(result);

    }
    
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("i = " + array[i]);
        }
    }
}
