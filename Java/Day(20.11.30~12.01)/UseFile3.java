package day1201.usefile;

import java.io.File;

public class UseFile3 {

	
//	public void removeFile() {
//		File file = new File("C:/dev/temp/java_read1.txt");
//		
//		if(file.exists()) {
//			file.delete();
//		}
//	}//removeFile
//	
	public void reName() {
		
		//���� ��ü�� ����
		File file = new File("C:/dev/temp/java_read.txt");
		//������ �̸��� ���� ���� ��ü�� ����
		File refile = new File("C:/dev/temp/java_read1.txt");
		
		System.out.println(file.renameTo(refile));
		
	}//reName
	
	public static void main(String[] args) {

		UseFile3 f3 = new UseFile3();
//		f3.removeFile();
		f3.reName();
		
	}//main

}//class
