package com.se.exceptions;

public class Employee {

	private String name;
	private int id;
	private String city;
	private int salary;
	private int deptId;
	private String department;
	public Employee(String name, int id, String city, int salary, int deptId, String department) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.salary = salary;
		this.deptId = deptId;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", id=" + id +
				", city='" + city + '\'' +
				", salary=" + salary +
				", deptId=" + deptId +
				", department='" + department + '\'' +
				'}';
	}
}
