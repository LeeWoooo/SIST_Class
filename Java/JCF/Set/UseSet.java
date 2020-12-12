package day1116.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * �˻��� ����� ������, �ߺ����� ������� �ʴ� Set�� ���.<br>
 * �Է°��� ���������� �Էµ��� �ʴ´�.
 * @author owner
 */
public class UseSet {
	
	public UseSet() {
		
		//1. ����
		Set<String> set = new HashSet<String>();
		
		//2. ���ֱ� (���� �������� �Էµ��� �ʽ��ϴ�.)
		set.add("������");
		set.add("2020��");
		set.add("11��");
		set.add("16��");
		set.add("11��"); //�ߺ� Data�� �߰� : �ߺ�Data�� �߰����� �ʴ´�.
		System.out.println(set + " / " + set.size());
		
		//3. �� ���� (���� �������� �Էµ��� �ʱ⿡ index��� �Ұ�)
		set.remove("������");
		System.out.println(set);
		
		//4. �˻�. : Iterator�� ���.
		Iterator<String> ita = set.iterator(); //Iterator�� �����͸� ���� set�� ������� �Ѱ��ش�.
		
		//5. ���� �����ϴ���?
		while(ita.hasNext()) { //���� �����ϴ� ��
			System.out.println(ita.next()); //���� ��� pointer�� ���� �� ������ �̵�
		}//end while
		
	}//UseSet
	
	public static void main(String[] args) {

		new UseSet();
		
	}//main

}//class
