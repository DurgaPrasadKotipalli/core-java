package com.se.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8MapAndFlatMapExample {

	public static void main(String[] args) {
		
		List<Institute> instituteList = new ArrayList<>();
		instituteList.add(new Institute("IIM", Arrays.asList("Bangalore","Ahmedabad", "Kozhikode","Luckonw")));
		instituteList.add(new Institute("IIT", Arrays.asList("Delhi","Mumbai", "Kharagpur")));
		instituteList.add(new Institute("NIFT", Arrays.asList("Bangalore","Hyderabad", "Mumbai","Patna")));
		
		List<String> namesOfInstitutes = instituteList.stream().map(x -> x.getName()).collect(Collectors.toList());
		
		System.out.println(namesOfInstitutes);
		
        List<String> locationsOfInstitutes = instituteList.stream().flatMap(x ->x.getLocations().stream()).collect(Collectors.toList());
		
		System.out.println(locationsOfInstitutes);
		List<String> strList = Arrays.asList("Amanda","Rob", "sunny","Amanda", "Rob", "Rob");
        HashSet<String> set = new HashSet<>();
		Set<String> nonDuplicates = strList.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
		System.out.println(nonDuplicates);
		}

}


class Institute{
	private String name;
	private List<String> locations;
	
	public Institute(String name, List<String> locations) {
		super();
		this.name = name;
		this.locations = locations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}
	
	
	
}