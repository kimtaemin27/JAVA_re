package ch4;

public class FlowEx1 {

	public static void main(String[] args) {
		
		int x = 0;
		System.out.println("x 가 0 일때, 참인 것");
		
		if(x == 0) {
			System.out.println("1x == 0");
		}
		
		if(x != 0) {
			System.out.println("2x != 0");
		}
		
		if(!(x == 0)) {
			System.out.println("3!(x == 0)");
		}
		
		if(!(x != 0)) {
			System.out.println("4!(x != 0)");
		}
		
		
		
		x = 1;
		System.out.println("x 가 1 일때, 참인 것");
		
		if(x == 0) {
			System.out.println("1x == 0");
		}
		
		if(x != 0) {
			System.out.println("2x != 0");
		}
		
		if(!(x == 0)) {
			System.out.println("3!(x == 0)");
		}
		
		if(!(x != 0)) {
			System.out.println("4!(x != 0)");
		}

	}

}
