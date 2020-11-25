package day1117.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * ������ ���α׷��� (Component Programming)
 * @author owner
 */

//1. ������ Component�� ��� �޴´�. (����� ���� �����ֱ� ���ؼ�)
@SuppressWarnings("serial") //��ȣ�� ������� �ʰڴ�. (���� I/O ������ ��� ����)
public class HellowAWT2 extends Frame implements WindowListener{ //HellowAWT2�� Frame, WindowLister�� Is- a�����̴�.

	//2.�����ڸ� �ۼ��Ѵ�.
	public HellowAWT2() {
		//�θ�����ڸ� ȣ���Ѵ�. title�� �Է��� �θ� class�� �����ڸ� ȣ���Ѵ�.
		//���α׷��� ����� ���� �� ���α׷��� title�� �ǹ�
		super("�ȳ��ϼ���. AWT!");
		
		//3.������Ʈ ����
		Button btn = new Button("���� ��ư ^o^");
		
		//4.������Ʈ ��ġ
		add(btn);
		
		//5.Window�� ũ�⸦ �����Ѵ�.
		setSize(200,100);
		
		//6.����ڿ��� �����ֱ�
		setVisible(true);
		
		//���� �����츦 �ݴ� �̺�Ʈó���� ����� �ʾҴ� (~11.17)
		//(11.18 �߰�����)
		
		addWindowListener(this);
		
	}//HellowAWT
	
	

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}//windowOpened



	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing"); //�������� ���Ḧ ������ ȣ��
		dispose(); //���� �����츦 �������ּ��� , �θ� class�� Window�ΰ�쿡�� ����� �����ϴ�.
		
//		System.exit(0); //���� �� JVM�� ������ �����ϴ� ���� �Ѵ�.  ������ ��ɾ��̴�. ��𿡼��� ��밡��
		//0 - false�ǹ� : ���������� : ���� ������ �۾��� �������� �ʰ�, �ٷ�����
		//0�̿��� �� - true�ǹ� : �������� : ���� ������ �۾��� �����ϰ� ����
	}//windowClosing



	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}//windowClosed



	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}//windowIconified



	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}//windowDeiconified



	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}//windowActivated



	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}//windowDeactivated



	public static void main(String[] args) {

			new HellowAWT2();
			
	}//main

}//class
