package edu.ch08.polymorphism;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.print();
		
		myList.add("JAVA");
		myList.add("JSP");
		myList.add("Servlet");
		myList.add("Python");
		myList.add("Spring");
		myList.print();
		
		//===========================
		System.out.println("=".repeat(50));
		
		MyLinkedList2 myList2 = new MyLinkedList2();
		
		myList2.print();
		
		myList2.add("JAVA");
		myList2.add("JSP");
		myList2.add("Servlet");
		myList2.add("Python");
		myList2.add("Spring");
		
		
		myList2.add("JAVA", "C++");
		myList2.add("Servlet", "C#");
		
		myList2.delete("python");
		myList2.delete("JAVA");
		myList2.delete("Spring");
		
		myList2.print();

	}

}
