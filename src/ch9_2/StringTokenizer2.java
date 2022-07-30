package ch9_2;

public class StringTokenizer2 {

	public static void main(String[] args) {
		
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()" , true);

	}

}
