package infren_app_Interface;

public class book {
	String name;//å�̸�
	int price;//����
	int num;//����
	book(String name,int price){
		this.name=name;
		this.price=price;
	}
	void pt(){
		System.out.println("å�̸�:"+name+"/å ����:"+price+"�Ѱ���"+num*price);
	}

}
