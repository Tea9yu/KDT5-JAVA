package edu.ch06;

public class ArmorTest_1 {
	
	public void dowork() {
	Armor suit1 = new Armor();
	Armor suit2 = new Armor();
	Armor suit3 = new Armor();
	
	suit1.setName("mark6");
	suit1.setHeight(180);
	
	suit2.setName("mark16");
	suit2.setHeight(220);
	
	suit3.setName("mark38");
	suit3.setHeight(200);
	
	System.out.println(suit1.getName() + " : " + suit1.getHeight());
	System.out.println(suit2.getName() + " : " + suit2.getHeight());
	System.out.println(suit3.getName() + " : " + suit3.getHeight());
}

	public static void main(String[] args) { // static을 써야 main에서 호출할 수 있다. 왜? static이 main이기때문이다.
		ArmorTest_1 at = new ArmorTest_1(); // ArmorTest1에서 dowork를 호출하기 위해서 at을 사용하여 자신을 객체로 만들어 dowork를 호출 
		at.dowork();
	}
		
}
