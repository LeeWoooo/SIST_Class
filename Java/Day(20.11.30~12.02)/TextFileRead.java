package day1201.textfileread;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 * ��ư�� Ŭ���ϸ� FileDialog�� �����ϰ� FileDialog���� ������ �����ϸ� ������ ������ ������ JtextArea�� ���
 * �޸����� �б���.
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class TextFileRead extends JFrame implements ActionListener {

	private JButton jbtnFileOpen;
	private JTextArea jtaNote;

	public TextFileRead() {

		super("�޸��� ���� ���");

		jbtnFileOpen = new JButton("���ϼ���");
		jtaNote = new JTextArea();

		JScrollPane jspNote = new JScrollPane(jtaNote);
		jspNote.setBorder(new TitledBorder("���������� ����"));

		JPanel jpNorth = new JPanel();
		jpNorth.add(jbtnFileOpen);

		// �̺�Ʈ�� ���
		jbtnFileOpen.addActionListener(this);

		add("North", jpNorth);
		add("Center", jspNote);

		setBounds(100, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// TextFileRead

	private void fileOpen() {

		FileDialog fdOpen = new FileDialog(this, "����", FileDialog.LOAD);
		fdOpen.setVisible(true);

		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();

		if (path != null) {// ������ �����ϰ� ���⸦ �������
			// ������ Ȯ���ڰ� java�϶��� ������ ��� ��������
			if (name.endsWith("java")) {
				// ������ ������ ��ο� ���ϸ����� ���� Ŭ������ �����Ѵ�.
				File file = new File(path + name);
				System.out.println(file);
				if (file.exists()) {// ������ �����ϴ��� ���������� ���� �۾��ϴ� ���� ������ �����ǰų� �̵��� �� �ֱ� ����
					// ��Ʈ���� ����Ͽ� ������ ���Ͽ� �����ϰ�,
					// ������ ������ �о�鿩
					// JtextArea�� ���
					// ��Ʈ���� ��������� ��Ʈ���� �����ؾ��Ѵ�.
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
						jtaNote.setText("");
						String temp = "";
						while ((temp = br.readLine()) != null) {
							// JtextArea�� ���
							jtaNote.append(temp + "\n"); // append�� �ٹٲ��� ����� ����.
						}
					} catch (IOException ie) {
						JOptionPane.showMessageDialog(this, "�˼��մϴ�. �۾��� ������ ��� �˼��մϴ�.,");
						ie.printStackTrace();
					} // end catch

				} // end if

			} // end if

		} // end if

	}// fileOpen

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jbtnFileOpen) {
			fileOpen();
		} // end if

	}// actionPerformed

	public static void main(String[] args) {
		new TextFileRead();
	}// main

}// class
