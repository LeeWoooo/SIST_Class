package day1112.homework;

//1~45�� ������ ������ ���� 6���� �迭�� �����Ͽ� ��ȯ�ϴ� method�� �����
//���� 6���� ����� ������. ( �ߺ����ڰ� ������ �ȵ˴ϴ�. )




public class HomeWork2 {

	int random=0; // 1~45�� ������ ���� ����
	
	public int[] lotto() {
	
	// 1. 6���� ��ȣ�� ������ �迭 ����.
	int[] num = new int[6];
	
	for(int i = 0; i < num.length ; i++) { //��� �濡 ���� ���� �ݺ���.
		random = (int)((Math.random()*45)+1);
		num[i]=random;
		//���� ���� ���� ��������� ���� ���ٸ� �����° ���� ������ �ٽ� ����
		for(int j = 0 ; j < i ; j++) {
			//������� ���� �ٽ� ����
			if(num[i]==num[j]) {
				i--;
				break; //���� for�� ����������.
			}//if
		}//for
	}//for
	return num;	
	}//rotto
	
	
	public void printlotto(int [] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%-4d",arr[i]);
		}//for 
	}//printlotto
	
	public static void main(String[] args) {
		HomeWork2 hw = new HomeWork2();
		int[] temp = hw.lotto();
		hw.printlotto(temp);
		
	}//main
}//class
