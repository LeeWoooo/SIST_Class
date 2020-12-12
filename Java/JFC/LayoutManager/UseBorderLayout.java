package day1118.boarderlayout;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * BorderLayout: ��� Layout. 
 * Component�� ���� ũ�Ⱑ ���õǰ� ��ġ�Ǵ� ��ġ�� ũ�⿡ �°� ����ȴ�.
 * �ϳ��� ������ �ϳ��� Component�� ��ġ ����.
 * Window Component�� �⺻ Layout�̴�.
 * @author owner
 */
@SuppressWarnings("serial")
//1. ������ ������Ʈ�� ���
public class UseBorderLayout extends JFrame{

	//2.������ �ۼ�
	public UseBorderLayout() {
		super("borderlayout�� ����"); // �θ� class�� �����ڸ� ȣ���� title ����
	
	//3. Component ����
	JButton jbtnNorth = new JButton("North");
	JButton jbtnEast = new JButton("East");
	JTextField jtfSouth = new JTextField("South"); //web�� id �Է�â
	JLabel jlblWest = new JLabel("West"); //�̸�ǥ
	JTextArea jtaCenter = new JTextArea("Center"); //���ϳ��� �Է�â
	
	//4. ��ġ������ ����
	setLayout(new BorderLayout());
	
	//5. ������Ʈ�� ��ġ
	// ���ڿ� ����� component�� ��ġ�Ǵ� ��ġ�� ������ �� �ִ�. (ù ���ڴ� �빮�ڷ� �ۼ��մϴ�.)
	add("Center",jtaCenter);
	add("North",jbtnNorth);
	// BorderLayout�� ��� (constant)�� component�� ��ġ�Ǵ� ��ġ�� ������ �� �ִ�.
	add(BorderLayout.WEST,jlblWest);
	add(BorderLayout.SOUTH,jtfSouth);
	add(jbtnEast,BorderLayout.EAST);
	//6. �������� ũ�� ����
	setSize(500, 500);
	//7. ����ڿ��� �����ֱ�
	setVisible(true);
	//8. Window����
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//UseBorderLayout
	public static void main(String[] args) {
		new UseBorderLayout();
	}//main

}//class
