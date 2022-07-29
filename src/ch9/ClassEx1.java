package ch9;

final class Card3 {
	String kind;
	int num;
	
	Card3() {
		this("SPADE", 1);
	}
	
	Card3(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Card3 [kind=" + kind + ", num=" + num + "]";
	}
	
	
}

public class ClassEx1 {

	public static void main(String[] args) throws Exception {
		
		Card3 c = new Card3("HEART", 3);
		Card3 c2 = Card3.class.newInstance();
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());

	}

}
