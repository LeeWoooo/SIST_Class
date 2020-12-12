package day1125.event_isa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Action event�� ó���� ���̴ϴ�. (ActionListener�� ó���Ұ��̴�.)
 * @author owner
 */

//1. window component�� ��ӹ޴´�. �̺�Ʈ ó���� Listener�� �����Ѵ�.
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener{
	
	//2. �̺�Ʈ�� �߻����� �� ó���� component�� ����.
	
	private JButton jbtn;
	
	//2. Default Constructor �����ϰ� component�� �����Ѵ�.
	public UseActionEvent() {
		super("ActionEvent ó��");
		
		//3. Component����
		jbtn = new JButton("SWING�� ��ư");
		
		
		//4. Component�� Event�� ����Ѵ�.
		//is - a ����� event�� ó���ϴ� �����̹Ƿ� �� ��ü�ȿ��� �̺�Ʈ ó���ϰ��� �� �� this�� ���
		jbtn.addActionListener(this);
		
		//5. ��ġ (Component�� ����)
		//��ġ ������ : Layout Manager�� ����Ͽ� Component�� ��ġ�Ѵ�.
		add("Center",jbtn);
		
		//6. Window�� ũ��
		setSize(400, 200);
		
		//7.������ Component�� ����ڿ��� �����ֱ�
		setVisible(true);
	
		//8. Window�� ��������
		//������� ������ window�� �ݾƵ� Instance�� �۵��ϰ� �ִ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//UseSing 
	

	//9. �߻� method Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		JOptionPane.showMessageDialog(this,"��ư�� Ŭ���� �Ǿ����ϴ�.");
	}//actionPerformed



	public static void main(String[] args) {
		
		new UseActionEvent();
		
	}//main

}//class
