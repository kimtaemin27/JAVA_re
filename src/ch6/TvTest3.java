package ch6;

class Tv3 {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

public class TvTest3 {

	public static void main(String[] args) {
		
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		
		System.out.println("t1 now channel : " +t1.channel);
		System.out.println("t2 now channel : " +t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1 change channel : " + t1.channel);
		
		System.out.println("t1 now channel : " +t1.channel);
		System.out.println("t2 now channel : " +t2.channel);
		
	}

}
