package edu;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1 = 10;
		int A2 = -A1;
		A2 += 10; //A2 = A2 + 10; 와 같다
		
		
		//A1++;// A1 = A1 + 1 같다
		int A3 = A1++ + A2++;
		System.out.println(A3);
		System.out.println("A1 = " + A1 + " A2 = " + A2);
		System.out.println(A1 == A2);//논리연산자
		char gender = 'F';
		int balance = 100;
		System.out.println(!(gender !='F' ) || balance++ > 10);
	}

}
