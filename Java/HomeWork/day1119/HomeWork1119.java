package day1119.homework1119;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1. ������ ������Ʈ�� ��� �޽��ϴ�.
@SuppressWarnings("serial")
public class HomeWork1119 extends JFrame {

	//2.�����ڸ� �ۼ��մϴ�.
	public HomeWork1119() {
		super("HomeWork");
		
		//3. ������Ʈ�� �����մϴ�.
		JLabel jlblName = new JLabel("�̸�");
		JLabel jlblage = new JLabel("����");
		JLabel jlblgender = new JLabel("����");
		JLabel jlbladdress = new JLabel("�ּ�");
		
		
		JTextField jtfName = new JTextField(10);
		JTextField jtfage = new JTextField(10);
		JTextField jtfaddress = new JTextField(10);
		
		JRadioButton jrbman = new JRadioButton("��");
		JRadioButton jrbwoman = new JRadioButton("��");
		
		JButton jbinput = new JButton("�Է�");
		JButton jbchange = new JButton("����");
		JButton jbdelete = new JButton("����");
		JButton jbsearch = new JButton("�˻�");
		JButton jbclose = new JButton("�ݱ�");

		JTextArea jt = new JTextArea();
		JScrollPane jsp = new JScrollPane(jt);
		jt.setLineWrap(true);
		jt.setWrapStyleWord(true);
		
		//4.��ġ������ ����
		setLayout(null);

		//5. ��ġ
		
		//�̸�
		JPanel jpname = new JPanel();
		jpname.add(jlblName);
		jpname.add(jtfName);
		
		//����
		JPanel jpage = new JPanel();
		jpage.add(jlblage);
		jpage.add(jtfage);
		
		
		//RadioCheckBox ����
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbman);
		bg.add(jrbwoman);
		
		//�ּ�
		JPanel jpaddress = new JPanel();
		jpaddress.add(jlbladdress);
		jpaddress.add(jtfaddress);
		
		//��ư ����
		JPanel jpbu = new JPanel();
		jpbu.add(jbinput);
		jpbu.add(jbchange);
		jpbu.add(jbdelete);
		jpbu.add(jbsearch);
		jpbu.add(jbclose);
		
		
		//window component�� ��ġ�ϱ�
		add(jpname);
		add(jpage);
		add(jlblgender);
		add(jpaddress);
		add(jpbu);
		add(jsp);
		add(jrbman);
		add(jrbwoman);
		
		
		//windowũ��,��ġ �� component ũ��,��ġ ����
		//1. ��ġ �� ũ��
		
		setBounds(100, 100, 500, 400);
		setResizable(false);
		
		
		jpname.setBounds(10,50,200,50);
		jpage.setBounds(10,100,200,50);
		jlblgender.setBounds(37,150,200,50);
		jrbman.setBounds(70,150,50,50);
		jrbwoman.setBounds(130,150,50,50);
		jpaddress.setBounds(10,200,200,50);
		
		jpbu.setBounds(0, 250, 500, 50);
		
		jsp.setBounds(220, 50, 190, 180);
		
		
		//7. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//8. window�ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//HomeWork1119
	
	
	
	public static void main(String[] args) {

		new HomeWork1119();
	}//main

}//class
