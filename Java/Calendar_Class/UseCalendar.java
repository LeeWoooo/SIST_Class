package day1113.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * �ϳ��� ��¥ ������ ���� �� 
 * @author owner
 */
public class UseCalendar {

	public UseCalendar() {
		
		//1.��ü ����
		//is-a
		@SuppressWarnings ("unused")
		Calendar cal = new GregorianCalendar(); 
		//method
		Calendar cal1 = Calendar.getInstance();
		
//		System.out.println(cal + " / " + cal1); //�ּ����.
		
//		System.out.println(cal1.get(1)); ����� ����ϸ� ��� ���� ����� �˱� ��ƴ�.
//		System.out.println(cal1.get(Calendar.YEAR));//Constant�� ����ϸ� ��� ���� ��� ����.
		
		int year = cal1.get(Calendar.YEAR);
		int mouth = cal1.get(Calendar.MONTH)+1;//0~11�� �������� ������ ������ ����� ���� ���ϰ� +1���� �־��ش�.
		int day = cal1.get(Calendar.DAY_OF_MONTH);
		
		int hour = cal1.get(Calendar.HOUR_OF_DAY); //HOUR -12�ð� , HOUR_OF_DAY -24�ð�
		
		int am_pm=cal1.get(Calendar.AM_PM);
		String [] amArr = { "����" , "����"}; //������ ó���� �� �迭�� ����ϸ� if or switch ������ �����ϰ� ����� ��Ȳ���� �ִ�.
		
		int minute=cal1.get(Calendar.MINUTE);
		int second=cal1.get(Calendar.SECOND);
		
		int week = cal1.get(Calendar.DAY_OF_WEEK);
		
		String[] weekTitle = {" " , "��" , "��" , "ȭ" , "��" , "��" , "��" , "��"} ; // �迭�� ���� ����
		
		String temp = "��,��,ȭ,��,��,��,��";//���ڿ� CSV DATA
		
		String[] arr =temp.split(","); //���ڿ��� Ư�� ���ڷ� �����ؼ� �迭�� ����� �ش�.
		
		System.out.println(year + "-" + mouth + "-" +day + " " + amArr[am_pm] + " " + hour +":"  + minute + " " + weekTitle[week] + " " +arr[week-1]);
		
	}//UseCalendar
	
	/**
	 * set method�� ����� ��¥ ����
	 */
	public void Calendarset() {
		
		Calendar cal = Calendar.getInstance(); //���� ��¥�� ������ �ֽ��ϴ�. 2020.11.03
		
		//���� ����: 2020 => 2021
		cal.set(Calendar.YEAR, 2021);
		//�� ����: 11�� => 3
		cal.set(Calendar.MONTH, 2); //0������ �����ϱ� ������ �����ϰ��� �ϴ� �޿��� -1�ؼ� �����Ѵ�.
		//�� ����: 13 => 31
		cal.set(Calendar.DAY_OF_MONTH, 31);
		
		System.out.println(cal.get(Calendar.YEAR) + "-" +(cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DAY_OF_MONTH) + "-"
								+ ("��,��,ȭ,��,��,��,��".split(",")[cal.get(Calendar.DAY_OF_WEEK)-1]));
		
	}//Calendarset
	
	public static void main(String[] args) {

		UseCalendar uc = new UseCalendar();
		uc.Calendarset();
		System.out.println("====================");
		
	}//main

}//class
