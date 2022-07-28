package ch7_2;

public class InterfaceTest3 {

	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA3();

	}

}


class A3 {
	void methodA3() {
		I3 i = InstanceManager.getInstance();
		i.methodB3();
		System.out.println(i.toString());
	}
}

interface I3 {
	public abstract void methodB3();
}

class B3 implements I3 {
	public void methodB3() {
		System.out.println("methodB3 in B3 class");
	}
	public String toString() {
		return "class B3";
	}
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3();
	}
}
