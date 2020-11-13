package day1113.homework;

import java.util.StringTokenizer;

public class Work1113 {
	
	public String[] csvProcess() {
		
	
		String station = "��õ, �Ÿ�,�Ŵ��,�븲.�ŵ���, ����,��������û, ���,����, ȫ�� �Ա�";
		
		//���ڿ��� �ִ� ������ �����մϴ�. replace ("ã�����ڿ�" , "������ ���ڿ�")
		String spacex=station.replaceAll(" ","");
		//replace Ȯ��
//		System.out.println(spacex);
		
		
		//1.StringBuilder����� ����ϱ����� StringBuilder�� Instanceȭ �� �� ���ڿ��� �־��ش�.
		StringBuilder sb = new StringBuilder();
		sb.append(spacex);
		
		//2. �Ŵ�濪 �ڿ� "���ε����� ����"�� �߰� �ϱ� ���� ������ ��ġ�� index�� ���Ѵ�.
		@SuppressWarnings("unused")
		int index = station.indexOf("��");
//		System.out.println(index);
		
		//3. "���ε����� ����"�� ������ ������ ������ ���ڿ��� �����Ѵ�.
		sb.insert(10, "���ε����� ����,".replace(" ", ""));
//		System.out.println(sb);
				
		
		//4.sb�� to string �ؼ� ���ڿ��� �����.
		String temp = sb.toString();
//		System.out.println(temp);
		
		//5.StringTokenizer�� ���� �� temp�� ����־��ݴϴ�.
		StringTokenizer stk = new StringTokenizer(temp,",.");
		
		//6. Token ������ �߶� �迭�� �־��ִ� �۾��� �մϴ�.
		//�迭�� ������ ���� ������ �ݴ�� ���� �ֽ��ϴ�.
		String[] stationArr= new String[stk.countTokens()];
		int flag =stk.countTokens()-1;
		while(stk.hasMoreTokens()) {
			stationArr[flag]=stk.nextToken();
			flag--;
		}//while
		
//		//�迭�� �� ������ ����ؼ� Ȯ��
//		for(int i = 0 ; i < stationArr.length ; i++) {
//			System.out.printf(stationArr[i] + " ");
//		}//for
		
		return stationArr;
	}//csvProcess
	
	/**
	 * ���ϴ� �������� ������� stationArr�迭��
	 * ����ϴ� method
	 * @param stationArr
	 */
	public void printstation(String[] stationArr) {
		System.out.println("�� ��");
		System.out.println("----------");
		
		//���� �̸��� �ݺ����� ���� ���
		for(int i = 0; i< stationArr.length; i++) {
			System.out.println(stationArr[i]);
		}//for
		
		System.out.println("----------");
	}//printstation

	public static void main(String[] args) {
		Work1113 hw = new Work1113();
		String[] stationArr = hw.csvProcess();
		hw.printstation(stationArr);
	}//main

}//class
