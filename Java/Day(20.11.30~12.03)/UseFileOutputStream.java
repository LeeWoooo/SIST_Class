package day1202.usefileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JVM�ȿ��� �߻��� �����͸� ���Ͽ� ���
 * 
 * @author owner
 */
public class UseFileOutputStream {

	public UseFileOutputStream() throws IOException {
		FileOutputStream fos = null;
		try {
			File path = new File("c:/dev/temp/");
			if (!path.exists()) { // ������ ������ ������ ���ٸ� ������ �����Ѵ�.
				path.mkdirs();
			} // end if

			// ������ ��θ� ����Ͽ� ������ ����.
			File file = new File(path.getAbsolutePath() + "/" + "test.txt");

			// 1. ��Ʈ�� ���� (����ų� , �����ϰų�)
			fos = new FileOutputStream(file);

			// 2. ��Ʈ���� �������� ���� ������ ����.
			fos.write(65); // IOException

			// 3. ��Ʈ���� ��ϵ� ������ �������� ����
			// (�⺻���� flush�� ���� �ʾƵ� �������� ����ȴ�.)
			// (�������� flush�� �ؾ� �������� ����ȴ�.)
			fos.flush(); // IOException
			System.out.println("���Ͽ� ��ϵǾ����ϴ�.");

		} finally {// �ݵ�� ����Ǿ�� �ϴ� �ڵ� �ۼ�.
			// 4. ���� ����
			if (fos != null) {
				fos.close(); // IOException
			}
		} // end finally

	}// UseFileOutputStream

	public static void main(String[] args) {
		try {
			new UseFileOutputStream();
		} catch (IOException e) {
			// ������ �ȿ��� �߻��� IOException�� ��Ƽ� ó���� �� �ִ�.(�ڵ� ����)
			// ���ܰ� �߻��� �ڵ�� ���ܸ� ó���� �ڵ带 �и��� �� �ִ�.(���⵵ ������)
			e.printStackTrace();
		}//end catch
	}// main

}// class
