package day1117.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class HomeWork1117_2 {

	//1.���� �Է¹޾� List�� �߰��ϰ� List�� ��ȯ�ϴ� method����
	public List<String> temp() {
		List<String> list = new ArrayList<String>();
		list.add("Java-James Gosling:1995");
		list.add("Oracle-Larry Ellison");
		list.add("Python-Guido van Rossum:1991");
		list.add("HTML-Tim Berners, LEE:1995");
		list.add("JavaScript-Brandan");
		return list;
	}//temp
	
	//2.List�� �޾� ������ ���Ĵ�� ����ϴ� method
	public void printtemp(List<String> list) {
		
		//�Է¹��� List�� �迭�� �����ؼ� �ֽ��ϴ�.
		String[] copy = new String[list.size()];
		list.toArray(copy);

		//����� ���ڿ��� ���� �迭�� �����մϴ�.
		String[][]arr = new String[5][3];
		
		
		//�迭�� ������ �ϳ��� �����ͼ� StringTokenizer�� �̿��� �ڸ��� �迭�� �Է��մϴ�.
		int flag = 0; //�迭�� ���� index�� �������� ����
		for(int i = 0; i <copy.length ; i++) {
			StringTokenizer stk = new StringTokenizer(copy[i],"-:");
				flag=0; //���� �ʱ�ȭ
				while(stk.hasMoreTokens()) {
					arr[i][flag]=stk.nextToken();
					flag++;
			}//while
		}//for
		
		//���ڿ��� ���� �迭�� ����մϴ�. 
		System.out.print("�׸�\t�ٽɰ�����\t���߳⵵\n");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0 ; j <arr[i].length; j++) {
				if(arr[i][j]==null) {//���߳⵵�� ���°�� �迭�� �濡 ������ data���� �ʱ�ȭ ���� null���� ����Ǿ� �ִ�.
					arr[i][j]="�˼� ����"; // null���� �ִ°�� �˼� �������� �ٲ��ش�.
				}//end if
				System.out.printf("[%s]",arr[i][j]);
			}//end for
			System.out.println();
		}//for
	}//print temp
	
	
	public static void main(String[] args) {
		HomeWork1117_2 hw2 = new HomeWork1117_2();
		hw2.printtemp(hw2.temp());
	}//main
	
}//class