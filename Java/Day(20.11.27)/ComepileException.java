package day1127.objectclone;

/**
 * ��ü�� �����Ѵ� (���� ���� ���� ��ü)
 * ��� ��ü�� clone()�� ȣ���� �� ������ �������� �ʴ´�.
 * clone()�� protected�̹Ƿ� �����Ϸ��� class �ȿ����� �����������ϴ�
 * @author owner
 */
public class ComepileException implements Cloneable {
	
	private int year;
	private String name;
	
	public ComepileException() {
		year = 2020;
		name = "test";
	}
	
	
	public static void main(String[] args) {

		//1.�����Ϸ��� ��ü�� �����Ѵ�.
		ComepileException ce = new ComepileException();
		
		//2.����
		//clone() method�� �����Ͽ��ܸ� throws�ϰ� �����Ƿ� �����ڴ� �ش� ���ܸ� �ݵ�� try~catch�� ó���ؾ���
		//��ü�� ���¸� �����ؾ� �� �� ����Ѵ�.
		try {
			ComepileException ce1 = (ComepileException)ce.clone();
			System.out.println("�����Ǿ����ϴ�");
			System.out.println(ce + " /" + ce1);
			ce.year = 1010;
			ce.name= "�׽�Ʈ";
			ce1.year = 101010;
			ce1.name= "���׽���ƮƮ";
			System.out.println(ce.year + "/" + ce1.year + "/" + ce.name + " / " + ce1.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}//end catch
		
		//forName()�� ClassNotFoundException�� throws�ϰ� �ֱ� ������
		//method�� ȣ���ϴ� ������ try~catch�� ó���ؾ��Ѵ�.
		try {
			Class cl = Class.forName("java.lang.String");
			System.out.println(cl);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		
		
	}//main
}//class
