package day1120.memu;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//1. ������ ������Ʈ�� ��� �޴´�.
@SuppressWarnings("serial")
public class UseMenu extends JFrame {

	//2.�����ڸ� �����Ѵ�.
	public UseMenu() {
		super("menu����");
		
		
		//3.������Ʈ�� �����մϴ�.
		
		//3-1 MenuBar ����
		JMenuBar jb = new JMenuBar();
		
		//3-2 Menu ����
		JMenu jmfile = new JMenu("����");
		
		JMenu jmfix = new JMenu("����");
		
		JMenu jmsave = new JMenu("����");
		
		
		//3-3 MenuItem����
		
		JMenuItem jmiopen = new JMenuItem("����");
		JMenuItem jmisave = new JMenuItem("����");
		JMenuItem jmisaveas = new JMenuItem("�ٸ��̸����� ����");
		JMenuItem jmiclose = new JMenuItem("�ݱ�");
		
		//4.��ġ�����ڸ� ����
		setLayout(new BorderLayout());
		
		//5. ��ġ
		
		//5-1 ���� Menu ��ġ
		jmsave.add(jmisave);
		jmsave.add(jmisaveas);
		
		//5-2 MenuItem�� Menu�� �ֱ�
		jmfile.add(jmiopen);
		jmfile.add(jmsave);
		
		//Menu�� ���м� �ֱ�
		jmfile.addSeparator();
		
		jmfile.add(jmiclose);
		
		//MenuBar�� Menu �ֱ�
		jb.add(jmfile);
		jb.add(jmfix);
		
		//������ ������Ʈ�� �޴��� �����ϱ�
		setJMenuBar(jb);
		
		//6. ������ ũ�⼳��
		setBounds(50, 50, 200, 200);
		setResizable(false);
		
		//7. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//8. ������ �����ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseMenu
	
	public static void main(String[] args) {
		new UseMenu();
	}//main

}//class
