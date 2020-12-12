package day1119.textcomponent;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1. Window ������Ʈ�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseTextComponent extends JFrame {

	//2.�����ڸ� �ۼ��Ѵ�.
	public UseTextComponent() {
		super("�ؽ�Ʈ������Ʈ�� ���");

		//3.������Ʈ�� �����մϴ�.
		
		JLabel jlblID = new JLabel("ID");
		JTextField jtfID = new JTextField(10);
		JLabel jlblPassword = new JLabel("Password");
		JPasswordField jpfPassword = new JPasswordField(10);
		jpfPassword.setEchoChar('*');
		
		JTextArea jta = new JTextArea();//scrollbar�� ����.
		JScrollPane jsp = new JScrollPane(jta);//swing textarae�� scrollbar �߰�
		
		//�Էµ� ���ڿ��� TextArea�� �� ������ �Ѿ�� ���� �����Ѵ�.
		jta.setLineWrap(true);
		
		//�ܾ� ��ȣ :�ѱ��� ���� �ʴ´�.
		jta.setWrapStyleWord(true);
		
		TextArea ta = new TextArea();//awt textarea
		
		//4.��ġ�����ڸ� ����
		setLayout(new BorderLayout()); //JFrame�� ��ġ �����ڴ� BorderLayot
		
		//North�� panel�� �̿��� �������� component�� ���´�.
		JPanel jpNorth = new JPanel();
		
		//Center�� pannel�� �̿��� �������� component�� ���´�.
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(1,2)); //FlowLayout => GridLayout���� ����
		
		//5.component�� ��ġ
		
		//BorderLayout�� North �� component�� container component�� ��ġ
		jpNorth.add(jlblID);
		jpNorth.add(jtfID);
		jpNorth.add(jlblPassword);
		jpNorth.add(jpfPassword);
		
		//BorderLayout�� Center �� component�� container component�� ��ġ
		jpCenter.add(jsp);
		jpCenter.add(ta);
		
		//Window component�� container component�� ��ġ
		add("North",jpNorth);
		add("Center",jpCenter);
		
		//6. window�� ũ�⸦ ����
		setBounds(100, 100, 500, 500);
		
		//7. ����ڿ��� �����ش�.
		setVisible(true);
		
		
		//8. window����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//UseTextComponent
	
	public static void main(String[] args) {
		new UseTextComponent();
	}//main

}//class
