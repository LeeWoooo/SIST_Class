package day1126.usefiledialog;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogEvt extends WindowAdapter implements ActionListener{

	
	private UseFileDialog ufd;
	
	/**
	 * ������ Ŭ������ �̺�Ʈó�� Ŭ������ HAS-A  ����� �����ϴ� ������. 
	 * @param ufd
	 */
	public FileDialogEvt(UseFileDialog ufd) {
		this.ufd = ufd;
	}//FileDialogEvt
	
	@Override
	public void windowClosing(WindowEvent e) {
		ufd.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		//�̺�Ʈ�� �߻����� �� ���� ������ �ڵ常 �����ؾ� ���ϴ� �̺�Ʈ�� �����
		//�ս��� �� �� �ִ�.
		if(ae.getSource() == ufd.getJbtnFileOpen()) { //�����ư���� �̺�Ʈ �߻�
			openFileDialog();
		}//end if
		
		if(ae.getSource() == ufd.getJbtnFileSave()) { //�����ư���� �̺�Ʈ �߻�
			saveFileDialog();
		}//end if
	}//actionPerformed

	
	private void openFileDialog() {
		
		//1. ���̾�α׸� �����Ѵ�.
		FileDialog fdOpen = new FileDialog(ufd, "����", FileDialog.LOAD);
		
		//2,����ڿ��� �����ֱ�
		fdOpen.setVisible(true);
		
		//������
		String dir = fdOpen.getDirectory();
		
		//���ϸ�
		String fileName = fdOpen.getFile();
		
		if(dir != null) {
			//������ ���ϸ��� JTextArea�� �߰�
			StringBuilder sb = new StringBuilder();
			sb.append("���� :").append(dir).append(fileName).append("\n");
			ufd.getJtaFileList().append(sb.toString());
			//JFrame�� Ÿ��Ʋ �ٸ� �����Ѵ�.
			ufd.setTitle("���ϴ��̾�α� - ����");
		}//end if
		
		
	}//openFileDialog
	
	
	private void saveFileDialog() {
		
		//1. ���̾�α׸� �����Ѵ�.
		FileDialog fdsave = new FileDialog(ufd, "����", FileDialog.SAVE);
		
		//2,����ڿ��� �����ֱ�
		fdsave.setVisible(true);
		
		//������
		String dir = fdsave.getDirectory();
				
				//���ϸ�
		String fileName = fdsave.getFile();
				
		if(dir != null) {
			//������ ���ϸ��� JTextArea�� �߰�
			StringBuilder sb = new StringBuilder();
			sb.append("���� :").append(dir).append(fileName).append("\n");
			ufd.getJtaFileList().append(sb.toString());
			//JFrame�� Ÿ��Ʋ �ٸ� �����Ѵ�.
			ufd.setTitle("���ϴ��̾�α� - ����");
		}
		
	}//saveFileDialog
}//class
