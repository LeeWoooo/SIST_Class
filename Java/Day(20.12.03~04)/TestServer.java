package day1204.testserver;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1. port�� ���� �����ڰ� �����⸦ ����ϴ� ���� �Ѵ�. <br>
 * 2. ������ ������ ������ �㰡�Ͽ� ������ ������ �޴� ���� �Ѵ�.(��ü�� �帧 ������ 3)
 * 
 * @author owner
 */
public class TestServer {

	public TestServer() throws IOException, BindException {

		// 1. ServerSocket ���� : port�� ����
		ServerSocket server = new ServerSocket(65000);
		System.out.println("�����ڰ� ���� �� �ֵ��� port�� �������ϴ�.");

		// 2. Client Socket�� ������ Client Socket�� �޴´�.
		Socket client = server.accept();
		System.out.println("�����ڰ� ���Խ��ϴ�." + client);
		// 3. server�� �ݴ´�.
		server.close();
	}// TestServer

	public static void main(String[] args) {

		try {
			new TestServer();
		} catch (BindException be) {
			System.err.println("��Ʈ�� �̹� ����� �Դϴ�.");
		} catch (IOException ie) {
			ie.printStackTrace();
		} // end catch

	}// main

}// class
