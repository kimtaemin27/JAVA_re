package ch9_2;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = { "","일", "월", "화","수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2015, 07, 15);
		System.out.println("dat1 : " + date1.toString() + date1.DAY_OF_WEEK );
		
	}

}
