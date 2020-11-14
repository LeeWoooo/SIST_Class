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

public class HomeWork1 {
	
	
	String station="��õ,�Ÿ�,�Ŵ��.���ε����д���,�븲.�ŵ���,����,��������û,���,����,ȫ���Ա�";
	private int cnt; // '��'���� �����ϴ� ���� ������ �޴� ����
	
	/**
	 * String �迭�� �Է¹޾� StringTokenizer�� �̿��� ������ Token���� �����Ͽ�
	 * �迭�� �Է��ϴ� method.
	 * @return
	 */
	
	public String[] Stations(String station) {
		
		StringTokenizer stk = new StringTokenizer(station,".,",false);
		String[] stations = new String[stk.countTokens()];
		for(int i = 0; i <stations.length ; i++) {
			stations[i] = stk.nextToken();
			if(i==stations.length-1) { //index�� ����� �ʰ� ������� ä���� break;
				break; 
			}//if
		}//for
		return stations;
	}//Stations
	
	
	/**
	 * StringTokenizer�� �̿��� �迭�� ���� ������
	 * ���ǿ� ���� ���.
	 * �������� �� �� '��'���� �����ϴ� ���� ����.
	 * @param stations
	 */
	public void stationprint(String[] stations) {
		
		System.out.println("����");
		System.out.println("=============");
		
		for(int i = 0; i < stations.length ; i++) {
			
			if(stations[i].charAt(0)=='��') {
				this.cnt++;
			}//if
			System.out.println(stations[i]);
		}//for
		System.out.println("=============");
		System.out.printf("�������Ǽ� [%d],������ �����ϴ� ���Ǽ� [%d]" , stations.length , cnt);
	}//stationprint
	
	
	public static void main(String[] args) {
		
		HomeWork1 hw = new HomeWork1();
		String [] station2 = hw.Stations(hw.station);
		hw.stationprint(station2);
		
	}//main

}//class

