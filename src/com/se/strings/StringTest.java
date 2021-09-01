package com.se.strings;

import java.io.IOException;
import java.util.Optional;

public class StringTest {

	public static void main(String[] args) {

		String str1 = "SAKET";
		
		//System.out.println(str1.toLowerCase().matches(".*[aeiou].*"));
		  
        char[] chars = str1.toCharArray();
     
       
       
  
        StringBuffer sb = new StringBuffer();
  
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') )
            {
                sb.append(chars[i]);
            }
           
        } 
        //System.out.println(sb);
        try {
			throw new IOException("Hello");
		}catch(IOException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
        Integer value1 = null;
        Optional<Integer> a = Optional.ofNullable(null);
        
        System.out.println(a);
		

	}

}
