package ch2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력 >");
		String input = scanner.nextLine();
		// 입력받은 문자열 숫자로 변환
		int num = Integer.parseInt(input);
		
		System.out.println("입력 내용 : " + input);
		System.out.printf("num=%d%n", num);
		
	}

}
