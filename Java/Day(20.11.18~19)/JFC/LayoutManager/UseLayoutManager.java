package day1119.layoutmanager;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")

//1. JFrame�� ��ӹ޴´� ( Window Component�� ��ӹ��� �Ͱ� ����)
public class UseLayoutManager extends JFrame {
	
	//2. �����ڸ� �����Ѵ�.
	public UseLayoutManager() {
		super("�������� Layout�� ����մϴ�.");
		
		//3.�Ϲ� Component�� �����մϴ�.
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(20);
		JButton jbtnInput = new JButton("�Է�");
		JTextArea jtaNameDisplay = new JTextArea();
		
		//4.��ġ������ ���� (���� �⺻ ���̾ƿ� �޴����� Border Layout�̴�)
		setLayout(new BorderLayout());
		
		//5.������Ʈ ��ġ
		//BorderLayout�� �ϳ��� ������ �ϳ��� ������Ʈ�� ��ġ�� �� �ִ�.
		//North�������� �������� component�� ��ġ�ϰ��� �ϱ⿡ Container Component�� Jpanel�� �ʿ��ϴ�.
		JPanel jpNouth = new JPanel(); //flow layout
		//Container Component�� Layout�� ��������
		jpNouth.setLayout(new FlowLayout());
		jpNouth.add(jlblName);
		jpNouth.add(jtfName);
		jpNouth.add(jbtnInput);
		
		add("North",jpNouth);
		add("Center",jtaNameDisplay);
		
		//6.window ũ�� ����
		setLocation(500,500);
		setSize(400, 300);
		
		//7.����ڿ��� �����ֱ�
		setVisible(true);
		
		//8.window ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//UseLayoutManager

	public static void main(String[] args) {

		new UseLayoutManager();
		
	}//main

}//class
