package day1120.homework1120;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//1. window component�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class HomeWork1120 extends JFrame {

	//2. �����ڸ� �ۼ��Ѵ�.
	public HomeWork1120() {

		super("JAVA-�޸���");
		
		//3.������Ʈ�� �����Ѵ�.
		JMenuBar jmb = new JMenuBar();
		
		JMenu jmFile = new JMenu("File");
		JMenu jmText = new JMenu("����");
		JMenu jmhelp = new JMenu("����");
		
		//filemenu
		JMenuItem jminew = new JMenuItem("�� ��");
		JMenuItem jmiopen = new JMenuItem("����");
		JMenuItem jmisave = new JMenuItem("����");
		JMenuItem jmisaveas = new JMenuItem("���̸�����");
		JMenuItem jmiclase = new JMenuItem("�ݱ�");

		//textmenu
		JMenuItem jmifont = new JMenuItem("�۲�");
		JMenuItem jmilinebreak = new JMenuItem("�ڵ��ٹٲ�");
		
		//helpmenu
		JMenuItem jmiinfo = new JMenuItem("�޸�������");
		
		//�޸��� ���������
		JTextArea jta = new JTextArea();
		
		jta.setLineWrap(true); //���� ���� �Ѿ�� �ٹٲ�
		jta.setWrapStyleWord(true); //���� �ٲ� �� �ܾ ��ȣ�� �ǰ��ϴ� method
		
		JScrollPane jtp = new JScrollPane(jta);
		
		//4.��ġ������ ����
		setLayout(new BorderLayout());
		
		//5.��ġ
		
		//filemenu
		jmFile.add(jminew);
		jmFile.addSeparator();
		jmFile.add(jmiopen);
		jmFile.add(jmisave);
		jmFile.add(jmisaveas);
		jmFile.addSeparator();
		jmFile.add(jmiclase);
		
		//textmenu
		jmText.add(jmifont);
		jmText.addSeparator();
		jmText.add(jmilinebreak);
		
		//helpmemu
		jmhelp.add(jmiinfo);
		
		//menubar�� menu��ġ
		jmb.add(jmFile);
		jmb.add(jmText);
		jmb.add(jmhelp);
		
		//window�� ��ġ

		setJMenuBar(jmb);
		add(jtp);
		
		//6.windowũ������
		
		setBounds(50, 50, 500, 250);
		
		//7.����ڿ��� �����ֱ�
		setVisible(true);
		
		//8.window����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//HomeWork1120
	public static void main(String[] args) {

		new HomeWork1120();
	}//main

}//class
