package com.ds.matrix;

public class MatrixOperations {

    public static void main(String[] args) {
        int a[][] = {{5, 6}, {7,8}, {9,10}};

        transpose(a);
    }
    public static void transpose(int a[][]){
        int m = a.length;
        int n = a[0].length;

        int b[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                b[i][j] =  a[j][i];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }



    }
}
