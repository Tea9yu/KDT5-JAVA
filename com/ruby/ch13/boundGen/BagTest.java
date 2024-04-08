package com.ruby.ch13.boundGen;

class Bag<T extends Solid> {
	private T thing;
	private String owner;
		
	public Bag(T thing) {
		this.thing = thing;		
	}
	
	public T getThing() {
		return thing;
	}
	
	public void  setThing(T thing) {
		this.thing = thing;
	}
	
		
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());		
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	 boolean isSameOwner(Bag<?> obj) {		// ? 와일드카드 = 어떤 클래스든 다 사용가능.
		 if (this.owner.equals(obj.getOwner()))
			 return true;
		 return false;
	 }
}

class Solid {}
class Liquid {}

class Book extends Solid {}
class PencilCase extends Solid {}
class Notebook extends Solid {}


class Water extends Liquid {}
class Coffee extends Liquid {}

public class BagTest {
	
	public static void main(String[] args) {
		
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
//		Bag<Water> bag4 = new Bag<>(new Water());
//		Bag<Coffee> bag5 = new Bag<>(new Coffee());
		
		bag.setOwner("홍길동");
		bag2.setOwner("홍길동");
		
		boolean result = bag.isSameOwner(bag2);
		if(result)
			System.out.println("소유자가 동일합니다.");
		else System.out.println("소유자가 다릅니다.");
	
		Object obj;
		obj.equals(obj);
		String s1 = "hello";
		s1.compareTo(s1);
		
				
				
	}


}
