package com.se.collections;

import java.util.*;
import java.util.Map.Entry;


public class SortHashMapByValue {
	
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();

		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);
		scores.put("Dino", 80);

		System.out.println(scores);

		scores = sortByValue(scores);

		System.out.println(scores);

	}
	
	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
		Map<String, Integer> sortedByValue = new LinkedHashMap<>();
		
		Set<Entry<String, Integer>> entrySet =  scores.entrySet();
		
		
		List<Entry<String, Integer>>  entryList = new ArrayList<>(entrySet);
		
		System.out.println(entryList);
		
		entryList.sort((x,y) -> x.getValue().compareTo(y.getValue()));
		
		System.out.println(entryList);
		
		for(Entry<String, Integer> obj : entryList) {
			sortedByValue.put(obj.getKey(), obj.getValue());
		}
		return sortedByValue;
	}

}
