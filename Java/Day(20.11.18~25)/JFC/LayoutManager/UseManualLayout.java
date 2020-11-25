package day1119.manuallayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//1. ������ ������Ʈ ���
@SuppressWarnings("serial")
public class UseManualLayout extends JFrame {

	//2. ������ �ۼ�
	public UseManualLayout() {
		super("������ġ�� ���");
		
		//3.������Ʈ�� ����
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(); //�÷��� ũ�⸦ �����ϴ��� setsize�� ũ�⸦ �����ϸ� setsize�� �켱
		JButton jbtnInput = new JButton("�Է�");
		
		//4.��ġ�����ڸ� �����մϴ�.
		setLayout(null); // ������ ������ ��ġ�������� BorderLayout�� �����ȴ�.
		
		//5.������Ʈ�� ��ġ�մϴ�. 
		
		//5-1 component���� ũ�� �� ��ġ�� �� ��������� ��ġ�ȴ�.
		jlblName.setBounds(10, 30, 80, 25);
		jtfName.setBounds(80, 100, 120, 30);
		jbtnInput.setBounds(200, 170, 120, 120);
		
		//5-2 ��ġ
		add(jlblName);
		add(jtfName);
		add(jbtnInput);
		
		//6. �������� ũ�⼳�� �� �������� ũ�� ����
		setBounds(100, 100, 335, 330);
		
		//������ ũ������ ���� 
		//������ġ�� �ϸ� component�� ��ǥ���� �����Ǿ� �ֱ⿡ ������ â�� ũ�⸦ �������ѳ��� ����ؾ��Ѵ�.
		setResizable(false);
		
		//7. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//8. ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseManualLayout
	public static void main(String[] args) {

			new UseManualLayout();
	}//main

}//class
