package day1110;

/**
 * �ڽ� class
 * @author owner
 */
public class TestSub extends TestSuper {
	
	int j; // �θ�� ���� �̸��� ����.
	int k;

	public TestSub() {
		super(); // ��ӹ��� TestSuper�� �⺻�����ڸ� ȣ��.
		System.out.println("TestSub �ڽ�class�� �⺻ ������");
	}
	
	@Override
	public void print() {
		j=11; //�θ�� �ڽ��� ���� �̸��� ������ ������ �ڽ��� ������ ���� ����ϰ� �ȴ�.
		k=10;
		
//		i = 20000;  //�θ� ���� ������ �ĺ��Ǿ� ���ȴ�.
//		this.i = 20000;  //�θ� ���� ������ �ڽ�class�� �����ּ��� this�� ���� ���� �� �ִ�.
		super.i = 20000;  //�θ� ���� ������ �θ��� ������ �ּ� super�� ���� ���� �� �ִ�.
		
		//�θ�� �ڽ��� ���� �̸��� ������ ������ �ִ� ���¿���, �θ� ������ ����ϱ� ���ؼ���
		//�ݵ�� super�θ� ������ �ؾ��մϴ�.
		super.j = 2020; //�θ�class �� Instance ���� j�� �� �Ҵ�.
		this.j = 11;//�ڽ�class�� Instance ���� j�� �� �Ҵ�.
		
//		System.out.println(super); // �ڽ�class���� �θ�class�� �ּҸ� ��� �� ��  ����.
		System.out.println("�ڽ��� j = " + j + " �θ��� k = " + k);
		super.print(); //�ڽ��� method�� �ƴ� �θ��� method�� ȣ��
	}
	
	public static void main(String[] args) {
		
		
		TestSub ts = new TestSub();
		ts.print();
		//�ν��Ͻ��� �ּҷδ� �θ�� �ڽ��� �̸��� ���ٸ� �ĺ����� ���ϱ� ������ �θ��� �ڿ���
		//ȣ���� ������.
		
	}//main
}//class
