package com.se.collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(null, null);
		hm.put(10, "amp");
		hm.put(11, "muramalla");
		hm.put(20, "vijayawada");
		hm.put(30, "Hyderabad");
		hm.put(07, "munnganda");
		hm.put(15, "kakinada");
		hm.put(07, "gannavaram");
		
		System.out.println(hm);
		
		ArrayAsHashMap ahm = new ArrayAsHashMap();
		
		ahm.put(10, "1234");
		ahm.put(20, "10");
		ahm.put(30, "10.5000");
		ahm.put(40, "mycity");
		ahm.put(4, "dp");
		
		for(int i=0; i<ahm.hashArr.length; i++) {
			System.out.println(ahm.get(i)+" "+ahm.hashArr[2][2]);
		}
		

	}

}
