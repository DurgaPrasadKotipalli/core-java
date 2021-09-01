package com.se.employee;

public class Employee {
	
	private String name;
	private String id;
	private String city;
	private int salary;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + ", salary=" + salary + "]";
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj == null) {
			result = false;
		}else {
			Employee emp = (Employee)obj;
			if(this.id == emp.getId() &&  this.city == emp.getCity() && this.name == emp.getName() && this.salary == emp.getSalary()){
				result = true;
			}
		}
		
		return result;
	}
	
	
}
