package day1111;

/**
 * class�ȿ� class�� ���ǵǴ� class
 * @author owner
 */
public class UseInner {

	int outi;
	
	public UseInner() {
		System.out.println("�ٱ�class�� ������ �Դϴ�.");
	}//Uselnner
	
	public void createInner() {
		//���� class�� Instanceȭ
		@SuppressWarnings("unused")
		Inner in = this.new Inner(); //this�� method�� ȣ���ϴ� Instance�� ��ü�� �ּҷ� ��ü.
		// ���� Instanceȭ�� �����ϸ� �������� this�� ������ �����ϴ�. this.new ==> new �� �����ϴ�.
	}//createInner
	
	public void outMethod() {
		System.out.println("�ٱ�class�� method outi" + outi);
//		System.out.println("����class�� method j" + j); �ٱ� class���� ���� class�� ������ ���� �����Ͽ� ����� �� ����.
//		inMethod(); �ٱ� class���� ���� method�� ���� ȣ���� �� ����.
	}//outMethod
	
	
	////////////////////////// Innerclass ���� //////////////////////////
	
	public class Inner{
		int j;
		public Inner() {
			System.out.println("���� class�� �������Դϴ�.");
		}//������
		
		public void inMethod(){
			System.out.println("���� class�� method j = " + j);
			System.out.println("�ٱ� class�� method outi = " + outi); //���� class������ �ٱ���class�� ����� �� �ִ�.
			outMethod();//����class������ �ٱ��� class�� method�� ���� ȣ���Ͽ� ����� �� �ִ�.
		}//inMethod
	}//Inner
	
	////////////////////////// Innerclass �� //////////////////////////
	public static void main(String[] args) {
		
		//Innerclass�� Instanceȭ
		//1.�ٱ� class�� Instanceȭ ����.
		UseInner ui = new UseInner();
		ui.createInner();
		//2.�ٱ� class�� ����Ͽ� Inner class�� Instance�� �����մϴ�.
		//�ٱ� class��.����class�� Instance�� = �ٱ�class�� Instance.new ����class�� ������();
		UseInner.Inner in = ui.new Inner(); //���1
		@SuppressWarnings("unused")
		Inner in2 = ui.new Inner();//���2 (�ٱ�class�� ���� ������ �����մϴ�.)
		
		in.j = 11;
		in.inMethod(); //���� class�� method���� �ٱ� class�� ������ method�� ȣ���� �� �ֽ��ϴ�.

	}//main

}//class
