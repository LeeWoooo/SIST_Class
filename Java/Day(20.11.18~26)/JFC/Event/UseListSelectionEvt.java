package day1126.usemouseevent;


import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

//1. window component�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseListSelectionEvt extends JFrame implements ListSelectionListener {

	private DefaultListModel<String> dlmFriedns;
	private DefaultListModel<String> dlmblockFriedns;
	private JList<String> jlfriend;
	private JList<String> jlblockfriend;
	
	//2.�����ڸ� �ۼ��Ѵ�.
	public UseListSelectionEvt() {
		super("JList ����");
		
		//3. component�� �����Ѵ�.
		
		dlmFriedns = new DefaultListModel<String>();
		dlmblockFriedns = new DefaultListModel<String>();
		
		//������
		dlmFriedns.addElement("���̾�");
		dlmFriedns.addElement("����");
		dlmFriedns.addElement("����ġ");
		dlmFriedns.addElement("������");
		dlmFriedns.addElement("��");

		dlmblockFriedns.addElement("����");
		dlmblockFriedns.addElement("�ڴ�");
		
		//data�� ������ View ����
		jlfriend = new JList<String>(dlmFriedns);
		jlblockfriend = new JList<String>(dlmblockFriedns);
		
		//�̺�Ʈ ���
		jlfriend.addListSelectionListener(this);
		jlblockfriend.addListSelectionListener(this);
		
		
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
	
	private boolean flag;
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		if(flag) {
		System.out.println( dlmFriedns.get( jlfriend.getSelectedIndex() ) );
		}//end if
		flag = !flag;
	}//valueChanged




	public static void main(String[] args) {

		new UseListSelectionEvt();
	}//main

}//class
