package ch7;

class MyParent{
	// 같은 클래스
	private int prv;
	// 같은 패키지
	int dft;
	// 패키지 + 자손
	protected int prt;
	// 제한 없음 
	public int pub;
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest {

	public static void main(String[] args) {
		
		MyParent p = new MyParent();
		// error 
		// System.out.println(p.prv);
		// 나머지는 상관 없음
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);

	}

}
