package sec01.exam02;

public class kar {
	//�ʵ�
	
	String com="����";
	String mo;
	String col;
	int spe;
	
	
	//������
	kar(){
	}
	kar(String mo){
	this (mo,null,0);
	}
	kar(String mo, String col){
		this (mo,col,0);
	}
	kar(String mo, String col, int spe){
		this.mo= mo;
		this.col= col;
		this.spe= spe;
	}
	
	

}
