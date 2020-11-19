package day1117.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * ������ ���α׷��� (Component Programming)
 * @author owner
 */

//1. ������ Component�� ��� �޴´�. (����� ���� �����ֱ� ���ؼ�)
@SuppressWarnings("serial") //��ȣ�� ������� �ʰڴ�. (���� I/O ������ ��� ����)
public class HellowAWT3 extends Frame{ //HellowAWT2�� Frame Is- a�����̴�.

	//2.�����ڸ� �ۼ��Ѵ�.
	public HellowAWT3() {
		//�θ�����ڸ� ȣ���Ѵ�. title�� �Է��� �θ� class�� �����ڸ� ȣ���Ѵ�.
		//���α׷��� ����� ���� �� ���α׷��� title�� �ǹ�
		super("�ȳ��ϼ���. AWT!");
		
		//3.������Ʈ ����
		Button btn = new Button("���� ��ư ^o^");
		
		//4.������Ʈ ��ġ
		add(btn);
		
		//5.Window�� ũ�⸦ �����Ѵ�.
		setSize(200,100);
		
		//6.����ڿ��� �����ֱ�
		setVisible(true);
		
		//���� �����츦 �ݴ� �̺�Ʈó���� ����� �ʾҴ� (~11.17)
		//(11.18 �߰�����)
		
//		addWindowListener(this); // ���� class�� Window Listener�� Is-a ���谡 �ƴϹǷ� this�� ����� �� ����.
		
		//anonymous inner class ó��
		//WindowListener interface�� �̸� ������ class�� WindowAdapter�� ����.
		//WindowAdapter class�� WindowListener�� 7�� �߻� method�� �Ϲ� method�� 
		//���� �߱⶧���� WindowAdapter�� �ʿ��� method�� ����(Override)�Ѵ�.
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
		}; 
		});
		
	}//HellowAWT
	



	public static void main(String[] args) {

			new HellowAWT3();
			
	}//main

}//class
