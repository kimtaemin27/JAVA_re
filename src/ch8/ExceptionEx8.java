package ch8;

public class ExceptionEx8 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("발생시킨 예외");
			// 예외 발생시키키
			throw e;
			// 한줄로 줄이면
			// throw new Exception("발생시킨 예외");
		} catch (Exception e) {
			System.out.println("error message : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}
