package Chap3;

public class Test31while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		while (i < 10) {
			j = 1;
			while (j < 10) {
				System.out.println("  " + i + "*" + j + "=" + (i * j));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
