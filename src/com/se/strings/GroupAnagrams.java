package com.se.strings;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] words = { "cat", "dog", "tac", "god", "act" };

		groupAnagrams(words);
		
		/*String str = "cat";
		
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		*/

	}

	public static void groupAnagrams(String[] words) {
		List<String> list = Arrays.stream(words).map(s -> s.toCharArray()).map(chars -> {
			Arrays.sort(chars);
			return new String(chars);
		}).collect(Collectors.toList());
		
		
		System.out.println(list);

		Map<String, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.putIfAbsent(list.get(i), new ArrayList<>());
			map.get(list.get(i)).add(i);
			//break;
		}
		
		System.out.println(map);
		System.out.println("-------");
		
		for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
			System.out.println(entry.getValue().stream().map(index -> words[index]).collect(Collectors.toList()));
		}
	}

}
