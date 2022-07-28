package ch7_2;

public class DefaultMethodTest {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method1();
		c.method2();
		Myinterface.staticMethod();
		Myinterface2.staticMethod();
		
	}

}

class Child extends Parent implements Myinterface, Myinterface2 {
	public void method1() {
		System.out.println("method1() in child");
	}
}

class Parent {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface Myinterface {
	default void method1() {
		System.out.println("method1() in Myinterface");
	}
	default void method2() {
		System.out.println("method2() in Myinterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in Myinterface");
	}
}

interface Myinterface2 {
	default void method1() {
		System.out.println("method1() in Myinterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in Myinterface2");
	}
}
