package Chap6_Sorting;

import java.util.Scanner;

class MergeArray {
	static int[] buff;	// 작업용 배열
	
	
	static void __mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int i;
			int mid = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			__mergeSort(a, left, mid);			// 배열의 앞부분을 병합 정렬
			__mergeSort(a, mid + 1, right);		// 배열의 뒷부분을 병합 정렬
			
			for (i = left; i <= mid; i++)
				buff[p++] = a[i];
			
			while (i <= right && j < p)
				a[k++] = (buff[j] <= a[i]) ? buff[j++]: a[i++];
			
			while (j < p)
				a[k++] = buff[j++];
		}	
	
	}		
		
	// 병합 정렬
	static void mergeSort(int[] a, int n) {
		buff = new int[n];			// 작업용 배열을 생성
		
		__mergeSort(a, 0, n - 1);	// 배열 전체를 병합 정렬
		
		buff = null;				// 작업용 배열을 해체
		
	}
	
	static void showData(int[] a) {
		System.out.println();
		for (int merge : a) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] a = {2, 4, 6, 8 , 11, 13, 1, 2, 3, 4, 9, 16, 21};		
		
		showData(a);
		System.out.println("두 배열을 병합");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		mergeSort(a, a.length);	// 배열 a를 병합 정렬
				
		System.out.println("배열 a: ");
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
	}

}
