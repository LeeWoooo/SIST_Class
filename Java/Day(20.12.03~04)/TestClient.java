package day1204.testserver;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �ڽ��� ������ port�� ���� Server�� �����ϴ� ��.
 * 
 * @author owner
 */
public class TestClient {

	public TestClient() throws UnknownHostException, IOException {
		// 1. Socket ���� (��ü�� �帧 ������ 2)
		Socket client = new Socket("211.238.142.31", 65000);
		System.out.println("Ŭ���̾�Ʈ ����: ������ ���� �õ�.");
		//socket�� �ݴ´�.
		client.close();
	}// TestClient

	public static void main(String[] args) {
		try {
			new TestClient();
		} catch (UnknownHostException ue) {
			ue.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}// main

}// class
