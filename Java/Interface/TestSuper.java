package day1111;

/**
 * ���� class�� �ݵ�� �����ؾ��� ���� ��ϸ� ����.
 * @author owner
 */
public interface TestSuper {

//	int i; ������ ���� �� ����.
	public static final int MAX = 99999; //����� ���� �� �ֽ��ϴ�.
	
//	public TestSuper() {}  �����ڸ� ���� �� ����.
	
//	public void test() {} ������ ������ �� �ִ��Ϲ� method�� ������ ����.
	
	public void methodA(); // abstract�� ������ abstract method;
	
	public abstract void methodB(); // abstract�� ����� abstract method;
	
	public abstract String name(); // abstract�� ����� abstract method;
	
	
}//class
