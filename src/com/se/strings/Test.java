package com.se.strings;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test {
	
	public static void main(String[] args) throws ParseException {
		
		LocalDate today = findPrevDay(1, 12, 1986);

		String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formattedDate);
	}
	
	private static LocalDate findPrevDay(int DD, int MM, int YYYY)
    {
		LocalDate todayDate = LocalDate.of(YYYY,MM,DD);
        return todayDate.minusDays(1);
    }
	
}