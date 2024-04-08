import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysTest {
	
	public static void sortArray(int[] arr) {
		Arrays.sort(arr);		
		
	}
	
	public static void Matrix() {
		
			
	}
	public static void main(String[] args) {
		// 데이터 생성
		Random rd= new Random();
		
		int[] array = new int [24];
		for (int i = 0; i < 24 ; i++) {
			array[i] = rd.nextInt(101);
		}
		System.out.println(Arrays.toString(array));
		
		// 배열 정렬 & 출력
		sortArray(array);
		System.out.println(Arrays.toString(array));
				
		// 행렬 생성		
		Matrix mA = new Matrix(array, 0, 3, 4);
		mA.print();
		Matrix mB = new Matrix(array, 12, 3, 4);
		mB.print();
							
		// 행렬합
//		System.out.println("행렬 합을 출력합니다.");
//		Matrix mC = Matrix.sum(mA, mB);
//		if ( mC != null) mC.print();
		
		// 행렬 생성
//		Matrix mD = new Matrix(array, 0, 4, 3);
//		mD.print();
//		Matrix mE = new Matrix(array, 12, 3, 4);
//		mE.print();
		
		// 행렬곱
//		System.out.println("행렬 곱을 출력합니다.");
//		Matrix mF = Matrix.multiple(mD, mE);
//		if (mF != null) mF.print();

	}

	
}
