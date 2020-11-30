package day1130.homework1130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class HomeWork1130 {

	public HomeWork1130() {

		List<String> name = new ArrayList<String>();
		JTextArea jta = new JTextArea(10,30);
		jta.append("�̸�" +"\n");
		jta.append("======="+"\n");
		JScrollPane jsp = new JScrollPane(jta);
		boolean flag3 = true;
		
		while(flag3) {
			System.out.println("�޴��� �Է����ּ��� 1.�̸� �Է�  2.���   3.���� ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			try {
				int flag = Integer.parseInt(br.readLine());
				switch(flag) {
				case 1:
					String stuName = JOptionPane.showInputDialog("�̸��� �Է����ּ���");
					name.add(stuName);
					jta.append(stuName + "\n");
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, jsp);
					break;
					
				case 3:
					int flag2 = JOptionPane.showConfirmDialog(null, "���������Ͻðڽ��ϱ�?");
					
					switch(flag2) {
					case JOptionPane.OK_OPTION: 
						System.out.println("�����մϴ�.");
						flag3 = false;
						
					case JOptionPane.NO_OPTION:
						break;
						
					case JOptionPane.CANCEL_OPTION:
						break;
						
					}//end switch
					break;
				}//end switch
				
			} catch (NumberFormatException e) {
				System.err.println("���ڸ� �Է����ּ���");
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("���� �Է����ּ���");
				e.printStackTrace();
			} //end catch
		}//end while
	}//HomeWork1130
	
	public static void main(String[] args) {
		new HomeWork1130();
	}//main

}//class
