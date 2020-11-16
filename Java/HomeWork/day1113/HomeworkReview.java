package day1113.homework;

import java.util.StringTokenizer;

public class HomeworkReview {
	
	//1.���ڿ��� �Էƹް� (parameter String����), string[]�� ��ȯ�ϴ� method �ۼ�
	
	public String[] stationProcess(String station) {
		
		String[] temp = null; // ó���� �����͸� ������ �迭�� ����.
		
		//�Էµ� ������ ������ "���ε����� ����" ���� �߰�
		//�Ŵ�濪, �ڿ� "���ε����� ����" ���� �߰�
		
		
		//1. �Ŵ�� ���� ���縦 ã�ƺ���.
		StringBuilder sbTemp = new StringBuilder(station);
		
		
		if(station.contains("�Ŵ��")) { //��ȿ�� �˻�
			
			//�Ŵ�濪�ڿ� ���ε����� ���� ���� �߰�����.
			sbTemp.insert(sbTemp.indexOf("�Ŵ��")+4, "���ε����� ����,");
		}//end if

		//���ε����� ������ �߰��� ���ڿ��� parameter�� ����.
		station = sbTemp.toString();
		
		//2. ���ڿ��� ������ ��������. (replace method�� �̿�) => white space�� ã�Ƽ� empty�� ġȯ
		station = station.replaceAll(" ", "");
		
		//3. parameter�� �Էµ� date�� �Ųٷ� �迭�� �־� ��ȯ.
		//�Էµ����͸� ��ū���� ������ �ʿ䰡 �ִ�. 
		//StringTokenizer - ���ԵǴ� ���� ���ڿ��� �ڸ��� �ִ�.(or���)
		//String.split() - �ϳ��� ���ڿ��� �ڸ� �� �ִ�.(����)
		
		StringTokenizer stk = new StringTokenizer(station,",.");
		
		//��ū���� ���е� �����͸� �����ϱ� ���� �迭 ����. (�迭�� ���� ������ ��ū�� ����)
		temp = new String[stk.countTokens()]; //11���� ���� ������ �Ǿ����ϴ�.
		
		
		int index = temp.length -1; //ó�� data�� ������ �濡 �ֱ� ���� index ���� �ʱ�ȭ
		while(stk.hasMoreTokens()) { //��ū�� �����Ѵٸ�
			temp[index] = stk.nextToken(); //������ �� ���� ó�� data�� �߰�
			index--; //���� data�� �������� �� �濡 �߰��ϱ� ���� �ε����� 1�� ����.
		}//end while
		return temp;
	}//stationProcess
	
	/**
	 * �迭�� �Է� �޾� ���
	 * @param station
	 */
	public void printstation(String[] station) {
		
		//���� ó�� method���� 0��° �濡�� ���� �߰��Ͽ��ٸ�. ������ ����� ���.
		
		//���� ó�� method���� �����͸� ������ ����� �߰��Ͽ��ٸ� 0��° ����� ����
		
		System.out.println(" �� �� ");
		System.out.println(" ================================ ");
		
		for(int i = 0 ; i <station.length ; i++) {
			System.out.println(station[i]);
		}//end for
		
		System.out.println(" ================================ ");
		
	}//printstation
	public static void main(String[] args) {
		
		//1. Instanceȭ : static�����ۼ� instance ������ ����, method�� ȣ���ϱ� ���ؼ�.
		HomeworkReview work = new HomeworkReview();
		
		//method argument�� �Է��� ���������� ����
		String station = "��õ, �Ÿ�,�Ŵ��,�븲.�ŵ���, ����,��������û, ���,����, ȫ�� �Ա�";
		// 1�� method ȣ��.
		String[] temp = work.stationProcess(station);
		// 2�� method ȣ��.
		work.printstation(temp);
	}//main
	
}//class
