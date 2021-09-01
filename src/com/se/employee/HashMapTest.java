package com.se.employee;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Employee, String> map = new HashMap<>();
		
		Employee e1 = new Employee();
		e1.setId("1");
		e1.setName("Siddu");
		e1.setCity("Hyderabad");
		e1.setSalary(70000);
		
		Employee e2 = new Employee();
		e2.setId("2");
		e2.setName("Swami");
		e2.setCity("Hyderabad");
		e2.setSalary(50000);
		
		Employee e3 = new Employee();
		e3.setId("3");
		e3.setName("Ramu");
		e3.setCity("Bangalore");
		e3.setSalary(100000);
		
		Employee e4 = new Employee();
		e4.setId("2");
		e4.setName("Swami");
		e4.setCity("Hyderabad");
		e4.setSalary(50000);
		
		
		map.put(e1, "Siddu");
		map.put(e2, "Swami");
		map.put(e3, "Ramu");
		map.put(e4, "Swami");
		
		System.out.println(map.size());
		
		

	}

}
