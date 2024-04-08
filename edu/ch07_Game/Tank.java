package edu.ch07_Game;

public class Tank extends Unit {
	public Tank() {
		super(100L);
	}
	@Override
	public void attack() {
		super.attack();
		System.out.println("포를 쏩니다.");
	}
	
	public void attacked(Marine marine) {
		super.setHealth(super.getHealth() - Unit.M2T);
	}
	public void attacked(Firebat Firebat) {
		super.setHealth(super.getHealth() - Unit.F2T);
		
	}

}
