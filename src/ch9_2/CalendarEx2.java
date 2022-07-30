package ch9_2;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = { "","일", "월", "화","수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2015, 07, 15);
		System.out.println("dat1 : " + toString(date1) + date1.DAY_OF_WEEK );
		System.out.println("date 2 : " + toString(date2) + date2.DAY_OF_WEEK);
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis());
		System.out.println(difference);
		System.out.println(difference/(24*60*60));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + " 년" + date.get(Calendar.MONTH) + " 월" + date.get(Calendar.DATE) + " 일";
	}

}
