package day1118.gridlayout;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * ������ ��� ���� Component�� �����ϰ� �����Ǵ� Layout�̴�.
 * @author owner
 */
//1. ������ ������Ʈ�� ��ӹ޴´�.
@SuppressWarnings("serial")
public class UseGridLayout extends JFrame {
	
	//2.�����ڸ� �ۼ��Ѵ�.
	public UseGridLayout() {
		super("GridLayout ����");
		
		//3.������Ʈ�� �����Ѵ�.
		
		//���� �� ���
		JButton[] bu = new JButton[9]; //��� ���������� �迭�� ����� �ִ�. ��� ���������� LIst�� ���� �� �ִ�.
		for(int i = 0 ; i < bu.length; i ++) {
			//��� ���� ���� null�̹Ƿ� ����� �� ��� ��� ���� ��ü�� �����Ѵ�.
			bu[i] = new JButton("NUM "+ (i+1)); //���� �� ���
//			bu[i] = new JButton(String.valueOf(i)); //����� ��� - �⺻���� ���� ���ڿ��� �ٲܶ��� String.valueof(�⺻��������);
		}//end for
		
//		//List�� �̿��� ��� (�����)
//		List<JButton> list = new ArrayList<JButton>();
//		for(int i = 1 ; i < 10; i ++) {
//			list.add(new JButton(String.valueOf(i)));
//		}//end for
//		
		
		//4.��ġ�����ڸ� �����Ѵ�.
		setLayout(new GridLayout(3,3));
		
		//5. ������Ʈ�� ��ġ�Ѵ�.
		
		//array
		for(int j = 0 ; j < bu.length ; j++) {
			add(bu[j]);
		}//end for
		
		//list (�����)
//		for(int j = 0 ; j < list.size();  j++) {
//			add(list.get(j));
//		}//end for
		
		//6. Window�� ũ�⸦ �����Ѵ�.
		setSize(400,400);
		
		//7. ����ڿ��� �����ش�.
		setVisible(true);
		
		//8. Window�� �����Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseGridLayout

	public static void main(String[] args) {
		new UseGridLayout();
	}//main

}//class
