package day1127.useruntimeexception;

public class PrintErrorMsg {

	public static void main(String[] args) {
	
		
//		System.out.println("�������");
//		System.err.println("�������");
		
		try {
		int i = Integer.parseInt(args[0]);
		System.out.println(i);
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.err.println(aioobe.getMessage());
		}catch (NumberFormatException nfe) {
			System.err.println(nfe.getMessage()); // ���� ����
			System.err.println(nfe.toString()); // ����ó�� class �� ���� ����
			nfe.printStackTrace(); //stack�� ���� �ڼ��� ���� �޼���
		}
	}//main
}//class
