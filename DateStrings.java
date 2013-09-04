/* File: DateStrings.java
 * ----------------------
 * This file converts three memorable
 * dates into date strings consisting of
 * the date followed by the first three letters
 * of the month and then the last two digits of the year.
 * 
 * The Art and Science of Java, Chapter 8, Exercise 4.
 */

import acm.program.*;

public class DateStrings extends ConsoleProgram {
	public void run() {
		println(createDateString("05","09","1978"));
		println(createDateString("03","05","2009"));
		println(createDateString("21","09","2013"));
	}
	private String createDateString(String day, String month, String year) {
		String dateString = day + "-" + monthToString(month) + "-" + shortenYear(year);
		return dateString;
	}
	
	private String monthToString(String month) {
		if (month.equals("01") || month.equals("1")) return "Jan";
		else if (month.equals("02") || month.equals("2")) return "Feb";
		else if (month.equals("03") || month.equals("3")) return "Mar";
		else if (month.equals("04") || month.equals("4")) return "Apr";
		else if (month.equals("05") || month.equals("5")) return "May";
		else if (month.equals("09") || month.equals("6")) return "Sep";
 		else return "invalid month";
	}
	
	private String shortenYear(String year) {
		String shYear = year.substring(year.length()-2);
		return shYear;
	}
}