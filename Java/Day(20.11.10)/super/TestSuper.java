package day1110;

/**
 * �θ�Ŭ���� : �ڽ�class���� ����ؾ� �� ���� �ڵ�
 * @author owner
 */
public class TestSuper {
	
	int i;
	int j;
	
	public TestSuper(){
//		super(); //Object class�� ����� �ް��ֱ� �����̴�.
		this(100);
		System.out.println("TestSuper�⺻������(�θ�)");
	}
	public TestSuper(int i ){
//		super(); //Object class�� ����� �ް��ֱ� �����̴�.
		System.out.println("TestSuper �Ű����� �ִ� ������(�θ�)");
	}

	public void print() {
		System.out.println("�θ��� i = " + i + " �θ��� j = " + j);
	}
}
