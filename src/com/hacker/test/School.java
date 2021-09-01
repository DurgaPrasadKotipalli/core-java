package com.hacker.test;

public class School implements Building{
	
	int[] floors;
	
	School(int n){
		floors = new int[n];
		System.out.println("A school is being constructed");
	}

	@Override
	public void floorCompleted(int floorNumber) {
		
		if(floorNumber > floors.length) {
			System.out.println("Floor number "+floorNumber+ "does not exist in school");
		}
		
		
        if(floorNumber <= floors.length) {
        	floors[floorNumber-1] = 1;
			System.out.println("Construction for floor number "+floorNumber+ " completed in school");
		}
        
        
		
	}

	@Override
	public void printStatus(int floorNumber) {
		if(floorNumber > floors.length) {
			System.out.println("Floor number "+floorNumber+ "does not exist in school");
		}
		
		if(floorNumber == 1) {
			System.out.println("Construction for floor number "+floorNumber+ "completed in school");
		}
		
		if(floorNumber == 0) {
			System.out.println("Construction for floor number "+floorNumber+ " not completed in school");
		}
		
	}

	@Override
	public void printNumberOfFloors() {
		System.out.println("The school has "+floors.length+ " floors");
		
	}

}
