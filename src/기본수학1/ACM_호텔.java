package �⺻����1;

import java.util.Scanner;

public class ACM_ȣ�� {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	
	int num=sc.nextInt();
	for(int i=0;i<num;num++) {
		int h=sc.nextInt();//�� ��
		int w=sc.nextInt();//�� ����
		int n=sc.nextInt();//���° �ճ�
	int cnt=1;
	int knt=0;
	int k=0;
	int t=0;
	
	if(n<=h) {
	System.out.println(1+"0"+n);
	
	}
	else {
	while(n>h) {
		if(w*h<n)
			break;
	n=n-h;
	cnt++;
	
	}
	
	System.out.println(n+"0"+cnt);
	
	}
	
	}
	}
}

	


