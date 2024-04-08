package edu.ch07_Test;

public class Parent {
	
	private String name;
	
	public Parent() {
		this.name = "홍길동";
		System.out.println("Parent()");		
	}
	
	public Parent(String name) {
		this.name = name;
		System.out.println("parent(String name)");
	}
	
	public String getName() {
		return name;
	}

}
