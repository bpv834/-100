
public class Exception_ID {

	public static void main(String[] args) {
		try {
			boolean isSuccesee=login("g99","123123");
			if(isSuccesee) {
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("�α��� ����");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("���۱� g99 2021");
		}
	
	}
	static boolean login(String id, String pw) throws Exception{
		
		boolean isNetworkFailed=true;
		boolean isNoId=false;
		boolean isPasswordWrong=false;
		boolean isPWExpired=false;
		
		if(isNetworkFailed)throw new Exception("��Ʈ��ũ ����");
		else if(isNoId)throw new Exception("���̵� ����");
		else if(isPasswordWrong)throw new Exception("��� Ʋ��");
		else if(isPWExpired)throw new Exception("��������ʿ�");
		
		System.out.println("");
		return true;
		
	}
	
	

}
