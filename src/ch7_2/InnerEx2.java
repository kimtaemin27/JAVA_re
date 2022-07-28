package ch7_2;

public class InnerEx2 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class instanceInner2 {
		int ilv = outerIv;
		int liv2 = outerCv;
	}
	
	static class StaticInner2 {
		//	 static 클래스는 외부 클래스의 인스턴스 멤버에 직접 접근할 수 없다
		// int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner2 {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}


}
