package ch6;

class Data1{
	int value;
}

class Data4{
	int value;
	
	// 매개변수가 있는 생성자
	Data4(int x){
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		// 기본 생성자 없어서 오류
		// Data2 d2 = new Data2();

	}

}
