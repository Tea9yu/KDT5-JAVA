package edu.ch08.polymorphism;

public class MyLinkedList2 {
	
	// 링크드리스트이 시작 노드의 참조값
	private Node head = null;
	
	// 내부클래스
	private class Node {
		private String data;	// 데이터를 저장하는 필드변수
		private Node prev;
		private Node next;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	private Node find(String data) {
		if (head == null) return null;
		
		Node next = head;
		do {
			if (next.data.equals(data))
				return next;
			next = next.next;
		} while (next !=null);
		return null;
	}
	
	public void delete(String data) {
		Node node = find(data);
		
		if (node == null) return;
		
		Node p = node.prev;
		Node n = node.next;
		if (p != null && n != null) {
			p.next = n;
			n.prev = p;			
		} else if (p == null && n != null) {
			n.prev = null;
			head = n;
		} else if (p != null && n == null) {
			p.next = null;		
		}
	}
	
	private boolean isDuplicated(String data) {
		Node fnode = find(data);
		if(fnode != null) {
			System.out.println("["+data+"]는 이미 존재하는 데이터입니다.");
			return true;
		}
		return false;
				
	}
	
	public void add(String prev, String data) {
		if (isDuplicated(data)) return;
		
		Node node = find(prev);
		if (node == null)
			add(data);
		else { 
			Node newNode = new Node(data);
			newNode.prev = node;
			newNode.next = node.next;
			node.next.prev = newNode;
			node.next = newNode;
		}
	}
	
	public void add(String data) {
		if (isDuplicated(data)) return;
		
		Node temp = head;
		Node newNode = new Node(data);
		if (head == null) {			
			head = newNode;				// head가 null이면 head는 newNode이다
		} else {					
			while(temp.next != null) {	// temp.next가 null이면 next는 temp.next이다.
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}
	
	
	public void print() {
		if(head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (true) {
				System.out.println(next.data);
				
				if (next.next == null)
					break;
				
				next = next.next;
			}
			
			System.out.println("-".repeat(20));
			while (next != null) {
				System.out.println(next.data);
				next = next.prev;
			}
			
		}
	}

}
