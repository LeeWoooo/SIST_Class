package day1119.checkbox;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//1. ������ ������Ʈ�� ��ӹ޽��ϴ�.
@SuppressWarnings("serial")
public class UseCheckBox extends JFrame {

	//2. �����ڸ� �ۼ��մϴ�.
	public UseCheckBox() {
		super("Check Component");
	
	//3. ������Ʈ�� �����մϴ�.
	
	JLabel jlblhobby = new JLabel("��̸� �����ϼ���");
	JCheckBox jcbho1 = new JCheckBox("����");
	JCheckBox jcbho2 = new JCheckBox("���");
	JCheckBox jcbho3 = new JCheckBox("�",true); //boolean������ üũ �� ���·� ��°���
	
	JLabel jlblgender = new JLabel("������ �����ϼ���");
	JRadioButton jrbman = new JRadioButton("��");
	JRadioButton jrbwoman = new JRadioButton("��");

	//4. ��ġ ������ ����
	
	setLayout(new GridLayout(2,1));
	
	//�������� ������Ʈ�� �ϳ��� ���� �����̳� ������Ʈ�� �����մϴ�.
	JPanel jphobby = new JPanel();
	JPanel jpgender = new JPanel();
	
	//5.��ġ
	jphobby.add(jlblhobby);
	jphobby.add(jcbho1);
	jphobby.add(jcbho2);
	jphobby.add(jcbho3);
	
	
	//Radiobutton�� ButtonGroup�� ��� �ϳ��� ���ð����ϵ��� �����Ѵ�.
	ButtonGroup bg = new ButtonGroup();
	bg.add(jrbman);
	bg.add(jrbwoman);
	
	jpgender.add(jlblgender);
	jpgender.add(jrbman);
	jpgender.add(jrbwoman);
	
	
	//window ������Ʈ�� ��ġ
	add(jphobby);
	add(jpgender);
	
	//6. window ũ�� ����
	setBounds(100,100,400,200);
	
	//7. ����ڿ��� �����ش�.
	setVisible(true);
	
	//8.Window�� �����Ѵ�.
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	}//UseCheckBox
	
	public static void main(String[] args) {

		new UseCheckBox();
		
	}//main

}//class
