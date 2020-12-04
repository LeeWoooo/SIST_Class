package day1204.simplemsg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleMsgSever {

	public SimpleMsgSever() throws IOException, BindException {

		// 1. ServerSocket�� �����մϴ�. (port����)
		ServerSocket server = null;
		Socket client = null;
		DataOutputStream dos = null; // java�� Data(int,char,String)�� �ܺη� ������ �� ����ϴ� Stream
		DataInputStream dis = null;
		try {
			server = new ServerSocket(55555); // 0~65535
			// 3. �����ڰ� ������ �����Ѵٸ� ������ ������ �޴´�.

			while (true) {
				client = server.accept();

				InetAddress ia = client.getInetAddress();

				System.out.println("������ ����. : " + ia.getHostAddress());
				// 4. ������ �����ϴ� �����͸� �����ڿ��� ������ ���� "Stream"�� �����Ѵ�.
				dos = new DataOutputStream(client.getOutputStream());

				String msg = "�ȳ��ϼ��� �ڷγ� �����ϼ���. -�̿��-";
				// 5. Data�� Stream�� ���.
				// �ѱ��� packet�� ���޵� �� �ְ� ����. �� ->%xx%xx%xx�� ���� UTF-8 = �ѱ� 1���ڿ� 3byte�� �и��� ����
				dos.writeUTF(msg);

//				boolean flag = false;
//				dos.writeBoolean(flag);
				// 6. Stream�� ��ϵ� ������ �������� �����Ѵ�.
				dos.flush();
				
				//�����ڰ� �������� ���� �ޱ� ���� ��Ʈ��.
				dis = new DataInputStream(client.getInputStream());
				//�����ڰ� �������� �� �б�
				String revMsg = dis.readUTF();
				System.out.println(revMsg);
				
			} // end while

			// 8. ������ ���´�.
		} finally {
			if (client != null) {
				client.close();
			} // end if
			if (server != null) {
				server.close();
			} // end if
			if (dos != null) {
				dos.close();
			} // end if
			if (dis != null) {
				dos.close();
			} // end if

		} // end finally

	}// SimpleMsgSever

	public static void main(String[] args) {
		try {
			new SimpleMsgSever();
		} catch (BindException be) {
			System.err.println("������ �̹� �������Դϴ�."); // port�� ���� �ִ� ���
			be.printStackTrace();
		} catch (IOException ie) {
			System.err.println("��ſ� ������ �߻��߽��ϴ�.");
			ie.printStackTrace();
		} // end catch

	}// main

}// class
