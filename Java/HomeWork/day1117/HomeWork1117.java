package day1117.homework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * "�� - �� - �� ���� ����/���� ��:��:�� ������ ��¥ ������ ����Ѵ�.
 * ���� �� �� ���� �ѱ�,����,�̱�,�߱�,�Ϻ��� ��¥ �������� ��µǵ��� ��������
 * @author owner
 */
public class HomeWork1117 {
	
	String nation = " ";

	public void printDate() {
	// 1. �ý����� ��¥ ������ ��´�.
	Date data = new Date();
	// 2. SimpleDataFormat�� �̿��Ͽ� ���ϰ��� �ϴ� ��� ����� �����.
	Locale[] nation = new Locale[] {Locale.KOREA,Locale.UK,Locale.US,Locale.CHINA,Locale.JAPAN};
	String[] nation2= new String[] {"���ѹα�","����","�̱�","�߱�","�Ϻ�"};
	int flag = (int)(Math.random()*5+1); //1~5������ ������ �߻���Ŵ
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E", nation[flag]);
	String formatData = sdf.format(data);
	System.out.println(nation2[flag]+ "�� ���� �ð���" +formatData);
	}
	
	/**
	 * �����Ҷ����� ������ ������ �ð��� random���� ��µǰ� �ϱ� ���� method
	 * @return Locale.���� '
	 * ����� switch case���� ������ �迭�� �̿��ϸ� �� �����ϰ� ����� �ִ�.
	 */
	public Locale randomnation() {
		int flag = (int)(Math.random()*5+1); //1~5������ ������ �߻���Ŵ
		switch(flag) {
		case 1:
			this.nation = "�ѱ�";
			return Locale.KOREA;
		case 2:
			this.nation = "����";
			return Locale.UK;
		case 3:
			this.nation = "�̱�";
			return Locale.US;
		case 4:
			this.nation = "�߱�";
			return Locale.CHINA;
		default :
			this.nation = "�Ϻ�";
			return Locale.JAPAN;
		}//switch
	}//random nation
	
	public static void main(String[] args) {
		HomeWork1117 hw = new HomeWork1117();
		hw.printDate();
	}//main
}//class
