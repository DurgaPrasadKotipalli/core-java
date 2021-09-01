package com.se.arrays;

public class NumberToWord {

	public static void main(String[] args) {
		NumberToWords("20".toCharArray());

	}
	
	
	static void NumberToWords(char[] array) 
	{ 
		    int length = array.length;  
		    if (length == 0)  
		    { 
		        System.out.println("empty string"); 
		        return; 
		    } 
		    if (length > 4)  
		    { 
		        System.out.println("Length more than 4 is not supported"); 
		        return; 
		    } 
		  
		    String[] singleDigits = new String[]{ "zero", "one",  
		                                        "two", "three", "four", 
		                                        "five", "six", "seven",  
		                                            "eight", "nine"}; 
	  
		    String[] twoDigits = new String[]{"", "ten", "eleven", "twelve",  
		                                        "thirteen", "fourteen", 
	                                        "fifteen", "sixteen", "seventeen", 
		                                        "eighteen", "nineteen"}; 
		  
		    String[] digits10Multiples = new String[]{"", "", "twenty", "thirty", "forty",  
		                                            "fifty","sixty", "seventy",  
		                                            "eighty", "ninety"}; 
		  
		    String[] digits100Multiples = new String[] {"hundred", "thousand"}; 
		  
		    System.out.print(String.valueOf(array)+": "); 
		  
		    if (length == 1)  
		    { 
		    	//System.out.println("array[0] "+(array[0]-'0'));
		    	int x = array[0];
		    	//System.out.println(x-'0');
		        System.out.println(singleDigits[array[0] - '0']); 
		        return; 
		    } 
		  
		    int x = 0; 
		    while (x < array.length)  
		    { 
		  
		        if (length >= 3) 
		        { 
		            if (array[x]-'0' != 0) 
		            { 
		                System.out.print(singleDigits[array[x] - '0']+" "); 
		                System.out.print(digits100Multiples[length - 3]+" ");  
		                
		            } 
		            --length; 
		        }		  
		        else
		        { 
		            if (array[x] - '0' == 1)  
		            { 
		                int sum = array[x] - '0' +  
		                    array[x+1] - '0'; 
		                System.out.println(twoDigits[sum]); 
		                return; 
		            } 
		            
		           /* else if (array[x] - '0' == 2 &&  
		                    array[x + 1] - '0' == 0) 
		            { 
		                System.out.println("twenty"); 
		                return; 
		            } */
		  
		            else
		            { 
		                int i = (array[x] - '0'); 
		                if(i > 0) 
		                System.out.print(digits10Multiples[i]+" "); 
		                else
		                System.out.print(""); 
		                ++x; 
		                if (array[x] - '0' != 0) 
		                    System.out.println(singleDigits[array[x] - '0']); 
		            } 
		        } 
		        ++x; 
		    } 
		} 

}
