package day1202.usefilewrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UseFileWrite {

	public UseFileWrite() throws IOException {

		FileWriter fw = null;
		try {

			// 1.���Ͽ� ��Ʈ�� ����
			fw = new FileWriter(new File("c:/dev/temp/String_data.txt"));
			// 2.�����͸� ��Ʈ�� ���.
			String msg = "�ڷγ��� ��������";
			fw.write(msg);
			// 3.��Ʈ���� ������ �������� ����
			fw.flush();
			System.out.println("�������� ���");
		} finally {
			// 4.�������
			if (fw != null) {
				fw.close();
			} // end if
		} // end finally
	}// UseFileWrite

	public static void main(String[] args) {

		try {
			new UseFileWrite();
		} catch (IOException e) {
			e.printStackTrace();
		} // end catch

	}// main

}// class
