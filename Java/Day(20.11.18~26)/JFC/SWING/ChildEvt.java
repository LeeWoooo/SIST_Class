package day1126.usedialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class ChildEvt extends WindowAdapter implements ActionListener {

	private UseChild uc;
	
	public ChildEvt(UseChild uc) {
		this.uc = uc;
	}//ChildEvt
	
	@Override
	public void windowClosing(WindowEvent ae) {
		uc.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent we) {
		
		if(we.getSource() == uc.getJbtn()) {
		String lunch =JOptionPane.showInputDialog("���ɸ޴��� �����̾����ϱ�?");
			if(lunch != null && !lunch.isEmpty()) {
				String[] menu = {"¥���,«��,������,���","������,����,���뱹,������","���,���,������","���κ��,�����,��ġ�","������,��������"};
				String[] type = {"�߽�","����","�н�","�ѽ�","���"};
		
				String temptype = lunch+"�� �� �� ���� ���������Դϴ�.";
				for(int i = 0; i < menu.length; i++) {
					if(menu[i].contains(lunch)) {
						temptype = lunch + "�� " + type[i] + "�Դϴ�";
						break;
					}//end if
				}//for
				JOptionPane.showMessageDialog(uc, temptype);
			}//end if
		}	
	}//actionPerformed

}//class
