package com.se.exceptions;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		createEmpList(empList);
		Map<Integer, Optional<Employee>> empMap = empList.stream().filter(x->x.getSalary()>= 10).collect(Collectors.groupingBy(Employee::getDeptId,  Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		System.out.println(empMap);

		List<Employee> emps= empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3).collect(Collectors.toList());
		//System.out.println(emps);

		Map<Integer, String> map = empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		//System.out.println(map);

		empList.stream().map(Employee:: getSalary).reduce(Integer::max);





	}
	
	
	private static void createEmpList(List<Employee> empList) {

		Employee e1 = new Employee("durga prasad",1,  "Hyderabad", 62 , 10, "Java");
		Employee e2 = new Employee("Lova padala", 2,  "Bangalore", 75 , 10, "Java");
		Employee e3 = new Employee("Ram",         3,  "Hyderabad", 25 , 10, "Java");
		Employee e4 = new Employee("siddu",       4,  "Hyderabad", 24 , 40, "Testing");
		Employee e5 = new Employee("Rajesh",      5,  "Bangalore", 28 , 40, "Testing");
		Employee e6 = new Employee("Mani",        6,  "US",        90 , 40, "Testing");
		Employee e7 = new Employee("Swami",       7,  "Hyderabad", 18 , 40, "Testing");
		Employee e8 = new Employee("Ramu",        8,  "Bangalore", 60 , 50, "Networking");
		Employee e9 = new Employee("Praneeth",    9,  "Bangalore", 20,  50, "Networking" );
		Employee e10 = new Employee("Krishna",    10, "Bangalore", 73,  50, "Networking" );
		Employee e11 = new Employee("somesh",     11, "Hyderabad", 56,  50, "Networking" );
		Employee e12 = new Employee("Naidu",      12, "Poland",    88,  60, "Oracle" );
		Employee e13 = new Employee("Arun",       13, "Pune",      45 , 60, "Oracle");
		Employee e14 = new Employee("Mahesh",     14, "Chennai",   34 , 60 ,"Oracle");
		Employee e15 = new Employee("Prasad",     15, "Hyderabad", 48 , 60 ,"Oracle");
		Employee e16 = new Employee("Sirisha",    16, "Hyderabad", 85 , 70 ,"SAP");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		empList.add(e10);
		empList.add(e11);
		empList.add(e12);
		empList.add(e13);
		empList.add(e14);
		empList.add(e15);
		empList.add(e16);
		
	}

}
