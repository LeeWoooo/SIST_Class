package day1125.event_isa;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")

//1. Window Component�� JFrame�� ���, �̺�Ʈ ó�� Listener ����.
public class UseActionEvent2 extends JFrame implements ActionListener{
	
	//2. �̺�Ʈó���� ���� �ִ� ������Ʈ�� �����Ѵ�.
	
	private JTextArea jtaNameDisplay;
	private JButton jbtnInput;
	private JTextField jtfName;
	
	//2. �����ڸ� �����Ѵ�.
	public UseActionEvent2() {
		super("ActionEvent ó��");
		
		//3.�Ϲ� Component�� �����մϴ�.
		JLabel jlblName = new JLabel("�̸�");
		jtfName = new JTextField(20);
		jbtnInput = new JButton("�Է�");
		jtaNameDisplay = new JTextArea();
		
		//4.�̺�Ʈ�� ����Ѵ�.
		
		jbtnInput.addActionListener(this); //��ư�� Ŭ���Ǹ� �̺�Ʈ ó��  �ڵ� ����.
		jtfName.addActionListener(this); //JTextField���� ����Ű�� �ԷµǸ� �̺�Ʈ ó�� �ڵ� ����.
		
		//5.��ġ������ ���� (���� �⺻ ���̾ƿ� �޴����� Border Layout�̴�)
		setLayout(new BorderLayout());
		
		//6.������Ʈ ��ġ
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
		
		//7.window ũ�� ����
		setLocation(500,500);
		setSize(400, 300);
		
		//8.����ڿ��� �����ֱ�
		setVisible(true);
		
		//9.window ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseLayoutManager
	
	//10. interface�� method�� ����
	@Override
	public void actionPerformed(ActionEvent ae) {

		//JTextField �Է°��� �����ͼ�.
		String name = jtfName.getText();
		System.out.println(name);
		//JTextArae�� �� �ֱ�
		jtaNameDisplay.append(name + "\n");
		//JTextField�� ���� ����
		jtfName.setText("");
		//JTextField�� cursor�� ��ġ
		jtfName.requestFocus();
	}//actionPerformed
	
	public static void main(String[] args) {

		new UseActionEvent2();
		
	}//main

}//class
