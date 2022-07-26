package ch6;

class Car3{
	String color;
	String gear;
	int door;
	
	Car3(){
		this("white", "auto", 4);
	}
	
	Car3(Car3 c) {
		color = c.color;
		gear = c.gear;
		door = c.door;
	}
	
	Car3(String color, String gear, int door) {
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		
		Car3 c1 = new Car3();
		// c1 복사본 c2 생성
		Car3 c2 = new Car3(c1);
		
		System.out.println("c1 : " + c1.color + " , " + c1.gear + " , " + c1.door);
		System.out.println("c2 : " + c2.color + " , " + c2.gear + " , " + c2.door);
		
		c1.door = 100;
		System.out.println("c1.door = 100; after");

		System.out.println("c1 : " + c1.color + " , " + c1.gear + " , " + c1.door);
		System.out.println("c2 : " + c2.color + " , " + c2.gear + " , " + c2.door);

	}

}
