package day1201.homework1201;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HomeWork1201 {

	public HomeWork1201() {

		// 1. JOptionPane�� �̿��Ͽ� ��� �Է��� �����Ͽ� ���� �Է¹���.
		String path = JOptionPane.showInputDialog("����Է�");

		// 2. �Էµ� ���� �������� ��ζ��
		if ("c:/dev".equals(path)) {
			File file = new File(path);
			if (file.exists() && file.isDirectory()) {

				String[] fileList = file.list();
				printFileList(fileList,path);

			} // endif
		} else {
			printErrMsg();
		} // end if

	}// HomeWork1201

	public void printErrMsg() {
		JOptionPane.showMessageDialog(null, "��θ� Ȯ�����ּ���");
	}// printErrMsg

	public void printFileList(String[] fileList, String path) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm");

		JTextArea jta = new JTextArea(10, 50);
		JScrollPane jsp = new JScrollPane(jta);
		jta.append("�̸�" + "\t" + "�����ѳ�¥" + "\t" + "����" + "\t" + "ũ��" +"\n");
		jta.append("========================================"+"\n");

		String fileName = "";
		for (int i = 0; i < fileList.length; i++) {
			File file = new File(path + "/" + fileList[i]);
			if (file.isFile()) {
//				fileName = file.getName().substring(0, file.getName().indexOf("."));
//				String fileType = file.getName().substring(file.getName().indexOf(".") + 1);
				jta.append(fileName + "\t"
						+ sdf.format(new Date(file.lastModified())) + "\t" + "����" + "\t" + file.length() + "byte" +"\n");
			} else if(file.isDirectory()) {
				fileName = file.getName();
				jta.append(fileName + "\t"
						+ sdf.format(new Date(file.lastModified())) + "\t" + "����" + "\t" + file.length() + "byte"+"\n");
			} // end else
		} // end for
		
		JOptionPane.showMessageDialog(null, jsp);
		
	}// printFileList

	public static void main(String[] args) {
		new HomeWork1201();
	}// main

}// class
