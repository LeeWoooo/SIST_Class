package day1130.systeminput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �Է��� �ٿ� �� �ý����� �Է��� Ű���忡�� �Էµ� �� �ޱ�.
 * @author owner
 */
public class SystemInput {

	public SystemInput(){
	
		System.out.println("�ƹ�Ű�� ������ Enter");
		
		try {
//			int code = System.in.read();
//			System.out.println("�Է°� : " + code);
//			
//			int keyCode = 0;
//			//�о�帱�� ���� ���� �����ϸ� read()�� -1�� return�ȴ�.
//			while((keyCode = System.in.read()) != (13)) { //�ѱ��� ������ ����� ���Ѵ�.
//				System.out.println(keyCode);
//			}//end while
			
			//Ű���� �Է��� �о���� �� �ִ� 8bit stream�� 
			//�ٴ����� �о� �鸱 ���ִ� 16bit�� �����Ͽ� �� ������ �о�鿩 ������ ���� �� ���
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msg = br.readLine();
			System.out.println(msg);
			
			br.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
	
		
	}//SystemInput()
	
	public static void main(String[] args) {
		new SystemInput();
		
	}//main
}//class
