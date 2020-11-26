package day1126.usefiledialog;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseFileDialog extends JFrame {
	
	private JButton jbtnFileOpen;
	private JButton jbtnFileSave;
	private JTextArea jtaFileList;
	
	public UseFileDialog() {
		super("FileDialog");
		
		//������ �ȿ��� component�� ������ �� ���� ������ �����Ѵ�.
		jbtnFileOpen = new JButton("���Ͽ���");
		jbtnFileSave = new JButton("��������");
		jtaFileList = new JTextArea();
		
		JScrollPane jspCenter = new JScrollPane(jtaFileList);
		jspCenter.setBorder(new TitledBorder("���ϸ���Ʈ"));
		
		JPanel jpNorth = new JPanel();
		jpNorth.setBorder(new TitledBorder("���̾�α� ����"));
		jpNorth.add(jbtnFileOpen);
		jpNorth.add(jbtnFileSave);
		
		//�̺�Ʈ ó�� ��ü�� �����ϰ�
		FileDialogEvt fde = new FileDialogEvt(this);
		//������Ʈ���� �߻��ϴ� �̺�Ʈ�� ó���Ҽ� �ֵ��� �̺�Ʈ�� ����Ѵ�.
		jbtnFileOpen.addActionListener(fde); //ActionEvent
		jbtnFileSave.addActionListener(fde); //ActionEvent
		addWindowListener(fde);//WindowEvent
		
		
		add("North",jpNorth);
		add("Center",jspCenter);
		
		setBounds(100,100,500,600);
		
		
		setVisible(true);
		
		
	}//UseFileDialog

	public JButton getJbtnFileOpen() {
		return jbtnFileOpen;
	}//getJbtnFileOpen

	public JButton getJbtnFileSave() {
		return jbtnFileSave;
	}//getJbtnFileSaver

	public JTextArea getJtaFileList() {
		return jtaFileList;
	}//getJtaFileList
	

	public static void main(String[]args) {
		new UseFileDialog();
	}//main
}
