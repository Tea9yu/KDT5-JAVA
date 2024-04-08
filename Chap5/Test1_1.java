package Chap5;

public class Test1_1 {
	public static int f(int x) {
		int value;
		value = 2 * x * x + 4 * x + 5;
		return value;
	}
	public static void main(String[] args) {
		int y;
		y = f(2);
		System.out.println("y= " + y);
		Armor arm = new Armor ();
		arm.name = "홍길동";
		arm.weight = 10; //weight가 default 선언
		arm.color = "red";
		
		
	}
}
