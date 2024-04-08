package Chap3;

public class chapt3whileteach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			int j =1 ;
			do {
				if (j > 5)
					continue;
			System.out.println(i + "*" +j+"="+i*j+"");
			//j++;
			
			}while(++j < 10);
			System.out.println();
			i++;
		}while(i < 10);

	}

}
