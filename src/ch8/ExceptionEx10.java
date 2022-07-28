package ch8;

public class ExceptionEx10 {

	public static void main(String[] args) {
		
		method1();

	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1 에서 Exception 처리");
			e.printStackTrace();
		}
	}

}
