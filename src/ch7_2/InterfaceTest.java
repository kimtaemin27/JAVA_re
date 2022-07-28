package ch7_2;

class A {
	public void methodA(B b) {
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodBb ()");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		A a = new A();
		a.methodA(new B());
		
	}

}
