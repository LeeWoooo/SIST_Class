package day1117.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class HomeWork1117_2_review {
	
	public static final int UNKNOWN =2;

	/**
	 * List�� �����͸� �߰��ϰ� ��ȯ�ϴ� ���� �Ѵ�.
	 * @return ���α׷�, �� ������, ���߳⵵
	 */
	public List<String> getList(){
		// 1. is a ������ Instanceȭ�� List ����
		List<String> list = new ArrayList<String>();
		// 2. List�� �� �߰� 
		list.add("Java-James Gosling:1995");
		list.add("Oracle-Larry Ellison");
		list.add("Python-Guido van Rossum:1991");
		list.add("HTML-Tim Berners, LEE:1995");
		list.add("JavaScript-Brandan");
		return list;
	}//getList
	
	

	public void printlist(List<String> list) { //ó���� �����͸� ���� List�� �Ű������� �޾� 
		System.out.println("�׸�\t�ٽɰ�����\t\t���߳⵵");
		System.out.println("------------------------------------");
		if(list.isEmpty()) {//ó���� �����Ͱ� ���� ��
			System.out.println("ó���� Data�� �������� �ʽ��ϴ�."); //List�� ó���� ���� �����Ͱ� ������ ���� ó���� �ʼ������� ���� �Ѵ�.
		}else { //ó���� �����Ͱ� ������ �� 

			//�ݺ����� ����Ʈ�� ���� ���� ���� �����ϱ� ���� ����
			String data =" "; //empty�� ó���ϸ� �޼ҵ� ȣ���� �����ϰ� ������ error�� ����
			StringTokenizer stk = null;
			int cntToken = 0;
//			int j; // �ݺ��� �ȿ��� ������ �����ϸ� �����Ϳ� ������ ������ ������ �ϸ鼭 ���������� �߻����� ���� �ӵ��� ���� ��Ų��.
			for(int i = 0 ; i < list.size(); i ++) {
				data=list.get(i);
				stk = new StringTokenizer(data,":-");
				cntToken = stk.countTokens(); // �⺻ ���ڿ��� ���е� ��ū�� ���� ��´� => 2 or 3
				while(stk.hasMoreTokens()) { // ��ū�� �����ϴ�?
					System.out.printf("%s\t", stk.nextToken());
				}//end while
				switch(cntToken) {
				case UNKNOWN:
					System.out.printf("%s", "�˼�����");
				}//end switch
				cntToken = 0; //��ū�� �ʱ�ȭ
				System.out.println();
			}//end for 
			
			
		}// end else
		
		
		
	}//printlist
	
	
	
	
	public static void main(String[] args) {
		HomeWork1117_2_review hw2r = new HomeWork1117_2_review();
		//method�� return�� ������ ������ ������ ����� �޾��ش�.
		List<String> list = hw2r.getList();
		hw2r.printlist(list);
		
	}//main
	
}//class