package ch8;

import java.io.File;

public class ExceptionEx12 {

	public static void main(String[] args) {
		
		File f = createFile(args[0]);
		System.out.println(f.getName() + "create");

	}
	
	static File createFile(String fileName) {
		try {
		if(fileName == null || fileName.equals("")) {
			throw new Exception("유효하지 않은 파일 이름");
		} 
		}catch(Exception e) {
			fileName = "NoName.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch(Exception e) {
			
		}
	}

}
