package ch7;

public class BindingTest {

	public static void main(String[] args) {
		
		Parent3 p = new Child3();
		Child3 c = new Child3();
		Parent3 rp = new Parent3();
		
		System.out.println("p.x : " + p.x);
		p.method();
		
		System.out.println("c.x : " + c.x);
		c.method();
		
		System.out.println("rp.x : " + rp.x);
		rp.method();

	}

}

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("parent method");
	}
}

class Child3 extends Parent3 {
	int x = 200;
	
	void method() {
		System.out.println("child method");
	}
}
