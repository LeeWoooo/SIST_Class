package day1203.mydata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ��ü�� JVM�ܺη� �������ų�, JVM�ܺο� �����ϴ� ��ü�� �о� ���϶� ����ϴ� Stream
 * 
 * @author owner
 */
public class ObjectStream {

	/**
	 * �Է¹��� ��ü�� JVM�ܺη� �������� ��
	 * 
	 * @param md
	 */
	public void writeObj(MyData md) throws IOException , NotSerializableException{ //����ȭ

		ObjectOutputStream oos = null;

		try {
			// 1. ��Ʈ���� �����Ѵ�.
			oos = new ObjectOutputStream(new FileOutputStream("c:/dev/temp/obj.dat"));

			// 2. ��ü�� ��Ʈ���� ��ϵȴ�.,(Stream)
			oos.writeObject(md);

			// 3. Stream�� ��ϵ� ������� �������� �����Ѵ�.
			oos.flush();
			System.out.println("��ü�� ����Ǿ����ϴ�.");
		} finally {
			// 4. ����� �Ϸ�� Stream�� �������ش�.
			if (oos != null) {
				oos.close();
			} // end if
		} // end finally
	}// writeObj

	/**
	 * JVM�ܺ��� ��ü�� �о�鿩 ��ȯ�ϴ���.
	 * 
	 * @return
	 */
	public MyData readObj() throws IOException , ClassNotFoundException{ //�� ����ȭs
		MyData md = null;
		ObjectInputStream ois = null;
		
		try {
			//1. Stream�� ����
			ois = new ObjectInputStream(new FileInputStream("c:/dev/temp/obj.dat"));
			
			//2. ��ü�� �о����
			md = (MyData)ois.readObject();
			
		}finally {
			if(ois != null) {
				ois.close();
			} // end if
		} // end finally
		
		return md;
	}// readObj

	public static void main(String[] args) {
		ObjectStream oos = new ObjectStream();

		MyData md = new MyData("�̿��", 25, 172, 70);
		try {
			System.out.println("������ ��ü" + md);
			oos.writeObj(md);
			
			MyData md2 = oos.readObj();
			System.out.println("�о���� ��ü"+md2);
			
		}catch(ClassNotFoundException cnfe) {
			System.err.println("�о���� ���� ��ü�� �ƴմϴ�.");
			cnfe.printStackTrace();
		}catch(NotSerializableException nse) {
		System.err.println("��ü�� ����ȭ���� �ʽ��ϴ�.");
			nse.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} // end catch
	}// main

}// class
