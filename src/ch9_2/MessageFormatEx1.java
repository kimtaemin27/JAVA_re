package ch9_2;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		
		String msg = "Name: {0} \nTel: {1} \nAge:{2} \nBirthday: {3}";
		
		Object[] arguments = {"김태민" , "12-123-1234", "26", "07-30"};
		
		String result = MessageFormat.format(msg, arguments);
		
		System.out.println(result);
		
	}

}
