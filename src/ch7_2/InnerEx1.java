package ch7_2;

public class InnerEx1 {
	
	class InstanceInner {
		int iv = 100;
		// error static 변수 선언 불가
		// static int cv = 100;
		// final static 는 상수 임으로 허용
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		// static 클래스만 static 멤버 정의 가능
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
			// error static 변수 선언 불가
			// static int cv = 300;
			// final static 는 상수 임으로 허용
			final static int CONST = 300;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

	}

}
