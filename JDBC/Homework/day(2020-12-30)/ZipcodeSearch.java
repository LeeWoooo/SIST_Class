package day1230;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")

//1. JFrame�� ��ӹ޴´� ( Window Component�� ��ӹ��� �Ͱ� ����)
public class ZipcodeSearch extends JFrame {

	private JButton jbtnInput;
	private JTextArea jtaZipcodeDisplay;
	private JScrollPane jspZipcodeScroll;
	private JTextField jtfDong;

	// 2. �����ڸ� �����Ѵ�.
	public ZipcodeSearch() {
		super("�����ȣ �˻�");

		// 3.�Ϲ� Component�� �����մϴ�.
		JLabel jlblZipcode = new JLabel("�����ȣ");
		jtfDong = new JTextField(20);
		jbtnInput = new JButton("��ȸ");
		jtaZipcodeDisplay = new JTextArea();
		jspZipcodeScroll = new JScrollPane(jtaZipcodeDisplay);

		// 4.��ġ������ ���� (���� �⺻ ���̾ƿ� �޴����� Border Layout�̴�)
		setLayout(new BorderLayout());

		// 5.������Ʈ ��ġ
		// BorderLayout�� �ϳ��� ������ �ϳ��� ������Ʈ�� ��ġ�� �� �ִ�.
		// North�������� �������� component�� ��ġ�ϰ��� �ϱ⿡ Container Component�� Jpanel�� �ʿ��ϴ�.
		JPanel jpNouth = new JPanel(); // flow layout
		// Container Component�� Layout�� ��������
		jpNouth.setLayout(new FlowLayout());
		jpNouth.add(jlblZipcode);
		jpNouth.add(jtfDong);
		jpNouth.add(jbtnInput);

		// inner class�� �̺�Ʈ ���
		InnerEvt ie = this.new InnerEvt();
		jbtnInput.addActionListener(ie);
		jtfDong.addActionListener(ie);

		add("North", jpNouth);
		add("Center", jspZipcodeScroll);

		// 6.window ũ�� ����
		setLocation(500, 500);
		setSize(400, 300);

		// 7.����ڿ��� �����ֱ�
		setVisible(true);

		// 8.window ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseLayoutManager

	// ineer class�� eventó��
	public class InnerEvt implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			String dong = jtfDong.getText().trim();
			if (!"".equals(dong)) {
				setZipcode(dong);
				jtfDong.setText("");
			} // end if

		}// actionPerformed

		public void setZipcode(String dong) {

			ZipcodeDAO zDAO = ZipcodeDAO.getInstance();
			//sql injection ��� �ڵ�: ' , --�� Ư�����ڸ� �����Ѵ�.. ������ �����Ѵ�., query�� ���õ� ������ �����Ѵ�.
			if(dong.contains("'") || dong.contains("-") || dong.contains(" ")) {
				dong=dong.replaceAll("'", "").replaceAll("-", "").replaceAll(" ", "");
			}
			try {
				List<ZipcodeVO> listZipcode = zDAO.selectZipcode(dong);//PreParedStatement
//				List<ZipcodeVO> listZipcode = zDAO.selectStatementZipcode(dong);//Statement : SQLINJECTION�� �߻��� �� �ִ�.

				StringBuilder sbOutput = new StringBuilder();
				sbOutput.append("[ ").append(dong).append(" ]���� �˻��� ����Դϴ�.\n");
				sbOutput.append("�����ȣ\t�ּ�\n");
				sbOutput.append("==============================================================\n");

				if (listZipcode.isEmpty()) {
					sbOutput.append("�Է��Ͻ� ���� �������� �ʽ��ϴ�.\n ���̸��� Ȯ�����ּ���.");
				} else {
					for (ZipcodeVO zVO : listZipcode) {
						sbOutput
						.append(zVO.getZipcode()).append("\t").append(zVO.getSido()).append(" ")
						.append(zVO.getGugun()).append(" ")
						.append(zVO.getDong()).append(" ")
						.append(zVO.getBunji()).append("\n");
					} // end for
				} // end else

				jtaZipcodeDisplay.setText(sbOutput.toString());

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}// setZipcode

	}// InnerEvt

	public static void main(String[] args) {

		new ZipcodeSearch();

	}// main

}// class
