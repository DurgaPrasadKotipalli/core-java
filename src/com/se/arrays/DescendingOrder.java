package com.se.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DescendingOrder {

	public static void main(String[] args) {
		
		int arr[] = {1, 4, 5, 6, 6, 3, 3, 5, 2, 5, 6, 4, 6};
		
	    DescendingOrder dso = new DescendingOrder();
		List<Integer> output = dso.sortArrayElementsByFrequency(arr);
		
		System.out.println(output);
		String sentence = "This is the longest even word";

		String longestWord = Arrays.stream(sentence.split(" "))
		.filter(s -> s.length() % 2 == 0)
		.max(Comparator.comparingInt(String::length))
		.orElse(" ");
		
		//System.out.println(longestWord);

	}
	
	
	public List<Integer> sortArrayElementsByFrequency(int[] input) {

		Map<Integer, Integer> elementCountMap = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			if (elementCountMap.containsKey(input[i])) {
				elementCountMap.put(input[i], elementCountMap.get(input[i]) + 1);
			} else {
				elementCountMap.put(input[i], 1);
			}
		}
		
		System.out.println(elementCountMap);
		
		ArrayList<Integer> sortedElements = new ArrayList<>();
		
		
		elementCountMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEach(entry ->{
        	System.out.println(entry.getKey()+ " "+entry.getValue());
        });
		
		elementCountMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		            .forEach(entry ->{
		            	for(int i=0; i<entry.getValue(); i++) {
		            		sortedElements.add(entry.getKey());
		            	}
		            });

		return sortedElements;
	}

}
