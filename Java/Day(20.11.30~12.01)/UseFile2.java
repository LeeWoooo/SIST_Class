package day1201.usefile;

import java.io.File;

/**
 * File�� ����
 * 
 * @author owner
 */
public class UseFile2 {

	public UseFile2() {
		
		//1. ������ Directory�� ���� File class�� �����Ѵ�.
		File file = new File("c:/dev/lee/leewoo");
		
		//2. ����
		boolean flag = file.mkdir(); //���������� ���� �ϳ��� ������ ����
		System.out.println(flag);
		
		boolean flag2 = file.mkdirs(); //���� ������ ���ÿ� ��������
		System.out.println(flag2);
		
	}// UseFile

	public void mkDirectory() {

	}// mkDirectory

	public static void main(String[] args) {
		
		UseFile2 f2 = new UseFile2();
		f2.mkDirectory();
	}// main

}// class
