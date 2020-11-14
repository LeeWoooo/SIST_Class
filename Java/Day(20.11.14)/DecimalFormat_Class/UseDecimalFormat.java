package day1113.decimalformat;

import java.text.DecimalFormat;

/**
 * ���ڸ� ������ ���ڿ��� �������� ���� ��
 * ������� ���θ����� ������ ������ �����Ҷ�.
 * @author owner
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		
		//'#' pattern : �ش� �ڸ��� �����Ͱ� �����ϴ� �͸� ���.
		DecimalFormat df = new DecimalFormat("#,###,###");
		int i = 2020;
		System.out.println(df.format(i)); // Format�� �� ���ڸ� ���� ����.
		
		//'0' pattern : �ش� �ڸ��� �����Ͱ� �����ϸ� ���� ����ϰ�, �������� ������ 0�� ���
		DecimalFormat df1 = new DecimalFormat("0,000,000");
		int j = 2020;
		System.out.println(df1.format(j)); // Format�� �� ���ڸ� ���� ����.
		
		//�Ǽ��� ó�� :  �Ҽ��� ���� �ڸ����� ������ �� �ִ�.
		DecimalFormat df2 = new DecimalFormat("0,000,000.000"); //�鸸������ �Ǽ� 3 �ڸ� ���
		double k = 123456.789;
		System.out.println(df2.format(k)); // Format�� �� ���ڸ� ���� ����.
		
		long l = 2_17_483_649L; //������ �ڸ��� ������ _ �� �־� code�� ������ �� �ִ�. => JDK 1.7
		System.out.println(l);
		
	}//UseDecimalFormat
	
	public static void main(String[] args) {

		new UseDecimalFormat();
		
	}//main

}//class
