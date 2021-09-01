package com.se.employee;

import java.util.*;

public class FourSumProblem {

	public static void main(String[] args) {
		
		int array[] = { 2, 7, 4, 0, 9, 5, 1, 3 }; 
		int n = array.length; 
		int sum = 20; 
		FourSumProblem(array, n, sum); 

	}
	
	
	static void FourSumProblem(int array[], int n, int target) 
    { 
        HashMap<Integer,Numbers> map = new LinkedHashMap<Integer,Numbers>(); 
        for (int i = 0; i < n - 1; i++) 
            for (int j = i + 1; j < n; j++) 
                map.putIfAbsent(array[i] + array[j], new Numbers(i, j)); 
        
        
        System.out.println(map);
  
        for (int i = 0; i < n - 1; i++) { 
            for (int j = i + 1; j < n; j++) { 
                int sum = array[i] + array[j]; 
                
                if (map.containsKey(target - sum)) { 
                    
                    Numbers p = map.get(target - sum); 
                    if (p.first != i && p.first != j 
                        && p.second != i && p.second != j) { 
                        System.out.print(array[i] + ", " + array[j] + ", " + array[p.first] + ", " + array[p.second]); 
                        return; 
                    } 
                } 
            } 
        } 
    }
	
	
	static class Numbers {
		int first, second;

		public Numbers(int first, int second) {
			this.first = first;
			this.second = second;
		}

		@Override
		public String toString() {
			return "Numbers [first=" + first + ", second=" + second + "]";
		}
		
		
	}

}
