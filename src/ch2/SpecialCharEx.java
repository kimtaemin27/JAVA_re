package ch2;

public class SpecialCharEx {
	
	public static void main(String[] args) {
		
		// ''' 처럼 할 수 없다
		System.out.println('\'');
		// \b 에 의해 3이 지워진다
		System.out.println("abc\t123\b456");
		// 개행 ( new line ) 문자 출력하고 개행
		System.out.println('\n');
		System.out.println("\"Hello\"");
		System.out.println("c:\\");
		
	}

}
