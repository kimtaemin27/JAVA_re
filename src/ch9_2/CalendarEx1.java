package ch9_2;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("this year :" + today.get(Calendar.YEAR));
		System.out.println("month : " + today.get(Calendar.MONTH));
		System.out.println("week of year : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("week of month : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("month of date : " + today.get(Calendar.DATE));
		System.out.println("month of day : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("day of year : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("today : " + today.get(Calendar.DAY_OF_WEEK));
		
		
	}

}
