package ch11;

import java.util.Stack;

public class StackEx1 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		
		printStatus();
		
		goBack();
		System.out.println("back button click");
		printStatus();
		
		goBack();
		System.out.println("back button click");
		printStatus();
		
		goForward();
		System.out.println("front button click");
		printStatus();
		
		goURL("naver.com");
		System.out.println("new address accept");
		printStatus();

	}
	
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("now : " + back.peek());
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	
	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}

}
