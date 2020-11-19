package day1119.useimage;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")

//1. ������ ������Ʈ�� ��� �޴´�.
public class UseImage extends JFrame {

	//2.�����ڸ� �ۼ�
	public UseImage() {
		super("Image����");
	
	//3. �̹��� ���� �� component����
		//�̹��� ����
		//��δ� /�� \��� ��밡��
		ImageIcon ii1 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_1.png");
		ImageIcon ii2 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_2.png");
		ImageIcon ii3 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_3.png");
		ImageIcon ii4 = new ImageIcon("C:/dev/workspace/javase_prj/src/day1119/img/img_4.png");
		//\�� ����Ҷ����� Ư�������� ���۱�ȣ�� ���ļ� \���� �ѱ��ڿ� Ư������ó�����ȴ�.
		//�̶� \�� �� ���ڰ� �ڹٿ��� �����ϴ� Ư�����ڰ� �ƴ϶�� error
		
		//��ư���� �� �̹��� ����
		JButton jb1 = new JButton("���̾�",ii1);
		JButton jb2 = new JButton("����ġ",ii2);
		JButton jb3 = new JButton("����",ii3);
		
		//jb1�� �ؽ�Ʈ�� ���� ��ġ �̵� (LEFT, CENTER, RIGHT)
		jb1.setHorizontalTextPosition(JButton.CENTER);
		
		//jb1�� �ؽ�Ʈ�� ���� ��ġ �̵� (TOP, CENTER, BOTTOM)
		jb1.setVerticalTextPosition(JButton.TOP);

		//jb3�� �ؽ�Ʈ�� ��ġ�� �ϴ� �߾ӿ� ��ġ
		jb3.setHorizontalTextPosition(JButton.CENTER);
		jb3.setVerticalTextPosition(JButton.BOTTOM);
		
		
		//ǳ�� ���� : Tooltip Text
		jb1.setToolTipText("����� ��");
		jb2.setToolTipText("�������� ��");
		jb3.setToolTipText("�ܹ����� ��");
		
		//���콺 �����Ͱ� �ö󰡰ų� Ŭ���Ǹ� �̹����� ���� : RollOver
		jb3.setRolloverIcon(ii4);
		
	//4. ��ġ������ ����
		setLayout(new GridLayout(1, 3));
	//5. component ��ġ
		add(jb1);	
		add(jb2);	
		add(jb3);	
	//6. window size����
		setSize(600, 200);
	//7. ����ڿ��� �����ֱ�
		setVisible(true);
	//8. window����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}//UseImage
	
	public static void main(String[]args) {
		
		new UseImage();
		
	}//main
	
}//class
