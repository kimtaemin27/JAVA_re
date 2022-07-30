package ch9_2;

public class StringTokenizer {

	public static void main(String[] args) {
		
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
