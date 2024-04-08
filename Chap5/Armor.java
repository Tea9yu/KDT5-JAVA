package Chap5;
//클래스를 기술한 것이다
public class Armor {
	//필드
	private String name;
	private int height;
	int weight; //default => 접근제한지를 기술하지 않음
	String color;
	protected boolean isFly;
	
	//메소드
	void takeOff(){
		System.out.println(name); //접근하는 곳
	}
	void land () {}
	void shootlaser() {}
	void launchMissile() {}

	
}
