package day1113.Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * ������ �ִ� ��¥ ������ ����� ��.
 * SimpleDateFormet�� �Բ� ����Ѵ�.
 * @author owner
 */
public class UseDate {

	public UseDate() {
		
		// 1. Date ���� : �ý����� ��¥ ������ ��´�.
		Date date = new Date();
		//System.out.println(date.toString()); //����ڰ� ���ϴ� ��¥������ �ƴϴ�.
		
		// 2. SimpleDateFormat : ����ڰ� ���ϴ� ��¥ ������ ����� �ִ� class
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh(HH,kk):mm:ss E");
     	//System.out.println(sdf); // �ּ� ���. simpleDateFormet�� toString()�� Override���� �ʾұ� ����
		String formatDate = sdf.format(date); 
		//date�� �־��ִ� ������ SimpleDateFormat�� ���ĸ� ���������� �� �ð������� ����.
		//��¥ ��ü�� ���޹޾� (has a)���ϴ� ��¥ ������ ���ڿ��� ��´�.
		System.out.println(formatDate);
		
		
		//�ٸ� ����� ��¥������ �����ٷ��� Locale class�� ����Ѵ�.
		//new SimpleDateForMat("pattern", Locale.����constant);
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy a hh(HH,kk):mm:ss E",Locale.UK); //������ �ð� ����
		String formatDate1 = sdf1.format(date); 
		System.out.println(formatDate1);
		
	}//UseDate
	
	public static void main(String[] args) {

		new UseDate();
		
	}//main

}//class
