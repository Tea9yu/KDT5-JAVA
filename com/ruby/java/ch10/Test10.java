package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10 {

	public static void main(String[] args) {
		
		lotto_generator(5);

	}
	
	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<Integer> lotto = null;
		for(int i = 0; i < n; i++) {
			
			lotto = new HashSet<Integer>();
			
//			for(int j = 0; lotto.size() <= 6; j++) {	// j를 사용하지 않아서 초기화 선언과 증감식을 지워도 됨,
			while(lotto.size() <=6)	{					// while문을 사용할 수도 있다
				lotto.add(number.nextInt(45)+1);
			}
			
			List<Integer> L = new ArrayList<>(lotto);
			Collections.sort(L);
			System.out.println(L);
			
		}
		
	}

	

}
