package ch8;

public class FinallyTest3 {

	public static void main(String[] args) {
		
		FinallyTest3.method1();
		System.out.println("main() return");

	}
	
	static void method1() {
		try {
			System.out.println("method1 () try");
			return;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1 () finally");
		}
	}

}
