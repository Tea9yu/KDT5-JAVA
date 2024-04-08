package Chap_3장검색;

import java.util.Arrays;
import java.util.Random;
public class Test_실습3_4정수배열이진탐색 {
	static void inputData(int [] data) {
		Random rd = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rd.nextInt(100) + 1;
		}

		// 난수 생성 입력		
	}
	static void showData(int[] data) {	
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			
		}
	}
	static void sortData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
	}
	static int linearSearch(int [] data, int key) {
		for (int i = 0; i < data.length; i++) 
			if(data[i] == key)
				return i;
		return -1;
			
		
	}
	static int binarySearch(int [] data, int key) {
		int il = 0;
		int ir = data.length - 1;
		
		do {
			int ic = (il + ir) / 2;
			if (data[ic] == key)
				return ic;
			else if (data[ic] < key)
				il = ic + 1;
			else
				ir = ic - 1;
		} while (il <= ir);
		
		return -1;
		
	}
	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		showData(data);
		sortData(data);
		System.out.println();
		for (int num: data) {
			System.out.print(num+" ");
		}
		int key = 33;
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = 39;
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);

	}

}
