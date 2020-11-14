package day1112.mathclass;

/**
 * ���а��� class
 * Instance�� �������� �ʰ� ����մϴ�.(�����ڸ� ����� ����,���������� private)
 * @author owner
 */
public class UseMathClass {

	public UseMathClass(){
		
//		Math m = new Math(); �������� ���������ڰ� private�̱⿡ Instanceȭ �Ұ���.
		
		double d = 10.6;
		double d1 = 10.2;
		double d2 = 10.9;
		
		//�ݿø� (�Ҽ��� ù��° �ڸ����� �ݿø��� �մϴ�.
		System.out.println(d + "�� �ݿø�: " + Math.round(d));
		
		//�ø� (�Ҽ��� ù��° �ڸ����� �ø��� �մϴ�. ��ȯ���� double��)
		System.out.println(d + "�� �ݿø�: " + Math.ceil(d1));
		
		//���� (�Ҽ��� ù��° �ڸ����� ������ �մϴ�. ��ȯ���� double��)
		System.out.println(d + "�� �ݿø�: " + Math.floor(d2));
		
		//�Ҽ��� �Ʒ� ����
		System.out.println(d2 + "�� �Ҽ�����: "+ (int)d2);
		
		int i = -11;
		
		//���밪
		System.out.println(i + "�� ���밪: " + Math.abs(i));
		
		//���� �߻�
		d= Math.random(); //������ ���� ���´�.
		System.out.println("����: " + d);
		System.out.println("������ ����: " + (d * 10)); //�߻��� �� * ����
		System.out.println("������ ������ ������ Casting: " + (int)(d * 10)); //(����ȯ)(�߻��� �� * ����)
		
		//1~5������ �������� ������ ����
		System.out.println("1~5 ������ ����: " + (int)((d * 5)+1)); //(����ȯ)(�߻��� �� * ����)
		
		//���ĺ� �빮�� A���� Z�� ������ ���� �ϳ��� ������.
//		System.out.println("A(65)~Z(90) ������ ������ ����: " + (char)((d * (90-64)+65))); 
		System.out.println("A(65)~Z(90) ������ ������ ����: " + ((char)((Math.random()*26)+65))); 
		
		
	}//UseMathClass
	
	
	
	/**
	 * ���̰� 8�� char�迭�� 0~9,a~z,A~Z�� ���ڸ� �������� ����־� ��й�ȣ ����
	 * ��й�ȣ �ʱ�ȭ ����
	 * 
	 * @return
	 */
	public char[] createPassword() {
		
		//�迭����
		char[] tempPassword = new char[8];

		int random=0; //������ �Է¹��� ����.
		
		
		//�迭�� ���� �ְ� ����� �ݺ���
		for(int i = 0 ; i < tempPassword.length ; i++) {
			
			random=(int)((Math.random()*3)+1);//3������ ��츦 random���� �߻��ϱ� ���� ����

			switch(random) { //3������ ���� ����
			
			case 1: //0~9
				tempPassword[i]=(char)((Math.random() * 10)+48);
				break;
			case 2: //A~Z
				tempPassword[i]=((char)((Math.random()*26)+65));
				break;
			case 3: //a~z
				tempPassword[i]=((char)((Math.random()*26)+97));
				break;
			}//switch
			
//			System.out.print(tempPassword[i]); //�� �ڸ� Ȯ��

		}//for

		return tempPassword;
		
	}//createPassword
	
	
	public static void main(String[] args) {

		UseMathClass umc = new UseMathClass();
		
		char[] pass = umc.createPassword();
		
		for(int i = 0 ; i < pass.length ; i++) {
			System.out.print(pass[i]);
		}//for
		
	}//main

}//class
