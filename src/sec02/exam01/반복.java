package sec02.exam01;

public class �ݺ� {

	public static void main(String[] args) {
		String str[]=new String[] {"�ѱ�","�̱�","����","�߱�","���þ�","�Ϻ�"};
		String str1[]=new String[] {"�ѹݵ�","�Ƹ޸�ī","����","���Ͼ�","������","����"};
		String str2[][]=new String[][] {str,str1};
		
		
		for(int x=0; x<str2.length;x++) {
			for(int y=0; y<str2[x].length;y++) {
				String strval=str2[x][y];
				System.out.println(strval);
				
				System.out.println(str2.length+"+"+str2[x].length);
			}
		}
	}


	}


