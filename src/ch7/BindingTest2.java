package ch7;

public class BindingTest2 {

	public static void main(String[] args) {
		
		Parent4 p = new Child4();
		Child4 c = new Child4();
		Parent4 rp = new Parent4();
		
		System.out.println("p.x : " + p.x);
		p.method();
		
		System.out.println("c.x : " + c.x);
		c.method();
		
		System.out.println("rp.x : " + rp.x);
		rp.method();
		
	}

}

class Parent4 {
	int x = 100;
	
	void method() {
		System.out.println("parent method");
	}
}

class Child4 extends Parent4 {
	
}
