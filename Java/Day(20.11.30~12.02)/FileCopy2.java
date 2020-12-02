package day1202.filecopy;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class FileCopy2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 4644216139357456699L;

	public static final int EOF = -1;

	private JButton jbtnFileOpen;
	private JTextArea jtaNote;

	public FileCopy2() {

		super("File Copy");

		jbtnFileOpen = new JButton("���ϼ���");
		jtaNote = new JTextArea();

		JScrollPane jspNote = new JScrollPane(jtaNote);
		jspNote.setBorder(new TitledBorder("����� File List"));

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

	private void filecopy() throws IOException {

		FileDialog fdOpen = new FileDialog(this, "����", FileDialog.LOAD);
		fdOpen.setVisible(true);

		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();

		if (path != null) {// ������ �����ϰ� ���⸦ �������
			File orgfile = new File(path + name);
			if (orgfile.exists()) {
				StringBuffer sbcopyname = new StringBuffer(orgfile.getAbsolutePath());
				// ���ϸ� _bak�־� ������ ���ϸ� ����
				sbcopyname.insert(sbcopyname.lastIndexOf("."), "_bak");

				File copyFile = new File(sbcopyname.toString());

				boolean copyFlag = false;

				if (copyFile.exists()) {// ������ ���ϰ� ������ ���ϸ��� �����ϴ���?
					switch (JOptionPane.showConfirmDialog(this, copyFile.getName() + "���� ���ϸ��� �����մϴ�. \n ����ðڽ��ϱ�?")) {
					case JOptionPane.OK_OPTION:
						copyFlag = false;
						break;
					case JOptionPane.NO_OPTION:
						copyFlag = true;
						break;
					case JOptionPane.CANCEL_OPTION:
						copyFlag = true;
						break;
					}// end switch
				} // end if

				if (!copyFlag) { // �ߺ������� ������ false, �� -false ,�ƴϿ� ���, -true

					FileInputStream readStream = null;
					FileOutputStream writeStream = null;

					try {
						// 1. File�� �б����� Stream�� �����Ѵ�.
						readStream = new FileInputStream(orgfile);
						// 2. File�� �������� Stream�� �����Ѵ�.
						writeStream = new FileOutputStream(copyFile);
						// 3. File�� ������ �о� �´�.
						int readSize = 0;
						byte[] readData = new byte[512];
						while ((readSize = readStream.read(readData)) != EOF) {
							// 4. ��Ʈ���� ����Ѵ�.
							writeStream.write(readData, 0, readSize);
							// 5. ��Ʈ���� ��ϵ� ������ �������� �����Ѵ�.
							writeStream.flush();
						} // end while

						JOptionPane.showMessageDialog(this, name + "�� ����Ǿ����ϴ�.");
					} finally {
						// 6. �������.
						if (readStream != null) {
							readStream.close();
						} // end if
						if (writeStream != null) {
							writeStream.close();
						} // end if
					} // end finally

					jtaNote.append(sbcopyname.toString() + "\n");
				}
			} // end if
		} // end if

	}// fileOpen

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jbtnFileOpen) {
			try {
				filecopy();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "���Ϻ����� �����߻�");
				e.printStackTrace();
			} // end catch
		} // end if

	}// actionPerformed

	public static void main(String[] args) {
		new FileCopy2();
	}// main

}// class
