package BBackjoon;

import java.util.Arrays;
import java.util.Scanner;

public class remains {

	public static void main(String[] args) {
		System.out.println("���� 10�� �Է��Ͻÿ�");
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[10];
			int x[]=new int[10];
			int cnt=1;
			int cnt1=1;
			
			for(int t=0;t<10;t++) {
				arr[t]=sc.nextInt();
				x[t]=arr[t]%42;	
			}
			System.out.println(Arrays.toString(x));
			
			for(int i=0;i<1;i++) {
			for(int j=1;j<10;j++){
				
				if(x[i]!=x[j]) {
					cnt++;
				}
			}
			}	
			for(int i=0;i<1;i++) {
				for(int j=1;j<10;j++){
					
					if(x[i]==x[j]) {
						cnt1++;
					}
				}
				}	
			
			System.out.println(cnt+""+cnt1);
			
				

		

	}


	}

