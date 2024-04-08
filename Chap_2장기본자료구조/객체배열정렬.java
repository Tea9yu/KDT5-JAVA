package Chap_2장기본자료구조;

class PhyscData2 implements Comparable<PhyscData2>{	
	String name;
	int height;
	double vision;
	
	public PhyscData2 (String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	
	public String toString() {
		return "(" + name + "," + height + "," + vision + ")";
	}
	
	@Override
	public int compareTo (PhyscData2 p) {
		return p.name.compareTo(p.name);
	}
}
public class 객체배열정렬 {

	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("홍동", 164, 1.3),
				new PhyscData2("홍길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("이길동", 182, 0.6),
				new PhyscData2("박길동", 167, 0.2),
				new PhyscData2("최길동", 169, 0.5),
		};
		showData(data);
		sortData(data);
		private static void sortData(PhyscData2[] data) {
		String = temp;
			for (int i = 0; i < data.length; i++)
				for ( int j = i+1; j < data.length; j++) {
					if (p.compare(data[i], data[j] > 0)) {
						temp = data[i];
						data[i] = data[j];
						data[j] = temp;
						
					}
				}			
		}
		showData(data);
	}


}
