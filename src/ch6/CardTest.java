package ch6;

class Card {
	// 카드의 무늬와 숫자는 각카드들 마다 다른 값 임으로 인스턴스 변수
	String kind;
	int number;
	// 카드의 크기는 모든 인스턴스가 가져야 할 공통사항 임으로 클래스 변수
	static int width = 100;
	static int height = 250;
}

public class CardTest {

	public static void main(String[] args) {
		
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		// width, height 는 클래스 이름 . 으로 접근하는 것이 맞음
		System.out.println("c1 kinde : " + c1.kind + " c1 number : " + c1.number + " c1 height" + c1.height + " c1 width" + c1.width);
		System.out.println("c2 kinde : " + c2.kind + " c2 number : " + c2.number + " c2 height" + c2.height + " c2 width" + c2.width);
		
		c1.width = 50;
		c1.height = 80;
		
		// c1, c2 모두 같은 클래스 변수를 공유하기 때문에 같이 변경됨
		System.out.println("c1 kinde : " + c1.kind + " c1 number : " + c1.number + " c1 height" + c1.height + " c1 width" + c1.width);
		System.out.println("c2 kinde : " + c2.kind + " c2 number : " + c2.number + " c2 height" + c2.height + " c2 width" + c2.width);
		
	}

}
