package day1126.usedialog;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * �� ����� ������ �ִ� Main â(�θ� â)
 * @author owner
 */
@SuppressWarnings("serial")
public class UseParent extends JFrame {

	private JButton jbtn;
	
	public UseParent() {
		super("�θ�â");
		
		jbtn = new JButton("�ΰ����� ���");
		
		//�̺�Ʈ instance�� �����ϰ� ���踦 ����
		ParentEvt pe = new ParentEvt(this);
		
		//�̺�Ʈ�� ����ϱ�
		jbtn.addActionListener(pe);
		addWindowListener(pe);
		
		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtn);
		
		add("South",jpSouth);
		
		setBounds(100, 100, 1000, 700);
		
		setVisible(true);
		
		
	}//UesParent
	
	
	public JButton getJbtn() {
		return jbtn;
	}//getJbtn


	public static void main(String[] args) {
		new UseParent();
	}//main
}//class
