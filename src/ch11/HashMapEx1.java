package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id and password put");
			System.out.println("id : ");
			String id = s.nextLine().trim();
			
			System.out.println("password : ");
			String password = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("not found id" + " try again");
				continue;
			} 
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("not correct password");
			} else {
				System.out.println("success");
				break;
			}
		}

	}

}
