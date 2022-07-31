package ch10;

import java.text.MessageFormat;

public class MessageFormatEx2 {

	public static void main(String[] args) {
		
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO" + tableName + " VALUES (''{0}'',''{1}'',{2},''{3}'');";
		
		Object[][] arguments = {
				{"김태민", "12-123-1234", "26", "07-31"},
				{"홍길동", "12-345-6789", "27", "07-30"}
		};
		
		for(int i=0; i<arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}

	}

}
