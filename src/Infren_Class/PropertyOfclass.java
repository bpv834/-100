package Infren_Class;

public class PropertyOfclass {
	public static int entityCount;
	
	public String goodsNo;
	public String goodsName;
	public String goodsPrice;
	
	public enum EnumDataType{
		INSERT, UPDATE, DELETE, NORMAL
	}
	public EnumDataType enumDataType= EnumDataType.NORMAL;
	
	static{
		System.out.println("Goods ;;; ���� �ʱ�ȭ ����");
		System.out.println("goods entity count: "+ entityCount);
		System.out.println("���� �ʱ�ȭ�� ������ ���� �ɱ��?");
		
	}
	{
		System.out.println("�ʱ�ȭ ���� �����մϴ�.");
		entityCount++;
		
		goodsNo="goods"+entityCount;
		System.out.println("��ǰ��ȣ"+goodsNo);
		
	}
	public PropertyOfclass() {
		System.out.println("�⺻ ������ �Լ��� �����մϴ�.");
		
	}
	public PropertyOfclass(String goodsName) {
		this.goodsName=goodsName;
	}
	
	public PropertyOfclass(String goodsName, String goodsPrice) {
		this.goodsName=goodsName;
		this.goodsPrice=goodsPrice;
		
	}
	
	public String toString() {
		return "PropertyOfclass[goodsNo"+goodsNo+"goodsName="+goodsName+"goodsPrice ="+goodsPrice;
	}
	
	public static class InnerClassInfo{
		public static String[] innerClassPropertiesName= new String[] {"��ǰ��ȣ","��ǰ��","��ǰ�ܰ�"};
		public static int[] innerClassPropertiesPrice= new int[] {100,1000,2500,3500};
		
	}
	
	
	
}
