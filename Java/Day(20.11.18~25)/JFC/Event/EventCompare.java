package day1125.event_isa;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1. Window ������Ʈ�� ��ӹ޴´�.
/**
 * �̺�Ʈ ��
 * ���̵� TF���� ���Ͱ� �������� JTextArea�� ����.
 * ��й�ȣ JPF���� ���Ͱ� �������� TextArea�� ����.
 * @author owner
 */
@SuppressWarnings("serial")
public class EventCompare extends JFrame implements ActionListener {

	
	//2.�̺�Ʈ ó���� ���õ� component�� ����
	private JTextField jtfID;
	private JPasswordField jpfPassword;
	private JTextArea jtaTemp;
	private TextArea taTemp;

	//2.�����ڸ� �ۼ��Ѵ�.
	public EventCompare() {
		super("�ؽ�Ʈ������Ʈ�� ���");

		//3.������Ʈ�� �����մϴ�.
		JLabel jlblID = new JLabel("ID");
		jtfID = new JTextField(10);
		JLabel jlblPassword = new JLabel("Password");
		jpfPassword = new JPasswordField(10);
		
		
//		jpfPassword.setEchoChar('*');
		
		jtaTemp = new JTextArea();//scrollbar�� ����.
		taTemp = new TextArea();//scrollbar ����
		
		JScrollPane jspTemp = new JScrollPane(jtaTemp);
		
		//�Էµ� ���ڿ��� TextArea�� �� ������ �Ѿ�� ���� �����Ѵ�.
		jtaTemp.setLineWrap(true);
		
		//�ܾ� ��ȣ :�ѱ��� ���� �ʴ´�.
		jtaTemp.setWrapStyleWord(true);
		
		//4.������Ʈ���� �߻��� �̺�Ʈ�� JVM���� ������ �� �ֵ��� �̺�Ʈ�� ���
		jtfID.addActionListener(this);
		jpfPassword.addActionListener(this);
		
		
		//5.��ġ�����ڸ� ����
		setLayout(new BorderLayout()); //JFrame�� ��ġ �����ڴ� BorderLayot
		
		//North�� panel�� �̿��� �������� component�� ���´�.
		JPanel jpNorth = new JPanel();
		
		//Center�� pannel�� �̿��� �������� component�� ���´�.
		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(1,2)); //FlowLayout => GridLayout���� ����
		
		//6.component�� ��ġ
		
		//BorderLayout�� North �� component�� container component�� ��ġ
		jpNorth.add(jlblID);
		jpNorth.add(jtfID);
		jpNorth.add(jlblPassword);
		jpNorth.add(jpfPassword);
		
		//BorderLayout�� Center �� component�� container component�� ��ġ
		jpCenter.add(jspTemp);
		jpCenter.add(taTemp);
		
		//Window component�� container component�� ��ġ
		add("North",jpNorth);
		add("Center",jpCenter);
		
		//7. window�� ũ�⸦ ����
		setBounds(100, 100, 500, 500);
		
		//8. ����ڿ��� �����ش�.
		setVisible(true);
		
		
		//9. window����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseTextComponent
	
	//10.�̺�Ʈ�� �߻����� �� ������ �ڵ带 �����ϴ� method�� Override
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(jtfID == ae.getSource()) {
			
			//TextField�� ���� �����ͼ�
			String id = jtfID.getText();
			//TextArea�� �߰�
			jtaTemp.append(id + "\n");
			//�ؽ�Ʈ �ʵ� ���� �ʱ�ȭ
			jtfID.setText("");
		}
		
		if(jpfPassword == ae.getSource()) {
			//JpasswordField�� ���� �����ͼ� 
		String pass = String.valueOf(jpfPassword.getPassword());
			//TextArea�� �߰�
			taTemp.append(pass + "\n");
			//���� �ʱ�ȭ
			jpfPassword.setText("");
		}
	
	}
	public static void main(String[] args) {
		new EventCompare();
		
	}//main
}//class
