package sec02.exam01;

import java.util.Scanner;

public class A {
	
		public static void main(String[] args) {
			while(true) {
			System.out.println("a�� �Է��Ͻÿ�"); 
			Scanner scan=new Scanner(System.in);
			int a= scan.nextInt();
			System.out.println("b�� �Է��Ͻÿ�");
			int b= scan.nextInt();
			
			if(a>b)
				System.out.println(a+">"+b);
			else if(a<b)
				System.out.println(a+"<"+b);
			else
				System.out.println(a+"=="+b);
			
			
			
			if(a+b==0)
				break;
			}

		}

	}