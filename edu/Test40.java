package edu;

public class Test40 {
	
	private static int sum(int a, int b) {
		int result = a + b;
		
		return result;
		
	}
	
	private static double avg(int ... a) {
		
		double sum = 0.0;
		for (int i = 0 ; i < a.length ; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	private static int min(int ... a) {
		// 최소값을 저장할 변수 선언
		int res = a[0];
	
		// 가변 길이 인수를 저장한 a의 길이만큼 반복한다.
		for (int i = 0; i < a.length ; i++) {
			if (a[i] < res) res = a[i];
		}
		return res; 
	}
	private static int max(int ... a) {
		// 최소값을 저장할 변수 선언
		int res = a[0];
			
		// 가변 길이 인수를 저장한 a의 길이만큼 반복한다.
		for (int i = 0; i < a.length ; i++) {
			if (res < a[i]) res = a[i];
		}
		return res;
	}	
	
	
	public static void main(String[] args) {
		
		int s = sum(10, 20);
		System.out.println("sum: " +s);
		System.out.println("avg: " + avg(1, 2, 3, 4,5));
		System.out.println("min: " + min(6, 4, 7, 2, 8,3));
		System.out.println("max: " + max(6, 4, 7, 2, 8,3));
		

	}

}
