package com.ruby.java.ch14;

/*
 * public interface Comparator<T>{
 *    public int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Student {
	String sno;
	String sname;

	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	public String toString() {
		return "[" + sno + ", " + sname + "]";
	}

}

public class test_객체배열정렬_강태규 {
	static void sortStudent(Student[] data, Comparator<Student> comp) {
		Student temp;
		for (int i = 0; i < data.length; i++)
			for (int j = i + 1; j < data.length; j++) {
				if (comp.compare(data[i], data[j]) > 0) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
	}
	
	public static void main(String[] args) {
		Comparator<Student> compNo = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// sno를 사용한 비교
				return Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno);
			}
		};
		Comparator<Student> compName = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				// sname을 사용한 비교
				return s1.sname.compareTo(s2.sname);
			}
		};
		Student[] data = {
				new Student("12", "홍길동"), 
				new Student("12", "홍길순"), 
				new Student("213", "홍길춘"), 
				new Student("9", "홍길홍")
				};
//		sortStudent(data, compName);
//		 Arrays.sort(data, compName);//이게 문제가 있어서 sortStudent()를 구현
		// Collections.sort(data, comp);
	
		Arrays.sort(data, new Comparator<Student>() {
		
		@Override 
		public int compare(Student s1, Student s2) {
			int result = Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno);
			{
				if (result == 0 ) s1.sname.compareTo(s2.sname);
				return result;
			}
			
		}
		});
		 
		for (Student st : data)
			System.out.print(" " + st);
		
	}

}
