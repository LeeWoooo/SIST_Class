package day1113.random;

import java.util.Random;

/**
 * ������ ��� ���� �������� ������� class
 * @author owner
 */
public class UseRandom {

	public UseRandom() {
		//1.class�� Instanceȭ �մϴ�.
		Random random = new Random();
//		System.out.println(random);// to String�� Override���� �ʾұ� ������ �ּҰ� ���´�.
		
		//2. method�� ȣ���Ͽ� ������ ��� ���� ����.
		int num=random.nextInt();
		System.out.println("������ ���� �߻�");
		System.out.println("�߻��� ����: = " +num);
		System.out.println("������ ����: = " +num%10); // %������
		System.out.println("������ �������� ����� ��� = " + Math.abs(num%10));
		
		int num1=random.nextInt(10); //nextInt(������)
		System.out.println("������ ���� = " + num1);
		
		//�Ǽ��� ����
		double num2 = random.nextDouble();
		System.out.println("�Ǽ��� ���� �߻�");
		System.out.println("�߻��� ���� = " + num2);
		System.out.println("������ ���� = " + num2*5); // *���� 
		System.out.println("������ �������� ������ ��� = " + (int)(num2*5)); // int������ casting����
	
		//Boolean�� ����
		System.out.println("Boolean�� ���� �߻�");
		boolean bool = random.nextBoolean();
		System.out.println("Boolean�� ���� = " + bool);
		
	}//UseRandom
	
	public static void main(String[] args) {

		new UseRandom();
		
	}//main

}//class
