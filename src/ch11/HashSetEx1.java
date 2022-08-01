package ch11;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			// HashSet 에 objArr의 요소들을 저장한다
			set.add(objArr[i]);
		}
		// HashSet에 저장된 요소들을 출력한다
		System.out.println(set);

	}

}
