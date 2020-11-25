package day1125.event_hasa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
 * ������ class�� has a ������ �̺�Ʈ ó�� class�� ����.
 * @author owner
 */
//1. �̺�Ʈ ó���ϱ� ���� LIstener�� �����Ѵ�.
public class HasAEvt implements ActionListener {

	//2.������ class�� instance������ �����Ѵ�.
	private EvtDesign ed;
	
	//3.������ instance�� ����� ���� �����ڸ� ����
	public HasAEvt( EvtDesign ed) { //has a ���谡 �ϼ�
		this.ed = ed;
	}//HasAEvt
	
	//interface�� �ִ� method�� Override�Ѵ�.
	@Override
	public void actionPerformed(ActionEvent e) {
		//��ư�� �����ٸ� ���� ���ڸ� �����Ѵ�.
		
		if( e.getSource() == ed.getJbtn()) {
			JLabel jlblOutPutLabel = ed.getJlbl();
			Font font = new Font("Serif",Font.BOLD, 30);
			jlblOutPutLabel.setFont(font);
//			jlblOutPutLabel.setForeground(Color.DARK_GRAY); //Constant ����� ����
			Color c = new Color(0xC889FF);
			jlblOutPutLabel.setForeground(c); //Color class�� �����Ͽ� ����� ����
			ed.getJbtn().setForeground(c); 
			
			//Constant ���� ����, ������������ ���� component�� �ٷ� ����ȴ�.
			ed.getJtf().setBackground(Color.GRAY);
			
			jlblOutPutLabel.setOpaque(true);//���� ����
			jlblOutPutLabel.setBackground(Color.BLUE);
		}
		
	} //actionPerformed

}//HasAEvt
