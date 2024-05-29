package com.se.strings;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) throws ParseException {

		Map<String,Long> hmap=new HashMap<String, Long>();

		hmap.put("MNO", 50000L);
		hmap.put("DEF", 30000L);
		hmap.put("ABC", 2000L);
		hmap.put("XYZ", 99000L);
		hmap.put("CDE", 2000L);
		hmap.put("HIJ", 2000L);

		String key = hmap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.skip(1).findFirst().get().getKey();

		HashMap<String, Long> map = hmap.entrySet().stream().sorted(Map.Entry.comparingByValue())
						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		//System.out.println(key);
		//System.out.println(map);
	    Integer x=3, y=5;
		Test t1 = new Test();
		int sum = t1.sum(3, 6);
		System.out.println(factorial(-5));
		System.out.println(findTrailingZeros(-5));






	}

	public int sum(Integer x, Integer y){
		x = x +2;
		y = y+2;
		return x+y;
	}
	
	private static LocalDate findPrevDay(int DD, int MM, int YYYY)
    {
		LocalDate todayDate = LocalDate.of(YYYY,MM,DD);
        return todayDate.minusDays(1);
    }

	public static boolean isPrimeNumber(int n){
		for(int i=2; i<n/2; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}

	public static int reverse(int n){
		int temp = n;
		int rev =0;
		while(n!=0){
			int rem = n%10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
				return 0; // Overflow
			}
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
				return 0; // Underflow
			}
			rev = rev*10 + rem;
			n = n/10;

		}
		return rev;
	}

	public static int trailingZeros(int num)
	{
		int count = 0;
		while(num != 0)
		{
			int rem = num%10;

			if(rem == 0){
				++count;
			}else{
				break;
			}
			num = num/10;
		}
		return count;
	}

	static int findTrailingZeros(int n)
	{
		if (n < 0) // Negative Number Edge Case
			return -1;

		// Initialize result
		int count = 0;

		// Keep dividing n by powers
		// of 5 and update count
		for (int i = 5; n / i >= 1; i *= 5) {
			count += n / i;
		}
		return count;
	}

	public static int factorial(int n){
		int fact =1;
		for(int i=1; i<= n; i++){
			fact = fact*i;
		}
		return fact;
	}


	
}