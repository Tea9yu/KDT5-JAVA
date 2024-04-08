package com.ruby.java.ch13;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int [] data = new int[20];
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++)
			data[i] = rnd.nextInt(100);
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i]+" ");
		System.out.println();
		Arrays.sort(data);
		
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i]+" ");

	}

}
