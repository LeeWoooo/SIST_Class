package day1117.uselinkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * java util.List�� ������ class : ������ �迭�� �����̸鼭 ���� ���� ���̴�.
 * �߻��� DATA�� ������ DATA�� ���̿� ���� ���� ������ ����Ѵ�.
 * @author owner
 */
public class UseLinkedList {

	public UseLinkedList() {
		
		//1. ����
		LinkedList<String> ll = new LinkedList<String>();
		
		List<String> list = new LinkedList<String>();
		
		
		//2. �� �߰�
		ll.add("JAVA");
		ll.add("ORACLE");
		ll.add("JDBC");
		
		
		list.add("Java");
		list.add("JSP");
		list.add("XML");
		list.add("JSON");
		
		//3. ���� ���� Ȯ��
		System.out.println(ll.size() + " / " + list.size());
		
		//������ DATA���̿� ���� �߰� �� �� ArrayList, Vector���� ȿ���� ����.
		list.add(1, "Oracle");
		//Oracle�̶�� ��ü�� �����ؼ� �����ּҸ� Java�� ���ּҷ� �����´�. �� �ּҴ� JSP�� �����ּҸ� �����´�.
		//���� Index�� �����Ѵ�.
		System.out.println(list + " / " +list.size());
		list.add(2, "JDBC");
		System.out.println(list + " / " +list.size());
		
		//4. �� ����
		list.remove(4);
		System.out.println(list + " / " +list.size());
		//XML�� �������� JSP�� ���ּҴ� JSON�� ���� �ּҸ� ���� �ǰ�
		//JSON�� �����ּҴ� JSP�� �����ּҸ� ���Եȴ�.
		
		
		//5.�ϰ�ó��
		for(int i = 0 ; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}//end for
	}//UseLinkedList

	public static void main(String[] args) {

		new UseLinkedList();
		
	}//main

}//class
