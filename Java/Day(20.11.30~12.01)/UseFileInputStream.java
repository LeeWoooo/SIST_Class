package day1201.usefileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 8bit Stream�� ����Ͽ� HDD�� �����ϴ� File ������ �б� �۾�
 * 
 * @author owner
 */
public class UseFileInputStream {

	public UseFileInputStream() {

		try {
			// 1. File Stream ����
			FileInputStream fis = new FileInputStream(new File("C:/dev/temp/java_read1.txt"));
			// 2.File�� ���� �б�.
//			System.out.println(fis.read()); // read()���� throws�� IOExceoption
			
			int temp = 0;
			while((temp=fis.read()) != -1) {
				System.out.print((char)temp);
			}
			
		} catch (FileNotFoundException fe) {// FileInputStream���� throws�� FileNotFindException
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}// UseFileInputStream

	public static void main(String[] args) {

		new UseFileInputStream();

	}// main

}// class
