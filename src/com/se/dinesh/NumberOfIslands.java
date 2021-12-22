package com.se.dinesh;

public class NumberOfIslands {

    public static void main(String[] args)
    {
        int[][] mat=
                {
                        { 1, 0, 1, 0, 0, 0, 1, 1, 1, 1 },
                        { 0, 0, 1, 0, 1, 0, 1, 0, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 1, 0, 0, 0 },
                        { 1, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 },
                        { 0, 1, 0, 1, 0, 0, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                        { 0, 0, 0, 1, 0, 0, 1, 1, 1, 0 },
                        { 1, 0, 1, 0, 1, 0, 0, 1, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 }
                };

        System.out.print("The total number of islands is " + countIslands(mat));
    }

    public static int countIslands(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        int numOfIslands = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

            }
        }
        System.out.println(m+" "+n);
        return 0;
    }
}
