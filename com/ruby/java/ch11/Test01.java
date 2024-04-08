package com.ruby.java.ch11;

public class Test01 {

	public static void main(String[] args) {
		try {				
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("OK");
		} catch(ArrayIndexOutOfBoundsException e1) {
			
		} catch(NullPointerException e2) {
			
		}
	}

}
