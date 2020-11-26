package day1126.usemouseevent;


import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

//1. window component�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseMouseEvent extends JFrame  {

	private DefaultListModel<String> dlmFriedns;
	private DefaultListModel<String> dlmblockFriedns;
	private JList<String> jlfriend;
	private JList<String> jlblockfriend;
	
	//2.�����ڸ� �ۼ��Ѵ�.
	public UseMouseEvent() {
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
		jlfriend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				switch(me.getButton()) {
				case MouseEvent.BUTTON1 :
					System.out.println(dlmFriedns.get(jlfriend.getSelectedIndex()));
				}//switch
			}//mouseClicked
		
		});
//		jlblockfriend.addListSelectionListener(this);
		
		
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

		new UseMouseEvent();
	}//main

}//class
