package com.se.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		cities.add("Bombay");
		cities.add("Delhi");
		cities.add("Hyderabad");
		cities.add("Bangalore");
		cities.add("chennai");
		System.out.println(cities.stream().sorted().collect(Collectors.toList()));
		System.out.println(cities.stream().filter(x -> x.startsWith("B")).count());
		//cities.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);N
		
		System.out.println(LocalDate.now());
		
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
		
		int[] myIntArray = new int[]{121, 12, 3456, 132, 564, 12, 132};
		
		List<Integer>  myList =new ArrayList<>();
		for(int x :myIntArray) {
			myList.add(x);
		}
		
		List<Integer> listWithoutDuplicates = myList.stream().distinct().collect(Collectors.toList());		
		System.out.println(listWithoutDuplicates);
		
		List<Integer> nums = Arrays.asList(3, 7, 8, 1, 5, 9);
		System.out.println(nums.stream().reduce(Integer :: sum));
		

	}

}
