package com.se.arrays;

import java.util.*;
/*
  It sorts the strings in the array based on the number of times the string is repeated in the array
 */

public class AscendingOrderStrings {

	public static void main(String[] args) {

       String[] myString = {"the","ocean" ," is", "blue" , "the" , "tree" ," is" ,"green"};
       AscendingOrderStrings aso = new AscendingOrderStrings();
       List<String> output = aso.sortArrayElementsByFrequency(myString);
       
       System.out.println(output);

	}
	
	public List<String> sortArrayElementsByFrequency(String[] input) {

		Map<String, Integer> elementCountMap = new LinkedHashMap<>();

		for (int i = 0; i < input.length; i++) {
			if (elementCountMap.containsKey(input[i])) {
				elementCountMap.put(input[i], elementCountMap.get(input[i]) + 1);
			} else {
				elementCountMap.put(input[i], 1);
			}
		}
		
		System.out.println(elementCountMap);
		
		ArrayList<String> sortedElements = new ArrayList<>();
		
		
		elementCountMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEach(entry ->{
        	System.out.println(entry.getKey()+ " "+entry.getValue());
        });
		
		elementCountMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		            .forEach(entry ->{
		            	//for(int i=0; i<entry.getValue(); i++) {
		            		sortedElements.add(entry.getKey());
		            	//}
		            });

		return sortedElements;
	}

}
