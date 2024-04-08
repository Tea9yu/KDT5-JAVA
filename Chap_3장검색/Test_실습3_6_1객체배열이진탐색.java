package Chap_3장검색;


import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{
	String name;
	int height;
	double vision;
	
	public PhyscData (String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision= vision; 
	}
	public String toString() {
		return (name + " " + height + " " + vision);
	}
	
	@Override
	public int compareTo(PhyscData o) {
		int resultName = this.name.compareTo(o.name);		
		if (resultName != 0) {
			return resultName;
		}
		int resultHeight = Integer.compare(this.height, o.height);
		if (resultHeight != 0) {
			return resultHeight;			
		}		
		return Double.compare(this.vision, o.vision);		
	}

}
public class Test_실습3_6_1객체배열이진탐색 {

	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("길동", 182, 0.6),
				new PhyscData("길동", 167, 0.2),
				new PhyscData("길동", 167, 0.5),
		};
		showData(data);
		sortData(data);
		showData(data);
		PhyscData key = new PhyscData("길동", 167, 0.2);
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);
		key = new PhyscData("길동", 167, 0.5);

		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
	}		
	private static int linearSearch(PhyscData[] data, PhyscData key) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].compareTo(key) == 0)
				return i;
		}
		return -1;
	}
	private static int binarySearch(PhyscData[] data, PhyscData key) {
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

	private static void sortData(PhyscData[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) >0) {
					swap (data, i , j);
				}
			}
		}
	
}

	private static void swap(PhyscData[] data, int i, int j) {
		PhyscData temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		
	}


	static void showData(PhyscData[]arr) {
		System.out.println();
		for (PhyscData o: arr) {
			System.out.print("(" + o.name + ", " + o.height + ", " + o.vision +") ");
		}
		System.out.println();
	}


}
