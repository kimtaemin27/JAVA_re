package ch4;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		
		int input;
		
		System.out.println("숫자 입력 >");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("0");
		}
		
		if(input != 0) {
			System.out.println("not 0");
			System.out.println("now : " + input);
		}

	}

}
