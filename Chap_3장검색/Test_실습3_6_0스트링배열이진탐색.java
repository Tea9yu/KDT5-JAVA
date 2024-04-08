package Chap_3장검색;


//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
public class Test_실습3_6_0스트링배열이진탐색 {
	static void showData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	static void swap(String[] data, int i, int j) {
		String temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	static void sortData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {				
				if (data[i].compareTo(data[j]) >0) {
					swap(data, i, j);
				}
			}
		}
	}
	static int linearSearch(String[] data, String key) {
		for (int i = 0; i < data.length; i++) 
			if (data[i].compareTo(key) == 0)
				return i;
		return -1;
		
	}
	static int binarySearch(String[] data, String key) {
		int il = 0;
		int ir = data.length - 1;
		
		do {
			int ic = (il + ir) / 2;
			if (data[ic].compareTo(key) == 0)
				return ic;
			else if (data[ic].compareTo(key) < 0)
				il = ic + 1;
			else 
				ir = ic - 1;					
		} while (il <= ir);
		
		return -1;
				
	}
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "감", "배", "사과", "포도", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData(data);
		sortData(data);
		showData(data);

		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);

	}


}
