package com.se.arrays;

import java.util.*;


public class RelativeSorting {

	public static void main(String[] args) {
		int[] first = { 5, 8, 9, 3, 5,  1, 7, 3, 4, 9, 3, 5, 1, 8, 4 };
		int[] second = { 3, 5, 7, 2 };
		customSort(first, second);
		System.out.println("After sorting the array is : " + Arrays.toString(first));
		
		HashMap hm = new HashMap();
		
	}
    /*Loop through A1[], store the count of every number in a HashMap (key: number, value: count of number)
      Loop through A2[], check if it is present in HashMap, if so, put in output array that many 
             times and remove the number from HashMap.
      Sort the rest of the numbers present in HashMap and put in the output array.
     * 
     */
	public static void customSort(int[] first, int[] second) {
		Map<Integer, Integer> freq = new TreeMap<>();
		for (int i : first) {
			freq.put(i, freq.getOrDefault(i, 0) + 1);
		}

		System.out.println(freq);
		int index = 0;

		for (int i : second) {

			int n = freq.getOrDefault(i, 0);
			while (n-- > 0) {
				first[index++] = i;
			}
			freq.remove(i);
		}
		
		for(int i=0; i<first.length; i++) {
			System.out.print(first[i]+" ");
		}

		System.out.println(freq);
		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			int count = entry.getValue();
			while (count-- > 0) {
				first[index++] = entry.getKey();
			}
		}
	}

}
