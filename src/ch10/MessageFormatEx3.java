package ch10;

import java.text.MessageFormat;

public class MessageFormatEx3 {

	public static void main(String[] args) throws Exception {
		
		
		String[] data = {
				"INSEERT INTO CUST_INFO VALUES ('김태민', '12-123-1234', '26', '07-31');",
				"INSEERT INTO CUST_INFO VALUES ('홍길동', '12-345-6789', '27', '07-30');"
		};
		
		String pattern = "INSEERT INTO CUST_INFO VALUES ({0}, {1}, {2}, {3});";
		MessageFormat mf = new MessageFormat(pattern);
		
		for(int i=0; i<data.length; i++) {
			Object[]objs = mf.parse(data[i]);
			for(int j=0; j<objs.length; j++) {
				System.out.print(objs[j] + " , ");
			}
			System.out.println();
		}
		
	}

}
