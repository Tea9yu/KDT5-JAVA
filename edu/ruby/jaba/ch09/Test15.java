package edu.ruby.jaba.ch09;

import java.util.Arrays;
import java.util.Random;

public class Test15 {

	public static void main(String[] args) {
		int []data = new int[10];
		Random r1 = new Random();
		for (int i = 0; i < 10; i++) {
			data[i] = r1.nextInt(10);
			
//			System.out.println(r1.nextInt()+"\t");
//			System.out.println(r1.nextInt(10)+"\t");
//			System.out.println(r1.nextBoolean()+"\t");
//			System.out.println(r1.nextDouble()+"\t");
//			System.out.println();
			
		}
		for (int num: data)
			System.out.println(" " + num);
		System.out.println();
		
		System.out.println("================");
		Arrays.sort(data);
		for (int num: data)
			System.out.println(" " + num);
		System.out.println();
		System.out.println(Arrays.toString(data));

	}

	
}
