package com.se.exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo ed = new ExceptionDemo();
		
		Scanner readme = new Scanner(System. in);
		String a = readme.nextLine();  
		String b = readme.nextLine(); 
		ed.division(a, b);
	}
	
	
	public void division(String x, String y) {
		try {
			
			System.out.println(Integer.parseInt(x)/Integer.parseInt(y));
			
		}
		catch(NumberFormatException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
		  System.out.println(e);
		}
	}

}
