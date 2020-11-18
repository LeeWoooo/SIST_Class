package day1118.swing;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * AWT���� ���� Window Application�� ������ �� �ִ� Swing�� ����Ѵ�.
 * @author owner
 */

//1. javax.swing.JFrame�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseSwing extends JFrame {
	
	//2. Default Constructor ����
	
	public UseSwing() {
		super("JFrame�� ����Ͽ� Window Application �����ϱ�");
		
		//3. �Ϲ� Component����
		Button btn = new Button("AWT�� ��ư");
		JButton jbtn = new JButton("SWING�� ��ư");
		
		//4. ��ġ (Component�� ����)
//		add(btn);
//		add(jbtn);//������ �߰��� �͸� ���� �ִ´�.
		
		//��ġ ������ : Layout Manager�� ����Ͽ� Component�� ��ġ�Ѵ�.
		
		setLayout(new GridLayout(1, 2));
		add(btn);
		add(jbtn);
		
		//5. Window�� ũ��
		setSize(400, 200);
		
		//6.������ Component�� ����ڿ��� �����ֱ�
		setVisible(true);
	
		//Window�� ��������
		//������� ������ window�� �ݾƵ� Instance�� �۵��ϰ� �ִ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}//UseSing 
	

	
	public static void main(String[] args) {
		
		new UseSwing();
		
	}//main

}//class
