package ch7;

class Time3 {
	private int hour;
	private int minute;
	private int second;
	
	Time3() {
		
	}
	
	Time3(int hour, int minute, int second) {
		hourTest(hour);
		minuteTest(minute);
		secondTest(second);
	}
	
	private void hourTest(int hour) {
		if (hour<0 || hour>23) {
			return;
		} else {
			setHour(hour);
		}
	}
	
	public int getHour() {
		return hour;
	}
	
	private void setHour(int hour) {
		this.hour = hour;
	}
	
	private void minuteTest(int minute) {
		if(minute < 0 || minute > 59) {
			return;
		} else {
			setMinute(minute);
		}
	}
	
	public int getMinute() {
		return minute;
	}
	
	private void setMinute(int minute) {
		this.minute = minute;
	}
	
	private void secondTest (int second) {
		if(second<0 || second>59) {
			return;
		} else {
			setSecond(second);
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	private void setSecond(int second) {
		this.second = second;
	}
	
	public String toString() {
		return hour + " : " + minute + " : " + second ;
	}
	
}

public class TimeTest2 {

	public static void main(String[] args) {
		
		Time3 t = new Time3(12, 35, 30);
		System.out.println(t);

	}

}
