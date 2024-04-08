package edu.ch07_Game;

public class Game {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Tank t = new Tank();
		Firebat f = new Firebat();
		Wraith w =new Wraith();
		
		t.attack();
		
		m.attack();
		
		m.attack(t);
		
		f.attack();
		
		f.attack(t);
		
		w.attack(f);
		

	}

}
