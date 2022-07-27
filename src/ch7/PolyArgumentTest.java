package ch7;

class Product4 {
	int price;
	int bonusPoint;

	Product4(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv4 extends Product4 {

	Tv4() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}

}

class Computer extends Product4 {
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
	
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product4 p) {
		if(money < p.price) {
			System.out.println("not enough money");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " buy");
	}
	
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv4());
		b.buy(new Computer());

		System.out.println("have money : " + b.money);
		System.out.println("have point : " + b.bonusPoint);
	}

}
