package day1112.stringtokenizer;

import java.util.StringTokenizer;

/**
 * ���ڿ��� �ڸ� �� ����ϴ� class
 * 
 * @author owner
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
		
		String str = "�ȳ��ϼ���? �ູ�� �Ϸ簡 �Ǽ���";
		
		// 1. ���ڿ��� �������� �����ϴ� StringTokenizer�� ���.
//		StringTokenizer stk = new StringTokenizer(str);
		
		// 1. ���ڿ��� Ư�� ���ڷ� �����Ͽ� �ڸ��� �ͽ��ϴ�. : StringTokenizer(���ڿ�,"�ڸ�����");
		//���� ���ڸ� �����մϴ�.(��ȣ���� �ʽ��ϴ�.)
		
//		StringTokenizer stk = new StringTokenizer(str,"��"); //=> ���: �ȳ� / ����? �ູ�� / �簡 �Ǽ���
//		StringTokenizer stk = new StringTokenizer(str,"�ϼ�"); //(or ����� ���) => ���: �ȳ�/��? �ູ�� /�簡 ��/�� 
		
		// 1. ���ڿ��� Ư�� ���ڷ� �����Ͽ� �ڸ��� :StringTokenizer(���ڿ�,"�ڸ�����",��ȣ����)
		//���ع��ڸ� ��ȣ������ ���� ����: true - ��ȣ, false - ��ȣ
//		StringTokenizer stk = new StringTokenizer(str,"��",true); //=> ���: �ȳ�/��/����? �ູ�� /��/�簡 �Ǽ���
		StringTokenizer stk = new StringTokenizer(str,"��",false); //=> ���: �ȳ�/����? �ູ��/�簡 �Ǽ���
		
		
//		System.out.println("��ū�Ǽ�: "+stk.countTokens()); //pointer�� ��ġ�� ���� countTokens�� ������ �޶�����.
//		System.out.println("��ū�� ���翩��: "+stk.hasMoreTokens());
//		System.out.println("pointer�� �����ϴ� ��ġ�� ���� ���, pointer�� �̵� :"+stk.nextToken()); 
//		System.out.println("��ū�Ǽ�: "+stk.countTokens()); //Token�� ���±� ������ ��ū�� ���� �پ���.
		
		//��ū�� ���� �˼� ������ ��ū�� ���� �� ���� �߶󳻾ߵȴ�.
		//���۰� ���� �� �� ������ ����ϴ� �ݺ����� while�� ����ϰ� �˴ϴ�.
		
		while(stk.hasMoreTokens()) { //��ū�� ���翩�θ� boolean������ ��ȯ�ϴ� hasMoreTokens.
			System.out.println(stk.nextToken()); //���� �������� �����͸� ���� ��ġ�� �̵�.
		}//while;
		
//		�����Ͱ� �̹� ���ڿ��� ���� ��ġ�ϰ� �ֱ� ������ �ٽ� while���� ���� �� ����.
//		�ٽ� ����Ϸ��� Instance�� �ٽ� �����ؾ��Ѵ�.
//		while(stk.hasMoreTokens()) { //��ū�� ���翩�θ� boolean������ ��ȯ�ϴ� hasMoreTokens.
//			System.out.println(stk.nextToken()); //���� �������� �����͸� ���� ��ġ�� �̵�.
//		}//while;
		
	}//UseStringTokenizer
	
	
	public void useSplit() {
		
		String csvData = "Java,Oracle,JDBC,HTML.CSS,JavaScript"; // csv DATA
		
		String[] subjectArr=csvData.split(","); // ','�� �������� �߶� �迭�� �����Ѵ�. (Or ��� ����.)
													
		System.out.println(subjectArr.length);
		
		for(int i = 0 ; i < subjectArr.length ; i++) {
			System.out.println(subjectArr[i]);
		}//for
		
	}//useSplit
	
	public static void main(String[] args) {

		new UseStringTokenizer().useSplit();
		
	}//main

}//class
