package day1231;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class IdForm extends JFrame {

	private JTextField jtfId;
	private JPasswordField jpfPass;
	private JLabel jlOutput;
	private boolean loginflag;

	public IdForm() {
		super("�α���");
		jtfId = new JTextField();
		jpfPass = new JPasswordField();
		jlOutput = new JLabel("���â");

		jtfId.setBorder(new TitledBorder("���̵�"));
		jpfPass.setBorder(new TitledBorder("��й�ȣ"));
		jlOutput.setBorder(new TitledBorder("���â"));

		setLayout(new GridLayout(3, 1));

		add(jtfId);
		add(jpfPass);
		add(jlOutput);

		// Inner class�� �̺�Ʈ ó��
		IdForm.EvtInner ei = this.new EvtInner();
		jtfId.addActionListener(ei);
		jpfPass.addActionListener(ei);

		setLocationRelativeTo(null);
		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// IdForm

	public void idNullCheck() {
		if ("".equals(jtfId.getText().trim())) {
			JOptionPane.showMessageDialog(this, "���̵� �ʼ��Է��Դϴ�.");
			return;
		} // end id
		jpfPass.requestFocus();
	}// end idNullCheck

	public void pwdNullCheck() {
		String pwd = new String(jpfPass.getPassword());
		if ("".equals(pwd.trim())) {
			JOptionPane.showMessageDialog(this, "��й�ȣ �ʼ��Է��Դϴ�.");
			return;
		} // end if
		loginflag = true;
	}// pwdNullCheck

	public void login() {
		LoginDAO lDAO = LoginDAO.getInstance();
		String id = jtfId.getText().trim();
		String pwd = new String(jpfPass.getPassword());
		try {
			String name = lDAO.login(id, pwd);
			if ("".equals(name.trim())) {
				jlOutput.setText("�α��ο� �����߽��ϴ�. ID�� Password�� Ȯ�����ּ���");
				jtfId.setText("");
				jpfPass.setText("");
				jtfId.requestFocus();
			} else {
				jlOutput.setText(name + "�� ȯ���մϴ�.");
			} // end else
		} catch (SQLException e) {
			e.printStackTrace();
		} // end catch
	}// end login

	// Event Inner Class
	public class EvtInner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == jtfId) {
				idNullCheck();
			} // end if

			if (ae.getSource() == jpfPass) {
				pwdNullCheck();
				if(loginflag) {
				login();
				}//end if
				loginflag = false;
			} // end if
		}// actionPerformed

	}// EvtInner

	public static void main(String[] args) {
		new IdForm();
	}// main

}// class
