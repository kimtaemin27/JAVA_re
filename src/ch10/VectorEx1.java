package ch10;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) throws Exception {
		
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();
		System.out.println("after trimToSize()");
		print(v);
		
		v.ensureCapacity(6);
		System.out.println("after ensureCapacity()");
		print(v);
		
		v.setSize(7);
		System.out.println("after setSize()");
		print(v);
		
		v.clear();
		System.out.println("after clear()");
		print(v);
		
	}
	
	public static void print (Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		System.out.println();
	}

}
