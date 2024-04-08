package edu.ch08.polymorphism;

enum EStatus {
	READY, SEND, COMPLETE, CLOSE
}
public class NonEumTest2 {

	public static void main(String[] args) {
		EStatus work = null;
		int n = 4;
		
		switch (n) {
		case 1:
			work = EStatus.READY;
		case 2:
			work = EStatus.SEND;
		case 3:
			work = EStatus.COMPLETE;
		case 4:
		default:
			work = EStatus.CLOSE;
		
		}
		System.out.println("현재 작업 상태 : " + work.toString());

	}

}
