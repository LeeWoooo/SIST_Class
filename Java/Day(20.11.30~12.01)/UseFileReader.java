package day1201.usefilereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 16bit Stream�� ����Ͽ� file�� ��� ������ �д��۾�
 * 
 * @author owner
 *
 */
public class UseFileReader {

	public UseFileReader() throws /* FileNotFoundException, */ IOException {
		File file = new File("C:/dev/temp/java_read1.txt");
		// 1. File�� �����Ѵٸ� File�� Stream�� �����ϰڽ��ϴ�.
		if (file.exists()) {// file class�� ����Ͽ� file�� ������ Ȯ���ϱ� ������ ���ܸ� ������ �ʾƵ� �ȴ�.
			FileReader fr = new FileReader(file);
			//2. �� ������ �о���̴� ����� �ִ� Stream�� ����
			BufferedReader bfr = new BufferedReader(fr);

			//���Ͽ� �ִ� ������ ���� �б�
			String str = "";
			while ((str=bfr.readLine()) != null) { //������ �� (EOF(end of file)���� null�� ���´�.
				System.out.println(str);
			} // end while
			
			//3. Stream�� ����� ����Ǿ��ٸ� ���� ����
			bfr.close();
		} else {
			System.err.println(file + "�� �������� �ʽ��ϴ�.");
		} // end else

	}// UseFileReader

	public static void main(String[] args) {

		try {
			new UseFileReader();
		} catch (IOException ie) {
			System.err.println("������ ������ �о���� �� �����ϴ�");
			ie.printStackTrace();
		} // end catch

	}// main

}// class
