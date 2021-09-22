package com.se.strings;

public class StringReverse {

	public static void main(String[] args) {

		//StringBuilder sb = new StringBuilder("durga prasad");

		String str = "Raghu prasad";
		reverseString(str);

		int x =123;

		StringBuilder sb = new StringBuilder();
		sb.append(x);
		sb.reverse();

		System.out.print("number reverse " +Integer.valueOf(String.valueOf(sb)));
		
		

	}

	public static void reverseString(String str) {
		char ch[] = str.toCharArray();

		int start = 0;
		int end = str.length() - 1;

		     char c = str.charAt(start);
		     char d = ch[start];

		     char y = c;
		     
		     System.out.println(y);

			while(start < end) {

				if (str.charAt(start) == ' ') {
					start++;
				}
				
				else if(str.charAt(end) == ' ') {
					end--;
				}
				
				else {
					char temp = ch[start];
					ch[start] = ch[end];
					//str.charAt(start) = str.charAt(end);
					ch[end]= temp;
					start++;
					end--;
					
				}
				
			}
			
			System.out.println(String.valueOf(ch));
		}
	

}
