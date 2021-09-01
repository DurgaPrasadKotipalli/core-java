package com.se.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class FriendsMeeting {

	public static void main(String[] args) {
		FriendsMeeting fm = new FriendsMeeting();
		
		LocalDate start1 = LocalDate.of(2019, Month.JANUARY, 12);
		LocalDate end1 = LocalDate.of(2019, Month.JANUARY, 18);
		LocalDate start2 = LocalDate.of(2019, Month.JANUARY, 16);
		LocalDate end2 = LocalDate.of(2019, Month.JANUARY, 18);
		System.out.println(fm.findCommonDays(start1, end1, start2, end2));

	}
	
	
	public int findCommonDays(LocalDate startDateF1, LocalDate endDateF1, LocalDate startDateF2, LocalDate endDateF2) {
		
		List<LocalDate> datesOfF1 = new ArrayList<LocalDate>();
		List<LocalDate> datesOfF2 = new ArrayList<LocalDate>();
		List<LocalDate> commonDates = new ArrayList<LocalDate>();
		
		endDateF1 = endDateF1.plusDays(1);
		endDateF2 = endDateF2.plusDays(1);
		
		LocalDate current = startDateF1;
		while (current.isBefore(endDateF1)) {
			datesOfF1.add(current);
		    current = current.plusDays(1);
		}
		
		current = startDateF2;
		while (current.isBefore(endDateF2)) {
			datesOfF2.add(current);
		    current = current.plusDays(1);
		}
		
		for(int i=0; i<datesOfF1.size(); i++) {
			
			for(int j=0; j< datesOfF2.size(); j++) {
				if( datesOfF1.get(i).isEqual(datesOfF2.get(j)) ) {
					commonDates.add(datesOfF1.get(i));
				}
				
			}
		}
		System.out.println(commonDates);
		
		//LocalDate startDate = LocalDate.now();
		//LocalDate endDate = startDate.plusMonths(2);
		 
		long numOfDays = ChronoUnit.DAYS.between(startDateF1, endDateF1);
		          
		List<LocalDate> listOfDates = LongStream.range(0, numOfDays)
		                                .mapToObj(startDateF1::plusDays)
		                                .collect(Collectors.toList());
		
		System.out.println(listOfDates);
		return commonDates.size();
	}

}
