package ch4;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		
		System.out.println("숫자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input ==  0) {
			System.out.println("input == 0");
		} else {
			System.out.println("input != 0");
		}

	}

}
