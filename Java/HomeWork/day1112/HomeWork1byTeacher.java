package day1112.homework;

import java.util.StringTokenizer;

//1. �Ʒ��� ���� ������ �����Ͱ� �����Ѵ�. 
//
//String station="��õ,�Ÿ�,�Ŵ��.���ε����д���,�븲.�ŵ���,����,��������û,���,����,ȫ���Ա�";
//
//1. ������ ����StringTokenizer�� ����Ͽ� String[]�� �����ϰ� ��ȯ�ϴ� method�� �����.
//2.  1�� method�� ȣ���Ͽ� ��ȯ�Ǵ� �迭�� �޾� �Ʒ��� ���� ����Ѵ�. 
//   ���� 
//------------
//   ��õ
//     .
//     .
//   ȫ���Ա�
//-------------
//������ �� : [ x ]��, '��'���� �����ϴ� ���� [ 3 ]��

public class HomeWork1byTeacher { 
	//������ �������� �迭�� ���� ���� ������ while�� �����
	//token�� ������ �𸣰� ������ �˼� ���⿡ while�� ����Ͽ� �迭�� ���� �Է�.
	
	//'��'���� �����ϴ� ���� �̸��� ���Ҷ� ���� charAt�� ����Ͽ�����
	// ������� Ǯ�̴� startWith method�� ����Ͽ���.
	
	
	/**
	 * CSV Data�� Token�� �и��Ͽ� �迭�� ��� ���� �� ���Դϴ�.
	 * @return
	 */
	public String[] csvProcess() {
		 
		String[] stationArr=null;
		String station="��õ,�Ÿ�,�Ŵ��.���ε����д���,�븲.�ŵ���,����,��������û,���,����,ȫ���Ա�";
		
		// 1. �ϳ��� ���ڿ����� Ư�� ���ڷ� �и��� �� �ִ� class�� ����.(StringTokenizer)
		 StringTokenizer stk = new StringTokenizer(station, ",." , false);
		// 2. Token�� ������ �迭�� �����մϴ�. -�迭�� ���� �������� ������ �ȴ�.
		 stationArr = new String[stk.countTokens()]; // index�� ����Ͽ� �濡 �����ϴ� �迭
		 
		 int idx = 0;
		 // 3. Token�� �����ϴ��� ����� Token�� �ִٸ� 
		 while(stk.hasMoreTokens()) {
		// 4. Token�� �����ͼ� �迭 �濡 ������ �Ѵ�.
			 stationArr[idx] = stk.nextToken();
			 idx++;
		 }//end while
		return stationArr;
	}//csvProcess
	
	public void printArray(String[] stationArr) {
		
		int cnt =0;
		
		System.out.println("�� ��");
		System.out.println("==========");
		for(int i = 0 ; i <stationArr.length ; i++) {
			System.out.println(stationArr[i]);
			if(stationArr[i].startsWith("��")) { // '��'���� �����ϴ� ���� ���� �˰� �ͽ��ϴ�. stratWith method�� ����Ͽ� ���ξ '��' ���� Ȯ���Ѵ�.
				cnt++;
			}//if
		}//for
		System.out.println("==========");
		System.out.printf("������ �� [%d] , '��'���� �����ϴ� ���� ���� [%d]" , stationArr.length , cnt);
	}//printArray
	
	
	
	
	public static void main(String[] args) {
		
		//1. Instanceȭ
		HomeWork1byTeacher hwt = new HomeWork1byTeacher();
		//2. csv�����͸� ó���ϴ� method ȣ��
		String[] temp= hwt.csvProcess();
		//3.���
		hwt.printArray(temp);
	}//main

}//class

