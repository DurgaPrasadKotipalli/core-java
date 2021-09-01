package com.se.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> address = new ArrayList<>();
		address.add("chennai");
		
		User t = new User("durga", 100000, address);
		//t.getAddress().add("Hyderabad");
		
		//System.out.println(t);
		
		HashMap<Employee, Integer> hm = new HashMap<>();
		/*
		hm.put(new Emp(), 1);
		hm.put(new Emp(), 2);
		
		System.out.println(hm);
		
		hm.get(new Emp());
		
		*/
		
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(1);
		lst.add(5);
		lst.add(4);
		System.out.println(lst.get(3));
		
		
		
		

	}

}
