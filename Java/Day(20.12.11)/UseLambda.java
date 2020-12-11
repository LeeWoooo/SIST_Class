package day1211;

import java.util.Random;

public class UseLambda {

	public UseLambda() {
		// Interface�� ���ϰ� ���. (���� class�� ������ �ʰ�, abstract method�� Override���� �ʰ� ���.
		Lambda1 l1 = () -> {
			System.out.println("Test method�� Override");
		};

		Lambda1 aoiny = new Lambda1() {
			@Override
			public void Test() {
				System.out.println("Test method�� Override");
			}
		};

		// ���ٽ� ȣ��
		l1.Test();
		aoiny.Test();

	}// UseLambda

	public void test(Lambda1 lm) {
		lm.Test();
	}// test

	public void pararmeter() {
		Lambda2 l2 = (String name) -> {
			String familyName = "";
			String firtstName = "";
			// �ԷµǴ� name�� ����Ͽ� ���� �̸��� ������ �Ҵ��ϴ� �ڵ带 �ۼ�

			String[] arr = { "����", "����", "����", "����" };
			int idx = 1;
			for (int i = 0; i < arr.length; i++) {
				if (name.startsWith(arr[i])) {
					idx = 2;
				} // end if
			} // end for
			familyName = name.substring(0, idx);
			firtstName = name.substring(idx);

			System.out.println("��: " + familyName + ", �̸�:" + firtstName);
		};
		l2.name("�̿��");
	}// pararmeter
	
	
	
	public void returnValue(){
	Lambda3 l3 =()->{
		Random r= new Random();
		return r.nextInt(45)+1;
	};
	
	System.out.println(l3.luckNumber());
	}//returnValue
	
	public void threadtest() {
	Runnable t =()->{
		for(int i = 1; i < 101; i++) {
			System.out.println(i);
		}
	};
	Thread tt = new Thread(t);
	tt.start();
	
	Thread ttt = new Thread(()->{
		for(int i = 1; i < 101; i++) {
			System.out.println(i);
		}
	});
	
	ttt.start();
	
	}//threadtest
	

	public static void main(String[] args) {
		UseLambda ul = new UseLambda();
		ul.test(() -> {
			System.out.println("���ٽ����� ����");
		});
		ul.pararmeter();
		ul.returnValue();
		ul.threadtest();
	}// main

}// class
