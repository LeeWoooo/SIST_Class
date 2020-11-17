package day1117.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * key�� ���� ������ Data�� �����ϴ� Map�� ���
 * @author owner
 */
public class UseMap {

	/**
	 * �⺻ �����ڸ� ����Ͽ� Instance�� �����ϸ� 11���� ���� ������ HashTable�� ����غ��ڽ��ϴ�.
	 * ����ȭ�� �Ǿ� �ֱ⿡ Hash Map���� ������.
	 */
	public void useHashTable() {
		
		//1. ����
		Map<String, String> map = new Hashtable<String, String>();
		
		//2. �� �ֱ� (���� ���������� ���� �ʴ´�.)
		map.put("Java", "OOP���");
		map.put("Oracle", "��뷮Data");
		map.put("HTML", "�� �������� ��������");
		map.put("CSS", "�� �������� ���ϼ� �ִ� DESIGN�� ����");
		System.out.println(map);
		
		map.put("python", "OOP���");
		//key�� �ߺ� �ɼ� ����. ���� key�� �����ϸ� �ش� key�� �����.
		map.put("Java", "�Ϻ��� OOP���"); // ���� Value�� OOP��� ���µ� �Ϻ��� OOP���� ���������.
		
		//3. ���� ũ�� ���
		System.out.println(map.size() + "��");
		
		//4. �����
		System.out.println(map.get("Oracle"));
		
		//5. Key�� �����ϴ���?
		System.out.println(map.containsKey("Oracle")); // true | false
		
		//6. ��� key ���.
		Set<String> set = map.keySet();
		System.out.println("��� key" + set);
		
		//7. ��� �� ���
		Iterator<String> ita = set.iterator();
		while(ita.hasNext()) {
			System.out.println(map.get(ita.next())); //��簪
		}
		
		
	}//useHashTable
	

	/**
	 * �⺻ �����ڸ�  ����Ͽ� Instance�� �����ϸ� 16���� ���� �����ȴ�.
	 */
	public void useHashMap() {
		
		//1. ����
		Map<String, String> map = new HashMap<String, String>();
		
		//2. �� �ֱ� (���� ���������� ���� �ʴ´�.)
		map.put("Java", "OOP���");
		map.put("Oracle", "��뷮Data");
		map.put("HTML", "�� �������� ��������");
		map.put("CSS", "�� �������� ���ϼ� �ִ� DESIGN�� ����");
		System.out.println(map);
		
		map.put("python", "OOP���");
		//key�� �ߺ� �ɼ� ����. ���� key�� �����ϸ� �ش� key�� �����.
		map.put("Java", "�Ϻ��� OOP���"); // ���� Value�� OOP��� ���µ� �Ϻ��� OOP���� ���������.
		
		//3. ���� ũ�� ���
		System.out.println(map.size() + "��");
		
		//4. �����
		System.out.println(map.get("Oracle"));
		
		//5. Key�� �����ϴ���?
		System.out.println(map.containsKey("Oracle")); // true | false
		
		//6. ��� key ���.
		Set<String> set = map.keySet();
		System.out.println("��� key" + set);
		
		//7. ��� �� ���
		Iterator<String> ita = set.iterator();
		while(ita.hasNext()) {
			System.out.println(map.get(ita.next())); //��簪
		}
		
	}//useHashMap
	
	
	public static void main(String[] args) {

		UseMap um =new UseMap();
		um.useHashTable();
		System.out.println("===========================");
		um.useHashMap();
		
	}//main

}//class
