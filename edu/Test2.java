package edu;

public class Test2 {

	public static void main(String[] args) {
		double a =3.14F;//코드에서 실수 3.14는 double로 해석: default로 해석
		byte num1 = 1;
		short num2 = 20;
		long num3 = 300;
		long depositAmount = 2147483648l;
		depositAmount = 50000;
		boolean isMarried = true;
		char gender = 'F';
		gender = 'M';
		String greet = "Good Moring";//greet가 참조변수이다
		//sysout ctrl + spacebar
		System.out.println(greet + "\n" + isMarried + "\t" + gender);
	}

}