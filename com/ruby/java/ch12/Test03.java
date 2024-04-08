package com.ruby.java.ch12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("이름: ");
			String name = br.readLine();
			System.out.println("Hello " + name);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
