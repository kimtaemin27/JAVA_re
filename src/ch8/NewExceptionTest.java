package ch8;

public class NewExceptionTest {

	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFiles();
		} catch(SpaceException e) {
			System.out.println("error : " + e.getMessage()) ;
			e.printStackTrace();
		} catch(MemoryException me) {
			System.out.println("error : " + me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("re - install");
		} finally {
			deleteTempFiles();
		}

	}
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("not enough");
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("not enough memory");
		}
	}
	static void copyFiles() {
		
	}

	static void deleteTempFiles() {
		
	}

	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인
		return false;
	}

	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간 확인
		return true;
	}

}





class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	public MemoryException(String msg) {
		super(msg);
	}
}
