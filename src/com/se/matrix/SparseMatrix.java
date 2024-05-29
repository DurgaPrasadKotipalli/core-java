package com.se.matrix;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows");
        int m = sc.nextInt();
        System.out.println("Enter no.of columns");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter Matrix values3");
        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isSparseMatrix = checkSparseMatrix(arr, m, n);
        if(isSparseMatrix){
            System.out.println("Sparse Matrix");
        }else{
            System.out.println("Not a Sparse Matrix");
        }


    }

    public static boolean checkSparseMatrix(int arr[][], int m, int n){
        int total = m*n;
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 0){
                    count++;
                }
            }//for
        }//for

        return count > total/2;

    }
}
