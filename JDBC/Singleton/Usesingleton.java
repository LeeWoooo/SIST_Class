package day1229.singleton;

public class Usesingleton {

	public static void main(String[] args) {
		//singleton pattern�� ���Ե� class�� �ܺο��� ��üȭ �� �� ����.
//		TestSingleton ts = new TestSingleton();
		//��ü�� ���� �� �ִ� method�� ����Ͽ� ��ü�� ��´�.
		
		TestSingleton ts = TestSingleton.getInstance();
		TestSingleton ts1 = TestSingleton.getInstance();
		
		System.out.println(ts);
		System.out.println(ts1);
		
		
	}//main
}//class
