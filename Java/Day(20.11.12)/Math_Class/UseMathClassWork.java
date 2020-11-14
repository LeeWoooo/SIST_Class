package day1112.mathclass;

/**
 * ���а��� class
 * Instance�� �������� �ʰ� ����մϴ�.(�����ڸ� ����� ����,���������� private)
 * @author owner
 */
public class UseMathClassWork {
	
	/**
	 * ���̰� 8�� char�迭�� 0~9,a~z,A~Z�� ���ڸ� �������� ����־��
	 * ��й�ȣ �ʱ�ȭ ����
	 * 
	 * @return
	 */
	
	//�̹����� tempNum�� ���� �ȿ� �־�߸� �Է��� �����ϱ⿡
	//8�ڸ��� ä��� ���� ����� ���� �𸥴�.
	public char[] createPassword() {
		
	
		char[] tempPassword = new char[8];
		
		int tempNum = 0;
		
		for(int i = 0 ; i < tempPassword.length; i++) {
			
			tempNum=(int)(Math.random()*123); //0~122
			
			if((tempNum>47 && tempNum <58) || (tempNum>64 && tempNum <91) || (tempNum>96 && tempNum <123)) {
				tempPassword[i]=(char)tempNum;
			}else {
				i--;
			}
		}//for
		
		return tempPassword;
		
	}//createPassword
	
	
	public static void main(String[] args) {

		UseMathClassWork umc = new UseMathClassWork();

		umc.createPassword();
		char[]temp =umc.createPassword();
		for(int i = 0 ; i < temp.length ; i++) {
			System.out.print(temp[i]);
		}//for
		
	}//main

}//class
