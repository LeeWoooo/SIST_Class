package day1126.usekeyevent;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * Ű������ Ű�� ������ �� �߻��ϴ� �̺�Ʈ ó��.
 * @author owner
 */
@SuppressWarnings("serial")
public class UseKeyEvent extends JFrame implements KeyListener {
	
	private static final int ESC = 27;
	private static final int UP = 38;
	private static final int DOWN = 40;
	private static final int LEFT = 37;
	private static final int RIGHT = 39;

	private JTextField jtf;
	private JTextArea jta;
	
	public UseKeyEvent() {
		super("Ű���� �̺�Ʈ�� ó��");
	
		jtf = new JTextField();
		jta = new JTextArea();
		
		//�̺�Ʈ ���
		jtf.addKeyListener(this);
		
		JScrollPane jsp = new JScrollPane(jta);
		
		jtf.setBorder(new TitledBorder("�ƹ�Ű�� �Է��ϼ���."));
		jsp.setBorder(new LineBorder(Color.RED));
		
		add("North",jtf);
		add("Center",jsp);
		
		setBounds(100, 100, 300, 300);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseKeyEvent
	
	@Override
	public void keyTyped(KeyEvent ke) {
//		System.out.println("keyTyped2");		
//		Keycord�� ���� �� ����.
	}//keyTyped

	@Override
	public void keyPressed(KeyEvent ke) {
//		System.out.println("keyPressed1");
	}//keyPressed

	@Override
	public void keyReleased(KeyEvent ke) {
//		System.out.println("keyReleased3");
		jta.append(ke.getKeyCode() + "/" + ke.getKeyChar() + "\n");
		
		int x = getX();
		int y = getY();
		
		switch (ke.getKeyCode()) {
		case ESC: 
			int flag = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?");
			switch(flag) {
			case JOptionPane.OK_OPTION:
				this.dispose();
			}//switch
		case UP: y -=10; break;
		case DOWN: y +=10; break;
		case LEFT: x-=10; break;
		case RIGHT: x+=10;
		}//switch
		setLocation(x, y);
		
		
	}//keyReleased

	public static void main(String[] args) {
		new UseKeyEvent();
	}//main

}//class
