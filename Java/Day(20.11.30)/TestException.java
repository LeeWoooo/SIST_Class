package day1130.testexception;

/**
 * ����� ���� ����ó�� class
 * @author owner
 */

//1. ����ó�� class�� ��� �޴´�.
@SuppressWarnings("serial")
public class TestException extends Exception{

	public TestException() {
		super("���ܹ߻��� �������� �޼���");
	}//TestException
	
	public TestException(String msg) {
		super(msg);
	}//TestException
	
}//class
