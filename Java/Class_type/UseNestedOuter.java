package day1111;

/**
 * ��øclass : class�ȿ� static class�� �����ϴ� class
 * @author owner
 */
public class UseNestedOuter {
	
	int outi; //instance����
	
	static int outj; // static����

	public void outInsMethod() {
		System.out.println("�ٱ� class�� Instance method");
	}//outInsMethod
	
	public static void outStaMethod() {
		System.out.println("�ٱ� class�� static method");
	}//outStaMethod
	
	
	//////////////////////////Nested class ���� //////////////////////////
	static class Inner{
		
		static int ini;
		//public Inner() {}; Nested class�� �������� �ʰ� ����մϴ�.(�⺻������)

		public static void inMethod() {
			System.out.println("���� class�� method�Դϴ�.");
			//outi=100; static���������� instance ������ ����� �� �����ϴ� 
			//outStaMethod(); static���������� instance method�� ����� �� �����ϴ� 
			
			outj=1000; //���� static ������ �ֱ⿡ ����� �����մϴ�.
			outStaMethod(); //���� static ������ �ֱ⿡ ����� �����մϴ�.
		}//inMethod (Nested class�� ��� ���������ڸ� static���� �����ϴ°� �����Ѵ�.)
		
		
		
	}//class
	//////////////////////////Nested class �� //////////////////////////
	public static void main(String[] args) {
		
		Inner.inMethod(); //���� class�� method�� static�������� ����� �� �ִ�.
		
	}//main

}//class
