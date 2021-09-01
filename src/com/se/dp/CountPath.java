package com.se.dp;

public class CountPath {

	public static void main(String[] args) {
		 int[][] cost =
		        {
			            { 4, 7, 8, 6, 4 },
			            { 6, 7, 3, 9, 2 },
			            { 3, 8, 1, 2, 4 },
			            { 7, 1, 7, 3, 7 },
		                { 2, 9, 8, 9, 3 }
			        };
		 
		 System.out.println(" Number of paths : "+count(cost));

	}
	
	public static int count(int[][] matrix) {
		
	   for(int i=0; i< matrix.length; i++) {
		   matrix[i][0] = 1;
	   }
	   
	   for(int j=0; j<matrix.length; j++) {
		   matrix[0][j] = 1;
	   }
	   
	   for(int i=1; i<matrix.length; i++) {
		   for(int j=1; j<matrix.length; j++) {
			   matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
		   }
	   }
		return matrix[matrix.length-1][matrix.length-1];
	}

}
