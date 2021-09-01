package com.se.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class User {
	
	private final String uname;
	private final double salary;
	private final List<String> address;
	
	public User(String uname, double salary, List<String> address) {
		super();
		this.uname = uname;
		this.salary = salary;
		this.address = Collections.unmodifiableList(new ArrayList<>(address));
	}

	public String getUname() {
		return uname;
	}

	public double getSalary() {
		return salary;
	}

	public List<String> getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", salary=" + salary + ", address=" + address + "]";
	}	

}
