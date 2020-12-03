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
@SuppressWarnings("serial")
public class FileCopy extends JFrame implements ActionListener {

	public static final int EOF = -1;

	private JButton jbtnFileOpen;
	private JTextArea jtaNote;

	public FileCopy() {

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

				FileInputStream readStream = null;
				FileOutputStream writeStream = null;

				try {
					// 1. File�� �б����� Stream�� �����Ѵ�.
					readStream = new FileInputStream(orgfile);
					// 2. File�� �������� Stream�� �����Ѵ�.

					///
					File directory = new File(path);
					String[] fileList = directory.list();
					int flag2 = 0;
					for (int i = 0; i < fileList.length; i++) {
						if (fileList[i].equals(copyFile.getName()))
							flag2 = 1;
					}
					int flag = 0;
					if (flag2 == 1) {
						flag = JOptionPane.showConfirmDialog(this, "������ ����ðڽ��ϱ�?");
						switch (flag) {
						case JOptionPane.OK_OPTION:
							writeStream = new FileOutputStream(copyFile);
							break;
						case JOptionPane.NO_OPTION : case JOptionPane.CANCEL_OPTION:
							String copy = sbcopyname.insert(sbcopyname.lastIndexOf("."), "_bak").toString();
							File copyFiles = new File(copy);
							writeStream = new FileOutputStream(copyFiles);
							break;
						}// end switch
					}else{
						writeStream = new FileOutputStream(copyFile);
					} // end if
					

					///

					// 3. File�� ������ �о� �´�.
					int temp = 0;
					while ((temp = readStream.read()) != EOF) {
						// 4. ��Ʈ���� ����Ѵ�.
						writeStream.write(temp);
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
		new FileCopy();
	}// main

}// class
