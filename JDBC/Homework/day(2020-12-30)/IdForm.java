package day1230;

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

	private IdForm idfrm;

	public IdForm() {
		super("�α���");
		idfrm = this;
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

		setBounds(100, 100, 300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// IdForm

	public void idNull() {
		if ("".equals(jtfId.getText().trim())) {
			JOptionPane.showMessageDialog(idfrm, "���̵��ʼ��Է�");
			jtfId.requestFocus();
			return;
		} // end if
		jpfPass.requestFocus();

	}// idNull

	public void pwdNull() {
		if ("".equals(new String(jpfPass.getPassword()).trim())) {
			JOptionPane.showMessageDialog(idfrm, "��й�ȣ�ʼ��Է�");
			jpfPass.requestFocus();
			return;
		} // end if
	}// pwdNull

	public void login() {
		String id = jtfId.getText().trim();
		String pass = new String(jpfPass.getPassword()).trim();

//		LoginStatementDAO lDAO = LoginStatementDAO.getInstance();
		LoginPreParedStatementDAO lpDAO = LoginPreParedStatementDAO.getInstance();
		try {
			String name = lpDAO.login(id, pass);
			
			if("".equals(name)) {
				JOptionPane.showMessageDialog(idfrm, "���̵� ��й�ȣ�� Ȯ�����ּ���.");
			}else {
				jlOutput.setText(name+"�� �α��� �ϼ̽��ϴ�.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} // end catch
	}// login

	// Event Inner Class
	public class EvtInner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == jtfId) {
				idNull();
			} // end if

			if (ae.getSource() == jpfPass) {
				pwdNull();
				login();
			}
		}// actionPerformed

	}// EvtInner

	public static void main(String[] args) {
		new IdForm();
	}// main

}// class
