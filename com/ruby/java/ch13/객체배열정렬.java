package com.ruby.java.ch13;

class Student implements Comparable<Student>{
	String sno;
	String sname;
	
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "("+ sno + " , " + sname +")";
	}
	@Override
	public int compareTo(Student s) {
		return Integer.parseInt(this.sno) - Integer.parseInt(s.sno);
//		if (result == 0)
//			return (this.sno.compareTo(sname));
//		return result;
	}
}
public class 객체배열정렬 {

	static void sortStudent(Student[]data) {
		Student temp;
		for (int i = 0; i < data.length;i++) 
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				}
			}
	}
	
	public static void main(String[] args) {
		Student [] data = {
				new Student("12", "홍길동"),
				new Student("121", "홍길순"),
				new Student("213", "홍길춘"),
				new Student("9", "홍길홍")
		};
		sortStudent(data);
		//Arrays.sort(data);//이게 문제가 있어서 sortStudent()를 구현
		for (Student st: data)
			System.out.print(" " + st);
	}

}