package com.ruby.java.ch11;

class NagativeNumberException extends Exception {
	public NagativeNumberException() {
		super("음수는 허용하지 않습니다.");
	}
		
//	public void charge(int time) throws NagativeNumberException {
//		if(time < 0) {
//			time = 0;
//			try {
//				throw new NagativeNumberException();
//			} catch(NagativeNumberException e) {
//				e.printStackTrace();				
//			}
//			
//		}
//		
//	}
	
	
	
	
}


public class ExTest {
	
	public void d() {
		throw new IndexOutOfBoundsException("에러가 발생했습니다.");
	}
	
	public void c() throws Exception {		
		System.out.println("C1");
//		int v = 10 / 0;		
		d();
		System.out.println("C2");
	}
	
	public void b() throws Exception {
		System.out.println("B1");
		c();
		System.out.println("B2"); 
	}
	public void a() {
		System.out.println("A1");	
		try {
			b();
		} catch (Exception e) {			
//			e.printStackTrace();
			System.out.println("오류발생 : " + e.getMessage());
		}
		System.out.println("A2");
	}
	
	public static void main(String[] args) {
		
		ExTest et = new ExTest();
		et.a();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	
		
		System.out.println("Fine!");
	}

	
}
