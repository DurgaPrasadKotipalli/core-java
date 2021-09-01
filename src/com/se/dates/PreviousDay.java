package com.se.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PreviousDay {

	public static void main(String[] args) {
		
		LocalDate today = findPrevDay(1, 12, 1986);
        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formattedDate);

	}
	
	private static LocalDate findPrevDay(int DD, int MM, int YYYY)
    {
		LocalDate todayDate = LocalDate.of(YYYY,MM,DD);
		System.out.println(todayDate.getDayOfWeek());
        return todayDate.minusDays(1);
    }

}
