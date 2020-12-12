package day1126.usedialog;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseChild extends JDialog {

	private JButton jbtn;
	private JLabel jlbl;
	
	public UseChild(UseParent up) {
		super(up , "JDialog �ΰ����α��", true);
		
		jbtn = new JButton("��ư");
		jlbl = new JLabel("JDialog�� �θ�â���� �ʿ��� �ΰ����� ����� �����Ѵ�.");
		jlbl.setBorder(new TitledBorder("�޼���"));
		
		//�̺�Ʈ ó�� ��ü�� �����ϰ� has a ���踦 ����
		ChildEvt ce = new ChildEvt(this);
		jbtn.addActionListener(ce);
		addWindowListener(ce);
		
		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtn);
		
		add("Center", jlbl);
		add("South", jpSouth);
		
		//Dialog�� �������� �θ�â �ȿ��� ����Ǿ�� �Ѵ�.
		//���� getX(),getY()�� �θ��� ��ǥ�� �� ����Ѵ�.
		setBounds(up.getX() + 300 ,up.getY() + 300, 500, 300);
		
		setVisible(true);
		
	}//UseChild

	public JButton getJbtn() {
		return jbtn;
	}//getJbtn

	public JLabel getJlbl() {
		return jlbl;
	}//getJlbl
	
}//class
