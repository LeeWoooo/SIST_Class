package day1110;

import java.util.Date;
import java.util.List;

/**
 * annotation���
 * @author owner
 */
public class UseAnnotation {

	
	@Override //annotations. Override�� ����� �ߴ��� compiler�� Ȯ�����ش�.
	public String toString() {
		return "���� �ּҸ� ��ȯ�ϱ�Ⱦ��.";
	}//to string
	
	
	/**
	 * �������� ����ϱ� ����� ��쿡 
	 * @deprecated�� �ɾ ����õ method���� �˸���.
	 * �������̸� ������� ������~
	 * ��ü class�� method�� ����
	 */
	@Deprecated
	public void test( ) {
		System.out.println("�����ڵ�����");
	}//test
	
	
	
	//unused - ������ ������ ������ ����� ��� ���ֱ�.
	//rawtypes - ���������� �������� ���� Generic�� ����ϴ� ������ �����ϴµ�
	//				Generic�� ������� �ʰ� JCF�� ����ؾ� �� �� �߻��ϴ� ��� ���ֱ�.
	@SuppressWarnings({ "unused", "rawtypes" })
	public void temp() {
//		@SuppressWarnings("unused")
		int i;
		
//		@SuppressWarnings({ "unused", "rawtypes" })
		List l = null;
	}//temp
	
	
	
	public static void main(String[] args) {

		String str = new String("������ ȭ�����Դϴ�.");
		System.out.println(str);//�ּ�x //��ü�� ���������� �ּҰ��� ������ �ʴ°��� �� ��ü���� toString �� Overriding �� ���̴�.
		System.out.println(str.toString());//�ּ�X / object.toString()�� Override �Ͽ� �ּҰ� �ƴϰ� ���� ���´�.
		
		UseAnnotation ua = new UseAnnotation();
		System.out.println(ua); //�ּ�
		System.out.println(ua.toString()); //�ּ�O / Object.toString()�� Override ���� �ʾ� Object�� �����ϴ� �ּ� ���°� ���ڿ��� ��ȯ.
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		Date date = new Date();
		System.out.println(date); // Object���� toString()�� Override�Ͽ� �ּҰ� �ƴ� message�� ��ȯ�ȴ�.
		System.out.println(date.toString());
		System.out.println(date.getYear() + 1900); //����õ method�� �ҷ��ָ� ���� �ϱ�� ������ ���ϴ� ����� �������� ����. �������̸� ����������.

		ua.test();
		
	} //main

}//class
