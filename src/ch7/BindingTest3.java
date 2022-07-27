package ch7;

public class BindingTest3 {

	public static void main(String[] args) {
		
		Parent5 p = new Child5();
		Child5 c = new Child5();
		Parent5 rp = new Parent5();
		
		System.out.println("p.x : " + p.x);
		p.method();
		
		System.out.println("c.x : " + c.x);
		c.method();
		
		System.out.println("rp.x : " + rp.x);
		rp.method();
		
	}

}

class Parent5 {
	int x = 100;
	
	void method() {
		System.out.println("parent method");
	}
}

class Child5 extends Parent5 {
	int x = 200;
	
	@Override
	void method() {
		System.out.println("child ---x : " + x);
		System.out.println("super.x : " + super.x);
		System.out.println("this.x : " + this.x);
	}
	
}
