package ch7;

public class CastingTest2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		System.out.println(car instanceof FireEngine);
		car.drive();
		// error 형변환 에러 ( 실행시 에러 )
		// fe = (FireEngine)car;
		// fe.drive();
		// car2 = fe;
		// car2.drive();

	}

}
