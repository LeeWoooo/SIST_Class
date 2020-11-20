package day1120.combobox;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//1. window component�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseComboBox extends JFrame {

	//2.�����ڸ� �ۼ��Ѵ�.
	public UseComboBox() {
		super("ComboBox ����");
		
		
		//3, component�� �����Ѵ�.

		JLabel jlblemail = new JLabel("�̸���");
		JTextField jtfemail = new JTextField(15);
		JLabel jlblemailat = new JLabel("@");
		
		//Model instance ����
		String[] item = new String[] {"gmail.com","daum.net","naver.com","nate.com"};
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>(item);
		
		//Model�� �����͸� �߰�
		dcbm.addElement("hotmail.com");
		dcbm.addElement("yahoo.co.kr");
		
		//View Instnace�� �����ϰ�, Model��ü�� ���� ����
		JComboBox<String> jcb = new JComboBox<String>(dcbm);
		
		//4. ��ġ������ ����
		setLayout(new FlowLayout());
		
		//5. ��ġ
		
		add(jlblemail);
		add(jtfemail);
		add(jlblemailat);
		add(jcb);
		
		//6.������ ũ�� ��ġ
		setBounds(200, 100, 400, 100);
		
		//7.����ڿ��� �����ֱ�
		setVisible(true);
		
		//8.Window�����ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseComboBox
	
	public static void main(String[] args) {

		new UseComboBox();
		
	}//main

}//class
