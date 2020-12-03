package day1202.usefilewrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UseFileWrite2 {

	public UseFileWrite2() throws IOException {

		BufferedWriter bw = null;
		try {
			// 1.���Ͽ� ��Ʈ�� ����
			bw = new BufferedWriter(new FileWriter(new File("c:/dev/temp/String_data.txt")));
			// 2.�����͸� ��Ʈ�� ���.
			String msg = "�ڷγ��� �������� �̰ܺ���";
			bw.write(msg);
			// 3.��Ʈ���� ������ �������� ����
			bw.flush();
			System.out.println("�������� ���");
		} finally {
			// 4.�������
			if (bw != null) {
				bw.close();
			} // end if
		} // end finally
	}// UseFileWrite

	public static void main(String[] args) {

		try {
			new UseFileWrite2();
		} catch (IOException e) {
			e.printStackTrace();
		} // end catch

	}// main

}// class
