package Infren_Class;

public class HouseTest {

	public static void main(String[] args) {
		House hs=new House();
		System.out.println("������"+hs.airconStat);
		
		hs.airconOn();
		System.out.println("������"+hs.airconStat);
		
		hs.airconOff();
		System.out.println("������"+hs.airconStat);
	}

}
