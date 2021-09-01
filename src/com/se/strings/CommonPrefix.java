package com.se.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("geeksforgeeks");
		arrList.add("geeks");
		arrList.add("geek");
		arrList.add("geezer");
		arrList.add("gea");
		
		String arr[] = new String[arrList.size()];
		for(int i=0; i<arrList.size(); i++) {
			arr[i] = arrList.get(i);
		}
		
	   Arrays.sort(arr);
	   for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	   
	   /* find the minimum length from first and last string */
       int end = Math.min(arr[0].length(), arr[arr.length-1].length());
       
       System.out.println(end);

       /* find the common prefix between the first and
          last string */
       int i = 0;
       while (i < end && arr[0].charAt(i) == arr[arr.length-1].charAt(i) )
           i++;

       String pre = arr[0].substring(0, i);
       
       System.out.println(pre);

	}

}
