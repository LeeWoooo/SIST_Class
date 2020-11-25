package day1125.homework1125;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


//1. window component�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class Design extends JFrame {

	//2. event�� ���� component�� �����Ѵ�.
	private JTextField jtfName;
	private JPasswordField jpwPassword;
	private JLabel jlbl;
	
	
	//3. �����ڸ� �����Ѵ�.
	public Design() {
		super("2020-11-25-����");
		
		//4.������Ʈ�� �����Ѵ�.
		jtfName = new JTextField();
		jpwPassword = new JPasswordField();
		jlbl = new JLabel();
		
		//������Ʈ Border����
		TitledBorder tbName = new TitledBorder("ID");
		TitledBorder tbPassword = new TitledBorder("PASSWORD");
		TitledBorder tbtext = new TitledBorder("���");
		jtfName.setBorder(tbName);
		jpwPassword.setBorder(tbPassword);
		jlbl.setBorder(tbtext);
		
		
		//5.Has - A ���踦 �ΰ� event�� ��Ͻ�Ų��.
		Event ev = new Event(this);
		jtfName.addActionListener(ev);
		jpwPassword.addActionListener(ev);
		
		//6. ��ġ�����ڸ� �������ش�.
		setLayout(new GridLayout(3,1));
		
		//7. ��ġ
		add(jtfName);
		add(jpwPassword);
		add(jlbl);
		
		//8.window�� ũ�⸦ �������ش�.
		setBounds(100, 100, 300, 300);
		
		//9.����ڿ��� �����ش�.
		setVisible(true);
		
		//10.window����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//Design
	
	//11. getter����
	
	public JTextField getJtfName() {
		return jtfName;
	}//getJtfName

	public JPasswordField getJpwPassword() {
		return jpwPassword;
	}//getJpwPassword

	public JLabel getJlbl() {
		return jlbl;
	}//getJlbl

	public static void main(String[] args) {
		Design ds = new Design();
		System.out.println(ds.jtfName.getText());
	}//main

}//class
