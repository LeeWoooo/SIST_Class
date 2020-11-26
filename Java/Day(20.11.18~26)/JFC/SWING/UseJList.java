package day1120.jlist;


import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

//1. window component�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseJList extends JFrame {

	//2.�����ڸ� �ۼ��Ѵ�.
	public UseJList() {
		super("JList ����");
		
		//3. component�� �����Ѵ�.
		
		DefaultListModel<String> dlmFriedns = new DefaultListModel<String>();
		DefaultListModel<String> dlmblockFriedns = new DefaultListModel<String>();
		//������
		dlmFriedns.addElement("���̾�");
		dlmFriedns.addElement("����");
		dlmFriedns.addElement("����ġ");
		dlmFriedns.addElement("������");
		dlmFriedns.addElement("��");

		dlmblockFriedns.addElement("����");
		dlmblockFriedns.addElement("�ڴ�");
		
		//data�� ������ View ����
		JList<String> jlfriend = new JList<String>(dlmFriedns);
		JList<String> jlblockfriend = new JList<String>(dlmblockFriedns);
		
		//Scroll bar ��� �߰�
		JScrollPane jpfriend = new JScrollPane(jlfriend);
		JScrollPane jpblockfriend = new JScrollPane(jlblockfriend);
		
		//TitleBorder �����ϱ�
		TitledBorder tbfriend = new TitledBorder("ģ��");
		jpfriend.setBorder(tbfriend);
		TitledBorder tbblockfriend = new TitledBorder("����ģ��");
		jpblockfriend.setBorder(tbblockfriend);
		
		
		
		//4. ��ġ������ ����
		setLayout(new GridLayout());
		
		//5. ��ġ
		
		add(jpfriend);
		add(jpblockfriend);
		
		//6.Window ũ�⼳��
		setBounds(100,	100, 400, 300);
		
		//7.����ڿ��� �����ֱ�
		setVisible(true);
		
		//8.window ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		
	}//UseJList
	public static void main(String[] args) {

		new UseJList();
	}//main

}//class
