package day1120.homework1120;


import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//1. window component�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class HomeWork1120_2 extends JFrame {

	//2. �����ڸ� �ۼ��Ѵ�.
	public HomeWork1120_2() {

		super("�۲�");
		
		//3.������Ʈ�� �����Ѵ�.
		JLabel jlblfont = new JLabel("�۲�");
		JLabel jlblstyle = new JLabel("��Ÿ��");
		JLabel jlblsize = new JLabel("ũ��");
		
		JTextField jtffont = new JTextField(15);
		JTextField jtfstyle = new JTextField(15);
		JTextField jtfsize = new JTextField(15);
		
		DefaultListModel<String> dlmtext = new DefaultListModel<String>();
		dlmtext.addElement("Dialog");
		dlmtext.addElement("DialogInput");
		dlmtext.addElement("Serif");
		dlmtext.addElement("SansSerif");
		dlmtext.addElement("Monospaced");

		DefaultListModel<String> dlmstyle = new DefaultListModel<String>();
		dlmstyle.addElement("����");
		dlmstyle.addElement("����");
		dlmstyle.addElement("����Ӳ�");
		dlmstyle.addElement("��������Ӳ�");
		
		DefaultListModel<String> dlmsize = new DefaultListModel<String>();
		dlmsize.addElement("8");
		dlmsize.addElement("10");
		dlmsize.addElement(".");
		dlmsize.addElement(".");
		dlmsize.addElement("100");
		
		JList<String> jltext = new JList<String>(dlmtext);
		JList<String> jlstyle = new JList<String>(dlmstyle);
		JList<String> jlsize = new JList<String>(dlmsize);
		
		JScrollPane jsptext = new JScrollPane(jltext);
		JScrollPane jspstyle = new JScrollPane(jlstyle);
		JScrollPane jspsize = new JScrollPane(jlsize);
		
		
		
		JLabel jlblpreview = new JLabel("AaBbYyZz");
		jlblpreview.setBorder(new TitledBorder("�̸�����"));
		
		JButton jbapply = new JButton("����");
		JButton jbclose = new JButton("�ݱ�");
		
		
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
		dcbm.addElement("����");
		dcbm.addElement("�ѱ�");
		
		JComboBox<String> jb = new JComboBox<String>(dcbm);
		
		//4. ��ġ������ ����
		setLayout(null);
		
		//5. ��ġ
		
		
		add(jlblfont);
		jlblfont.setBounds(55, 20, 100, 30);
		add(jtffont);
		jtffont.setBounds(20,60,100,30);
		add(jsptext);
		jsptext.setBounds(20,100,100,150);
		
		add(jlblstyle);
		jlblstyle.setBounds(200, 20, 100, 30);
		add(jtfstyle);
		jtfstyle.setBounds(170, 60, 100, 30);
		add(jspstyle);
		jspstyle.setBounds(170, 100, 100, 150);
		
		add(jlblsize);
		jlblsize.setBounds(353, 20, 100, 30);
		add(jtfsize);
		jtfsize.setBounds(318, 60, 100, 30);
		add(jspsize);
		jspsize.setBounds(318, 100, 100, 150);
		
		add(jlblpreview);
		jlblpreview.setBounds(280, 250, 100, 50);		
		
		add(jb);
		jb.setBounds(280, 310, 100, 30);
		
		add(jbapply);
		jbapply.setBounds(280, 360, 70, 30);
		
		add(jbclose);
		jbclose.setBounds(360, 360, 70, 30);
		
		
		//6.windowũ������
		
		setBounds(50, 50, 500, 450);
		
		//7.����ڿ��� �����ֱ�
		setVisible(true);
		
		//8.window����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//HomeWork1120
	public static void main(String[] args) {

		new HomeWork1120_2();
	}//main

}//class
