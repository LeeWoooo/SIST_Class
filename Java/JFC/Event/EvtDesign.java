package day1125.event_hasa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Action event�� ó���� ���̴ϴ�. (ActionListener�� ó���Ұ��̴�.)
 * @author owner
 */

//1. window component�� ��ӹ޴´�. �̺�Ʈ ó���� Listener�� �����Ѵ�.
@SuppressWarnings("serial")
public class EvtDesign extends JFrame{
	
	//2. �̺�Ʈ�� �߻����� �� ó���� component�� ����.
	
	private JButton jbtn;
	private JLabel jlbl;
	private JTextField jtf;
	
	//2. Default Constructor �����ϰ� component�� �����Ѵ�.
	public EvtDesign() {
		super("ActionEvent ó��");
		
		//3. Component����
		jbtn = new JButton("SWING�� ��ư");
		jlbl = new JLabel("���JLabel");
		jtf = new JTextField(20);
		
		//4. Component�� Event�� ����Ѵ�./ has-a����� �����ϰ� �̺�Ʈ�� ����Ѵ�.
		HasAEvt hasA = new HasAEvt(this);
		jbtn.addActionListener(hasA);
		jtf.addActionListener(hasA);
		
		//5. ��ġ (Component�� ����)
		//��ġ ������ : Layout Manager�� ����Ͽ� Component�� ��ġ�Ѵ�.
		add("Center",jbtn);
		add("North",jlbl);
		add("South",jtf);
		
		//6. Window�� ũ��
		setSize(400, 200);
		
		//7.������ Component�� ����ڿ��� �����ֱ�
		setVisible(true);
	
		//8. Window�� ��������
		//������� ������ window�� �ݾƵ� Instance�� �۵��ϰ� �ִ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}//UseSing 

	
	//8. �̺�Ʈ ó�� Ŭ�������� ������Ʈ�� ����� �� �ֵ��� getter method�� �����.
	
	public JButton getJbtn() {
		return jbtn;
	}//getJbtn
	
	public JLabel getJlbl() {
		return jlbl;
	}//getJlbl
	
	public JTextField getJtf() {
		return jtf;
	}//getJtf


	public static void main(String[] args) {
		
		new EvtDesign();
		
	}//main



}//class
