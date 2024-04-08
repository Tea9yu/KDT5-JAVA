package com.ruby.java.ch10.arraylist;

public class Professor extends Person {
	private String subject;
	
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;		
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return super.toString() + ":" + subject;
		
	}

}
