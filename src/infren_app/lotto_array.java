package infren_app;

import java.util.Random;

public class lotto_array {

	public static void main(String[] args) {
		Random rd= new Random();
		int n=rd.nextInt(10);
		
		
			System.out.println("��÷���� "+lotto(n)+"�� �Դϴ�.");
			
			
		
			

	}
	
 static int lotto(int num) {
	 int ar[]=new int[10];
	 
		for(int x=0;x<ar.length;x++) {
			
			ar[x]=0;
		}
		ar[1]=3000;
		ar[5]=5000;
		ar[9]=10000;
		return ar[num];
	}

}




