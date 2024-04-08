package edu.ch07_Game;

public class Firebat extends Unit {
	
	public Firebat() {
		super(60L);
	}
	
	@Override
	public void attack() {		
		super.attack();
		System.out.println("화염방사기를 쏩니다.");
	}
	
	public void attack(Tank t) {
		t.attacked(this);
	}
	public void attacked(Wraith wraith) {
		super.setHealth(super.getHealth() - Unit.W2F);
		
	}

}
