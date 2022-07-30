package ch9_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
		
		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.",
							"c0", "car", "combat", "count", "date", "disc"};
		// c 로 시작하는 소문자 영단어
		Pattern p = Pattern.compile("c[a-z]*");
		
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) {
				System.out.print(data[i] + " , ");
			}
		}

	}

}
