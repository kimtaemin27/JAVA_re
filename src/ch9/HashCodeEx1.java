package ch9;

public class HashCodeEx1 {

	public static void main(String[] args) {
		
		String st1 = new String("abc");
		String st2 = new String("abc");
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(System.identityHashCode(st1));
		System.out.println(System.identityHashCode(st2));
		
	}

}
