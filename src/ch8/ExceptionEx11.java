package ch8;

public class ExceptionEx11 {

	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 에서 Exceptin 처리");
			e.printStackTrace();
		}

	}
	
	static void method1() throws Exception {
		throw new Exception ();
	}

}
