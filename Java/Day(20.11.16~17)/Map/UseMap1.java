package day1117.map;

import java.util.HashMap;
import java.util.Map;

public class UseMap1 {

	public void useHashMap() {
		
		//1. map����
		Map<String, String> map = new HashMap<String,String>();
		//2. �� �Ҵ� (key�� ���� ������ �Է� �� ���� entry��� �Ѵ�.
		map.put("A", "�����ϴ�.(~^0^)~");
		map.put("B", "��ĥ�ϴ�. (�Ѥ�+)");
		map.put("AB", "������@,@");
		map.put("O", "�����δ�~(^^~)(~^^)~");

		//key�� ���ٸ� ���� ��������.
		map.put("B", "�����ϴ�.");
		map.put("AB", "�ٺ��ƴϸ�õ��");
		map.put("O", "���׿��");
		
		System.out.println(map);
		
		
		//String literal�� ""�� String class���� �����ϴ� ��� method�� ����� ��  �ִ�.
		String bloodType = "a".toUpperCase();
		
		if(map.containsKey(bloodType)) { //key�� ���� �ϴ���?
			System.out.println(bloodType+ "���� Ư¡��   " + map.get(bloodType));
		}else {
			System.out.println(bloodType + "�� ����� �������� �ƴմϴ�.");
		}
		
		
	}
	public static void main(String[] args) {

		UseMap1 um1 = new UseMap1();
		um1.useHashMap();
		
	}//main

	
}//class
