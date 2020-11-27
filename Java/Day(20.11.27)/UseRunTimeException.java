package day1127.useruntimeexception;

/**
 * Runtime Exception ó��
 * ArrayIndexOutOfBoundsException : �迭 , List�� ���� Index�� ����� ��
 * NumberFormetException : ���ڿ��� ���ڷ� ������ ��, ���ڿ��� ���ڷ� ������� ���ϴ� �������� �Էµ� ��
 * ArithmeticException: 0���� ������ �߻��Ѵ�.
 * @author owner
 */
public class UseRunTimeException {

	
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		try {
			num1 = Integer.parseInt(args[0]);//ArrayIndexOutOfBoundsException, NumberFormatException
			num2 = Integer.parseInt(args[1]);//ArrayIndexOutOfBoundsException, NumberFormatException

			result = num1/num2;//ArithmeticException
			System.out.printf("%d / %d = %d",num1, num2 , result);
		
		}catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("���α׷��� ������ �� ���� 2�� �־� ����ؾ� �մϴ�.");
			System.out.println("����) java day1127.UseRunTimeException ��1 ��2");
		}catch(NumberFormatException nfe){
			System.out.println("���� ������ �Է� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (Exception e){ //�����ڰ� �ν����� ���ϴ� ���� ó���� �ϱ� ���� �ֻ��� ����class�� �������� �������ش�. 
			System.out.println("�����ڰ� �ν����� ���ϴ� ���� ó�� �ϱ� ���� �ֻ��� ���� class");
		}
		finally {
			System.out.println("���� �Է°���" + num1 + " / " + num2 + "�Դϴ�");
		}//end try
		
		//instance of ������ - ��ü�� class(interface)�� ������ ��ü���� �Ǵ�.
		PrintErrorMsg pem = new PrintErrorMsg();
		System.out.println(pem instanceof PrintErrorMsg);
		
		
	}//main

}//class
