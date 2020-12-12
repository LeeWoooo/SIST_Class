package day1111;

import day1111.sub.Clark;
import day1111.sub.Fly;

/**
 * method�� �Ű������� class�� Interface�� �Ű������� �����ϰ� ���� ��
 * ������ class������ �ۼ����� �ʰ� method�� ȣ�� �� ���ִ� "�͸� class"�� ���.
 * @author owner
 */
public class UseAnonymous {

	public void useFly(Fly fly) {
		System.out.println(fly.drivigForece() + "/" + fly.upwoardForece());
	}
		public static void main(String[] args) {
		
			//Fly�� ������ class�� �ۼ��ϰ� Instanceȭ�� �մϴ�.
			
			Clark c = new Clark();
			//method�� ȣ���ϱ� ���� this.class�� Instanceȭ �Ѵ�.
			UseAnonymous ua = new UseAnonymous();
			//methodȣ��
			ua.useFly(c); //Clark�� fly�� is a �����̹Ƿ� Clark instance�� �Ҵ��� ���ִ�.
			
			//Fly�� ������ class ������ ������ �ۼ����� �ʰ� anonymous inner class�� ó���� �� �ִ�.
			//�ܺ�class��.class , �ܺ�class��$1.class �̷��� 2���� byte�ڵ尡 �ۼ��ȴ�.
			ua.useFly(new Fly() {
				@Override
				public int upwoardForece() {
					return 0;
				}//upwoardForece

				@Override
				public int drivigForece() {
					return 0;
				}//drivigForece
			});
			
		}//main
}//class
