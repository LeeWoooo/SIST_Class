package day1229.singleton;

/**
 * singleton pattern�� ������ class
 * 
 * @author owner
 */
public class TestSingleton {

	//��ü�� �ϸ� ������ �� ���ϱ� ����
	private static TestSingleton ts;
	
	// 1.class �ܺο��� ���� ��üȭ�� ���� ���ϵ��� ���´�.
	private TestSingleton() {
	} //TestSingleton

	// 2.��üȭ�� ��ȯ�ϴ� method�� ����
	public static TestSingleton getInstance() {
		if(ts == null) { //��ü�� ������ �Ǿ����� �ʰų� ��ü�� �Ҹ�Ǿ��ٸ�
			ts = new TestSingleton();
		}// end if
		return ts;
	}//end getInstance
}// class
