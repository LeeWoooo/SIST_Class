package day1201.usefile;

import java.io.File;
import java.io.IOException;

/**
 * HDD�� �����ϴ� File�� ������ ��ų� ������ �� ����ϴ� File class�� ����
 * @author owner
 */
public class UseFile {

	public UseFile() {

		//1.����
		File file = new File("C:/dev/temp/java_read.txt");
		System.out.println(file);
		
		//2.method�� ȣ��.
		if(file.exists()) {//������ �����ϴ���?
			
			System.out.println("���� ũ��: " + file.length()+"byte");//���� ������ ������ ũ���?
			System.out.println("������: " +file.getAbsolutePath());
			
			//CanonicalPath Os���� file�� �����ϴ� ���ϳ��� ��� dirve�� �빮�ڷ� �����Ѵ�.
			try {
				System.out.println("������ : " + file.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end catch
			
			System.out.println("���ϰ�� : " + file.getPath());
			
			System.out.println("���ϵ��丮 : " +file.getParent());
			
			System.out.println("������ �̸� : " +file.getName());

			System.out.println("�����Դϱ�? : " +file.isFile());
			
			System.out.println("�����Դϰ�? : " +file.isDirectory());

			System.out.println("���డ���մϱ�? : " +file.canRead());
			
			System.out.println("���Ⱑ���մϱ�? : " +file.canWrite());
			
			System.out.println("���డ���մϱ�? : " +file.canExecute());
			
			System.out.println("���������Դϱ�? : " +file.isHidden());

			
		}else {
			System.out.println(file + "���� ��γ� ���ϸ��� Ȯ���ϼ���.");
		}
	}

	public static void main(String[] args) {

		new UseFile();

	}// main
}// class
