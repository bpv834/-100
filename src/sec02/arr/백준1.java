package sec02.arr;

import java.util.Arrays;
import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է¹��� ������ ������ �Է��Ͻÿ�");
		int a= sc.nextInt();
		int arr[]=new int[a];
		int min=10000;
		int max=-10000;
	System.out.println("���� n���� �Է��Ͻÿ�");
	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		};
		for(int z=0;z<arr.length;z++) {
			if(arr[z]<min) {
				min=arr[z];
			}
			
		}
		for(int x=0;x<arr.length;x++) {
			if(arr[x]>max) {
				max=arr[x];
			}
		}
		
		
		System.out.println("�ּҰ�:"+min);
		System.out.println("�ִ밪:"+max);
		
	}

}
