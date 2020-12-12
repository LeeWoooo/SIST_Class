package day1111;

/**
 * Interface�� ������ class�Դϴ�.
 * class���� �ʿ��� ��� Interface�� ������ �� �ֽ��ϴ�.(�������� Interface���� ����.)
 * ����)
 * ���������� class�� implements �������̽���,,,,,,,,
 * @author owner
 */
public class TestImpl implements TestSuper {
	
	@Override
	public void methodA() {
		System.out.println("Override �� methodA�� ȣ��Ǿ����ϴ�.");
	}//methodA

	@Override
	public void methodB() { //abstract�� Override �� ���� abstract�� ����.
		System.out.println("Override �� methodB�� ȣ��Ǿ����ϴ�.");
	}//methodA

	@Override
	public String name() {
		return "�ڽ��� �̸�";
	}//name
	
	public void subMethod() {
		System.out.println("�ڽ��� method");
	}

	public static void main(String[] args) {
		
//		Interface�� Instanceȭ�� ���� �ʽ��ϴ�.
//		TestSuper ts = new TestSuper(); �����ڰ� ���� ������ �Ұ��� �ϴ�.
		
//		Interface�� ������ class�� Instance�� �ּҸ� ������ �� �ִ�. = is-a������ Instanceȭ
		TestSuper ts = new TestImpl();
		System.out.println(ts);
		
//		ts Instance�� ȣ���� ������ ��.
//		is - a �����̱� ������ ����� ������ ���� �θ�class�� �ڿ��̴�.(�θ��� ���� , �θ��� method)
		
		ts.methodA(); // �ڽ� class���� Override�߱⿡ �ڽ�class���� Override�� method�� �ֿ켱���� ȣ��
		ts.methodB();
		System.out.println(ts.name());
//		ts.subMethod(); is-a����� instanceȭ �ϸ� �ڽ��� �ڿ��� ����� �� �����ϴ�.
		
		
	}//main
}//class
