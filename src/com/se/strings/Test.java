package com.se.strings;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) throws ParseException {
		
		LocalDate today = findPrevDay(1, 12, 1986);

		String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formattedDate);
		List<String> list = List.of("foo", "bar", "baz");

		list.add("baz");
		System.out.println(list);
	}
	
	private static LocalDate findPrevDay(int DD, int MM, int YYYY)
    {
		LocalDate todayDate = LocalDate.of(YYYY,MM,DD);
        return todayDate.minusDays(1);
    }
	
}