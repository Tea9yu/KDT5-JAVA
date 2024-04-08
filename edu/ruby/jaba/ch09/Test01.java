package edu.ruby.jaba.ch09;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Kim");
		String s1 = new String("Hong");
		Object obj1 = new Object();
		System.out.println(obj1.hashCode());
		System.out.println(Integer.toHexString(obj1.hashCode()));
		Object obj2 = new Object();
		if (obj1.equals(obj2))
			System.out.println("같다");
		else
			System.out.println("다르다");
		if (obj1 == obj2)
			System.out.println("같다");
		
		System.out.println(obj2.hashCode());
		Object obj3 = new Object();
		System.out.println(obj3.hashCode());
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
		System.out.println(obj1.toString());
//		System.out.println(obj);
//		MyObject obj4 = new Object();
//		
//		MyObjectSystem.out.println(obj1.hashCode()
				
//		obj1.hashCode();
//		if (s.compareTo(s1) < 0)
//			System.out.println();
		
			

	}

}
