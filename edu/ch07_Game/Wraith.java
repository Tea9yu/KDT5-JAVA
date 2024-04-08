package edu.ch07_Game;

public class Wraith extends Unit {
	
	public Wraith() {
		super(90L);		
	}
	
	public void attack(Firebat f) {
		super.attack();
		System.out.println("레이저를 쏩니다.");
	}
	
	public void attacked(Firebat f) {
		f.attacked(this);
	}

}
