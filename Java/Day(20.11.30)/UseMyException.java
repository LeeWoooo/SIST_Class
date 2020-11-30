package day1130.testexception;

import java.util.Random;

/**
 * ��������� ����ó�� class�� ����ϴ� class.
 * @author owner
 */
public class UseMyException {

//throws�� ������ ���ܴ� method �ȿ��� throw�� �߻��� ���ܰ� �Ǿ���մϴ�.
//�Ǵ� throws�� ������ ���ܴ� 	method �ȿ��� throw�� �߻��� ������ �θ� �� �� �ִ�.
	
	public void method() throws TestException{
		
		if(new Random().nextBoolean()) {
			
			//���ܰ� �߻��ϴ� ��Ȳ�̶�� ����
			
			//�⺻�����ڸ� ����� ���� �⺻���� msg�� ����� �� ����Ѵ�.
//			throw new TestException();
			
			//�Ű������� �ִ� �����ڸ� ����� ���� �������� msg�� ����� �� ����Ѵ�.
			throw new TestException("�������� �޼��� ���.");
			
		}//end if
		
	}//method
	
	
	/**
	 * ���� �ϴ� ���� ��19�� �̸��� ���ϴ� ���� ����ϸ� ���ܸ� �߻�
	 * @return 
	 * @throws Exception
	 */
	public  String smokeAge() throws SmokeException {

		String result = "";
		String[] grade = {"�ʵ��л�"," ���л�","����л�","���л�"};
	
		//�迭�� ������ŭ ������ ���, �迭���� ������° ���� ���� ��´�.
		String getGrade = grade[new Random().nextInt(grade.length)];
		
		if("�ʵ��л�".equals(getGrade)) {
			//�ʵ��л��� ���ϴ� ��Ȳ�� ���ܸ� �߻����� ó������.
			throw new SmokeException(getGrade + "�� ���� �� ���� �����Դϴ�.");
		}//end if
		if("���л�".equals(getGrade)) {
			//�ʵ��л��� ���ϴ� ��Ȳ�� ���ܸ� �߻����� ó������.
			throw new SmokeException(getGrade + "�� ���� �� ���� �����Դϴ�.");
		}//end if
		if("����л�".equals(getGrade)) {
			//�ʵ��л��� ���ϴ� ��Ȳ�� ���ܸ� �߻����� ó������.
			throw new SmokeException(getGrade + "�� ���� �� ���� �����Դϴ�.");
		}//end if
		
		result = "���� �� 19�� �̻���� �����մϴ�.";
		return result;
	}//smokeAge
	
	public static void main(String[] args) {
		
		UseMyException ums = new UseMyException();
		
//		try {
//		ums.method();
//		System.out.println("�������� �ڵ��� �����̴�.");
//		}catch(TestException te) {
//			System.err.println("method�ȿ��� ���ܰ� �߻� : "+ te.getMessage());
//			te.printStackTrace();
//		}//end catch

		try {
			String msg = ums.smokeAge();
			System.out.println(msg);
		}catch(SmokeException se) { 
			//�ֻ��� ���ܸ� throws�ϸ� method�� ȣ���Ͽ� ���� �ϴ°Ͱ�
			//����� ���� �����̱� ������ �������� ��������.
			se.printStackTrace();
		}//end catch
	}//main

}//class
