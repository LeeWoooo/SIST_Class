package day1117.stack;

import java.util.Stack;

/**
 *	LIFO(Last Input First Output)�� ������ Class  Stack�� ��� 
 * @author owner
 */
public class UseStack {

	public UseStack() {
		
		//1.����: IS-A ������ Instanceȭ�� ���� �ʽ��ϴ�.
		
		Stack<String> stk = new Stack<String>();
		//2.methodȣ�� : �θ��� method�� ������� �ʽ��ϴ�. (LIFO�� ����� �� �ֱ⿡)
		
		//�� �߰�						[heap]
		stk.push("A");				//D
		stk.push("B");				//C
		stk.push("C");				//B
		stk.push("D");				//A
		
		System.out.println(stk);
		
		//Stack�� ����ִ���?
		System.out.println("Stack�� ����ִ°�?" + stk.empty());
		
		//�� ���
		stk.pop(); //stack�� ���� ���� ����Ǿ� �ִ� D�� ��ȯ�ȴ�.
		System.out.println(stk + " / " + stk.empty());
		
		//Stack�� ��� �� ��� (�ϰ�ó��)
		while(!stk.empty()) {
			System.out.println(stk.pop()); // C , B, A ������� ����� �ȴ�. (���Լ���)
		}//end while
		
		System.out.println("Stack�� ����ִ°�?" + stk.empty());
		
	}//UseStack
	public static void main(String[] args) {
		new UseStack();
	}//main

}//class
