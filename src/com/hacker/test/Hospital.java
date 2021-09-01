package com.hacker.test;

public class Hospital implements Building{
	int[] floors;
	
	Hospital(int n){
		floors = new int[n];
		System.out.println("A hospital is being constructed");
	}

	@Override
	public void floorCompleted(int floorNumber) {		
		if(floorNumber > floors.length) {
			System.out.println("Floor number "+floorNumber+ "does not exist in hospital");
		}
		
		
        if(floorNumber <= floors.length) {
        	floors[floorNumber-1] = 1;
			System.out.println("Construction for floor number "+floorNumber+ "completed in hospital");
		}      
        
	}

	@Override
	public void printStatus(int floorNumber) {
		if(floorNumber > floors.length) {
			System.out.println("Floor number "+floorNumber+ "does not exist in hospital");
		}
		
		if(floorNumber == 1) {
			System.out.println("Construction for floor number "+floorNumber+ "completed in hospital");
		}
		
		if(floorNumber == 0) {
			System.out.println("Construction for floor number "+floorNumber+ " not completed in hospital");
		}
		
	}

	@Override
	public void printNumberOfFloors() {
		System.out.println("The hospital has "+floors.length+ " floors");
		
	}
}
