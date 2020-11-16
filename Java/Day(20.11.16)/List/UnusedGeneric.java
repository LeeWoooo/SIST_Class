package day1116.list;

import java.util.ArrayList;
import java.util.List;

public class UnusedGeneric {
	
	public UnusedGeneric() {
		
		//JDk 1.4���� ����ϴ� ���� (Generic�� �������� ���� ��) : List�� ��� ���� ������ �� �ִ�.
		
		//1. ����
		@SuppressWarnings("rawtypes")
		List list = new ArrayList(); //Generic�� ����� �����ϴ� warning�� �߻��Ѵ�.
		
		//2.�� �߰� (Generic�� ������� ������ ��� ���� �߰��� �� �ִ�.)
//		System.out.println(list.size()); //Data�� �ϳ��� ������
		list.add(10);
		list.add(20);
		list.add(30.11);
		list.add("�ȳ��ϼ���"); // Generic�� ������� �ʾұ⿡ ��� ���� �߰� �� �� �ִ�.
		System.out.println(list.size()); //���� ���� ������ ���� ������ 1�� �����Ѵ�.
		
		//3.�� ���
		for(int i =0; i < list.size() ; i++) {
//			System.out.println(list.get(i) * 10); //���� ���� ����� ������ error�� �߻��Ѵ�.
			System.out.println(list.get(i));  //�ܼ��� ������ ���� error�� �߻����� �ʴ´�.
		}//end for
		
	}//UnusedGeneric

	public static void main(String[] args) {

		new UnusedGeneric();
	}//main
}//class
