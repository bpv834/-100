package EXAM;

import java.util.Calendar;

public class EXAM_01 {

	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
		int month=now.get(Calendar.MONTH)+1;
		String strmonth=(month<10)?("0"+month):(""+month);
		
		int dayOfMonth=now.get(Calendar.DAY_OF_MONTH);
		String strDayOfMonth=(dayOfMonth<10)?("0"+dayOfMonth):(""+dayOfMonth);
		
		String dayArr[]= {"��","��","ȭ","��","��","��","��"};
		int dayOfWeek=now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek=dayArr[dayOfWeek-1]+"����";
		
		int hour =now.get(Calendar.HOUR_OF_DAY);
		String strHour=(hour<10)?("0"+hour):(""+hour);
		
		int minute=now.get(Calendar.MINUTE);
		String strminute=(minute<10)?("0"+minute):(""+minute);
		
		int second=now.get(Calendar.SECOND);
		String strSecond=(second<10)?("0"+second):(""+second);
		
		
		System.out.println(year+"��");
		System.out.println(strmonth+"��");
		System.out.println(strDayOfMonth+"��");
		System.out.println(strDayOfWeek+"");
		System.out.println(strHour+"��");
		System.out.println(strminute+"��");
		System.out.println(strSecond+"��");

	}

}
