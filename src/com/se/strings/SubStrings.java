package com.se.strings;

import java.util.ArrayList;
import java.util.List;

public class SubStrings {

	public static void main(String[] args) {

		List<String> dates = new ArrayList<>();
		dates.add("20th Oct 2052");
		dates.add("6th Jun 1933");
		dates.add("26th May 1960");
		dates.add("25th May 1912");

		SubStrings sub = new SubStrings();
		List<String> result = sub.preprocessDate(dates);
		System.out.println(result);

	}

	public static List<String> preprocessDate(List<String> dates) {
		
		List<String> output = new ArrayList<>();

		for (int i = 0; i < dates.size(); i++) {

			String input[] = dates.get(i).split(" ");

			String day = input[0].length() == 4 ? input[0].substring(0, 2) : "0" + input[0].substring(0, 1);

			output.add(input[2] + "-" + getMonth(input[1]) + "-" + day);

		}
		
		return output;

	}

	private static String getMonth(String month) {

		String output = "";

		switch (month) {
		case "Jan":
			output = "01";
			break;
		case "Feb":
			output = "02";
			break;
		case "Mar":
			output = "03";
			break;
		case "Apr":
			output = "04";
			break;
		case "May":
			output = "05";
			break;

		case "Jun":
			output = "06";
			break;
		case "Jul":
			output = "07";
			break;
		case "Aug":
			output = "08";
			break;
		case "Sep":
			output = "09";
			break;
		case "Oct":
			output = "10";
			break;
		case "Nov":
			output = "11";
			break;
		case "Dec":
			output = "12";
			break;

		default:
			output = "0";
		}

		return output;

	}
}
