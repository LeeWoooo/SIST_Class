package day1111;

/**
 * method���ο� �����ϰ�, method�ȿ����� ���Ǵ� ����class�� ���.
 * @author owner
 */
public class UseLocerOuter {

	int outi;
	
	public void method(int param_i, int param_j) {
		
		int loci = 10;
		int locj = 10;
		
		///////////////// Local class ���� //////////////////
		
		class Local{
			int i;
			public Local() {
				System.out.println("����class�� �������Դϴ�.");
			}//������
			
			public void localMethod() {
				System.out.println("����class�� method i =" + i);
				System.out.println("�ٱ�class�� instnace���� outi =" + outi);
				System.out.println("method���� �������� loci =" + loci);
				System.out.println("method���� �������� locj =" + locj);
				System.out.println("method���� �Ű����� param_i =" + param_i + ",param_j =" +param_j);
				//���� class���� �ٱ�class�� Instance ������ ���Ҵ��� �����ϴ�.
				outi=34;
//				locj=1; //�������� ����� �����ϳ� ���Ҵ��� �� ������.
//				param_i = 1; //�� �Ҵ��� �� �� ����.
//				param_j = 1; //�� �Ҵ��� �� �� ����.
			}//localMethod
			
		}//Local
		///////////////// Local class ��  ///////////////////
		
		Local loc = new Local();
		loc.i=100;
		loc.localMethod();
		
	}//method
	
	public static void main(String[] args) {

		UseLocerOuter ulo = new UseLocerOuter();
		ulo.method(2020, 11);
	}//main

}//class
