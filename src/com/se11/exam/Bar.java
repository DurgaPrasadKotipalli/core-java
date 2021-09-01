package com.se11.exam;

import java.util.*;

public class Bar extends Foo {

	public static void main(String[] args) {
		
		Integer[] array = {1, 2};
		List<Integer> list = Arrays.asList(array);
		list.set(0, 2);
		array[1] = 1;
		//System.out.println(Arrays.toString(array));
		//System.out.println(list);
		
		Random random = new Random();
		System.out.println(random.nextInt(19));

	}

	public Double methodA() {
		return (double) 1.1f;
	}

	public String methodB() {
		return null;
	}

}
