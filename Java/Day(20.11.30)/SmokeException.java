package day1130.testexception;

@SuppressWarnings("serial")
public class SmokeException extends Exception {

	
	/**
	 * �Ϲ����� ������ �޼���
	 */
	public SmokeException() {
		super("���� �طӽ��ϴ�.");
	}//SmokeException
	
	/**
	 * ��Ȳ�� �´� ������ �޼���
	 * @param msg
	 */
	public SmokeException(String msg) {
		super(msg);
	}//SmokeException
	
	
}//SmokeException
