package ch11;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		String form = "b";
		String to = "d";
		
		set.add("abc");
		set.add("ailen");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range sercah : for " + form + " to " + to);
		System.out.println("result1 : " + set.subSet(form, to));
		System.out.println("result2 : " + set.subSet(form, to + "zzz"));
		
	}

}
