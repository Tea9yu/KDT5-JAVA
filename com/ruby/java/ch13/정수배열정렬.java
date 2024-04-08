package com.ruby.java.ch13;

import java.util.Arrays;
import java.util.Random;

public class 정수배열정렬 {

	public static void main(String[] args) {
		int [] data = new int[20];
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++)
			data[i] = rnd.nextInt(100);
		for (int i = 0; i < data.length; i++)	
			System.out.print(data[i]+" ");
		Arrays.sort(data);
		System.out.println();
		for (int i = 0; i < data.length; i++)	
			System.out.print(data[i]+" ");	
		//출력 

	}

}
