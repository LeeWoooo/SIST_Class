package day1125.usewindowadapter;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;


/**
 * WindowListener�� �����ϸ� 7���� �߻� method�� Override�ؾ��մϴ�.
 * WindowListener�� ������ WindowAdapter�� ��ӹ����� �ʿ��� method�� Override�ϸ� �ȴ�.
 * @author owner
 */
public class EvtWindowHasA extends WindowAdapter /* implements WindowListener */ {

	//has a
	private UseWindowAdapter uwa;
	
	public EvtWindowHasA(UseWindowAdapter uwa) {
		this.uwa=uwa;
	}//EvtWindowHasA
	
	@Override
	public void windowClosing(WindowEvent e) {
		int closeFlag = JOptionPane.showConfirmDialog(uwa, "�����Ͻðڽ��ϱ�?");
		switch(closeFlag) {
		case JOptionPane.OK_OPTION : uwa.dispose();
		}//end switch
	}
	
}//class
