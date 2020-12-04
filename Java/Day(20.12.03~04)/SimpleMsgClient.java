package day1204.simplemsg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class SimpleMsgClient {

	public SimpleMsgClient() throws IOException, UnknownHostException {
		// 2. Socket ����: ������ port�� ����, ������ ip�ּ��� ��ǻ�ͷ� ���� ������ port�� ����ȴ�.
		Socket client = null;
		DataInputStream dis = null; // Java�� Data�� �ޱ� ���� Stream
		DataOutputStream dos = null;// ������ �����͸� ������ ���� Stream
		try {
			String ip = JOptionPane.showInputDialog("ip�Է� \n 37,26,22,44,33,45,21,28,31,27,39,32,34,24,38,25");
			client = new Socket("211.238.142."+ip, 55555);
			
			
			//�ڽ���ǻ�� ���� : ip address, loopBack : localhost, 127.0.0.1
//			client = new Socket("localhost",55555);
			// 4. �������� �����ϴ� ���� �ޱ����� "Stream"�� �����Ѵ�
			dis = new DataInputStream(client.getInputStream());
			
			//7. �������� �������� msg�� �б�
			//%xx%xx%xx�� �и��Ǿ� ���� ���ڸ� ������� ��ģ��.
			
			String revMsg = dis.readUTF(); 
//			System.out.println("�������� �� �޼��� = " + revMsg);
			
			String sendMsg = JOptionPane.showInputDialog(revMsg);
			
			//�Է¹��� message�� ���� ��Ʈ�� ���.
			dos = new DataOutputStream(client.getOutputStream());
			//�޼����� ��Ʈ���� ���
			dos.writeUTF(sendMsg);
			//��Ʈ���� ������ ������(����)���� ����
			dos.flush();
			
			
//			boolean flag = dis.readBoolean();
//			System.out.println(flag);
			
			//8. ������ ���´�.
		} finally {
			if (client != null) {
				client.close();
			} // end if
			if (dis != null) {
				dis.close();
			} // end if
			if (dos != null) {
				dos.close();
			} // end if
		} // end finally

	}// SimpleMsgClient

	public static void main(String[] args) {
		try {
			new SimpleMsgClient();
		} catch (UnknownHostException uhe) {
			System.err.println("������ �� �� ����");
			uhe.printStackTrace();
		} catch (IOException ie) {
			System.err.println("��� �����߻�");
			ie.printStackTrace();
		} // end catch
	}// main
}// class
