package sec02.exam01;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		while(true) {
		
		
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("���Ḧ ���ϸ� 0�� �ƴϸ� ������ �Է��Ͻÿ�");
		int score = scan.nextInt();
		
		if(score>=90&&score<=100)//90<=score<=100 
			System.out.println("A");	
		
		else if(score>=80&&score<=89)
		System.out.println("B");	
		else if(score>=70&&score<=79)
		System.out.println("C");	
		
		else if(score>=60&&score<=69)
		System.out.println("D");
		
		else
			System.out.println("F");
		if(score==0)
			break;
		}
		System.out.println("�����մϴ�.");
		break;
		}
	}

}
