package day1127.usethrow;

/**
 * ���� ���� �߻�. 
 * 
 * ���̵�� ��й�ȣ�� �Է¹޾� ���̵� "admin"�̰� ��й�ȣ�� "1234"�϶��� �α��� ���� ó��
 * �α��� ���н� ���ܸ� �߻����� ȣ���� ������ �α��� ���� ó���� �����Ѵ�.
 * @author owner
 */
public class UseThrow {

	public void login(String id, String password) throws Exception{
		
		//���ڿ� ��ü�� method�� ȣ���Ͽ� ���� ������ NullPointerException�� �߻��� �� �ֱ� ������
		//���ܰ� �߻��ϴ� ��Ȳ�� �̿��� �����ϱ� ���� "".equals(������)�� ������ ����Ѵ�.
		if("admin".equals("id") && "1234".equals(password)) { //���ڿ��� ������ ���ϴ°� ==�� ���ڿ��� �⺻������ ������������� ���� �������϶��� �ּҺ񱳷� �Ұ���
			System.out.println("�α��� ����!");
		}else {
			throw new Exception("�α��ν���, ���̵� ��й�ȣ�� Ȯ�����ּ���.");
		}//end else
	}//end login
	
	public static void main(String[] args) {
		
		String id = null ;
		String password = "1234";

		UseThrow ut =	new UseThrow();
		try {
			ut.login(id, password);
		}catch(Exception e){
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}//end catch
		
	}//main
}//class
