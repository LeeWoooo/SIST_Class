package day1117.awt;

import java.awt.Button;
import java.awt.Frame;

/**
 * ������ ���α׷��� (Component Programming)
 * @author owner
 */

//1. ������ Component�� ��� �޴´�. (����� ���� �����ֱ� ���ؼ�)
@SuppressWarnings("serial") //��ȣ�� ������� �ʰڴ�. (���� I/O ������ ��� ����)
public class HellowAWT extends Frame {

	//2.�����ڸ� �ۼ��Ѵ�.
	public HellowAWT() {
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
		
		//���� ���α׷��� �ݴ� �̺�Ʈó���� ����� �ʾҴ� (~11.17)
		
	}//HellowAWT

	public static void main(String[] args) {

			new HellowAWT();
			
	}//main

}//class
