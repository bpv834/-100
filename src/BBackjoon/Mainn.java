package BBackjoon;

import java.util.Arrays;
import java.util.Scanner;


public class Mainn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int x[]=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			x[i]=arr[i]%42;
			 
			
		}
		System.out.println(Arrays.toString(x));
		
			

	}

}
