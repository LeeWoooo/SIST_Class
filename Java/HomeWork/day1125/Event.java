package day1125.homework1125;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

//1. event�� ó���ϱ� ���� interface�� �����Ѵ�.
public class Event implements ActionListener{

	//2. design class�� �ν��Ͻ� ������ �����Ѵ�.
	private Design ds;
	
	//3. ������ instance�� ����� ���� ������ ����
	public Event(Design ds) {
		this.ds=ds;
	}//Event
	
	private boolean idFlag;
	private boolean passwordFlag;
	private int printFlag = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = ds.getJtfName().getText();
		String password =String.valueOf(ds.getJpwPassword().getPassword());
		
		if(e.getSource() == ds.getJtfName() && !(id.isEmpty())) {
			this.idFlag=true;
			ds.getJpwPassword().requestFocus();
		}
		
		if(e.getSource() == ds.getJtfName() && id.isEmpty()) {
			JOptionPane.showMessageDialog(ds, "ID�ʼ��Է�");
			ds.getJtfName().requestFocus();
		}//end if
		
		if(e.getSource() == ds.getJpwPassword() && !(password.isEmpty())) {
			this.passwordFlag=true;
		}
		
		if(e.getSource() == ds.getJpwPassword() && password.isEmpty()) {
			JOptionPane.showMessageDialog(ds, "PASSWORD�ʼ��Է�");
			ds.getJpwPassword().requestFocus();
		}//end if
	
		if(e.getSource() == ds.getJpwPassword() && this.idFlag && this.passwordFlag) {
			ds.getJlbl().setText(id + " / " +password);
			Font fot = new Font("Serif", Font.BOLD, 25);
			ds.getJlbl().setFont(fot);
			ds.getJlbl().setForeground(Color.BLUE);
			this.printFlag = 1;
		}//end if
		
		//����� �Ϸ�� �� flag���� �ʱ�ȭ
		if(this.printFlag == 1) {
			this.idFlag = false;
			this.passwordFlag = false;
			this.printFlag = 0;
		}//end if
		
	}//actionPerformed
	
}//Event
