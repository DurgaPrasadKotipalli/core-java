package com.se.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = new ArrayList<>();
		createEmpList(empList);
		
		Map<String, List<Employee>> empMapBasedOnCity = empList.stream().collect(Collectors.groupingBy(Employee :: getCity, Collectors.toList()));
		
		empMapBasedOnCity.forEach((key, value) -> System.out.println("City : "+key+ " Employees : "+value));
		
		System.out.println("------------");
		
		Map<String, Long> empCountBasedOnCity = empList.stream().collect(Collectors.groupingBy(Employee:: getCity, Collectors.counting()));
		
		//System.out.println(empCountBasedOnCity);	
		
		//max salary from each city
		Map<String, Optional<Employee>> totSalaryEmpCityWise = empList.stream().collect(Collectors.groupingBy(Employee::getCity,
				    Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))
				));
		
		//System.out.println(totSalaryEmpCityWise);
		
		Optional<Employee> emp = empList.stream()
		        .sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst();

		//System.out.println(emp.get());
		
		//System.out.println("------------------------------");
		
		Optional<Employee> empObj = empList.stream().filter(x -> x.getSalary() == 500).findAny();
		
		
		String str = "India is my country";
		
		System.out.println(str.chars().filter( ch -> ch == 'i' || ch == 'I').count());
		
		//System.out.println(str.codePoints().filter(ch -> ch == 'i' || ch == 'I').count());
		
		//duplicate characters in a string
		Map<String, Long> out =str.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		//System.out.println(out);
		
		List<String> strList = Arrays.asList("Amanda","Rob", "sunny","Amanda", "Rob", "Rob");
		
		Map<String, Long> duplicates = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(duplicates);
		
           double b = Math.sqrt(3);
           Math.ceil(Math.sqrt(3));
           
           
           Employee e1 = new Employee();
           Employee e2 = new Employee();
    
           e1.setId("100");
           e2.setId("100");
    
           //Prints 'true'
           System.out.println(e1.equals(e2));
    
           Set<Employee> employees = new HashSet<Employee>();
           employees.add(e1);
           employees.add(e2);
           
           System.out.println(e1.hashCode()+"---------"+e2.hashCode());
            
           System.out.println(employees.size());
           
          
           
           //empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
           
         
       	

		
		
		

		
		

	}
	
       
	
	
	
	private static void createEmpList(List<Employee> empList) {
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
		e4.setId("4");
		e4.setName("Prasad");
		e4.setCity("Hyderabad");
		e4.setSalary(65000);
		
		Employee e5 = new Employee();
		e5.setId("5");
		e5.setName("Krishna");
		e5.setCity("Bangalore");
		e5.setSalary(160000);
		
		Employee e6 = new Employee();
		e6.setId("6");
		e6.setName("Lova");
		e6.setCity("Bangalore");
		e6.setSalary(170000);

		Employee e7 = new Employee();
		e7.setId("7");
		e7.setName("Naidu");
		e7.setCity("Poland");
		e7.setSalary(250000);
		
		Employee e8 = new Employee();
		e8.setId("8");
		e8.setName("Arun");
		e8.setCity("Pune");
		e8.setSalary(45000);
		
		Employee e9 = new Employee();
		e9.setId("1");
		e9.setName("Mahesh");
		e9.setCity("Chennai");
		e9.setSalary(85000);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		
	}

}
