package ���;

import java.util.Scanner;

public class ���丮�� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(fact(num));

	}
	
	static int fact(int n) {
		if(n<=1)
			return 1;
		else
		return n*fact(n-1);
	}
	}


