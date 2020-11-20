package day1120.jtable;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UseJTable extends JFrame {
	
	//������ �ۼ�
	public UseJTable() {
	
		super("JTable ����");
		
		//3.������Ʈ ����
		//�÷����� �����ϴ� ������ �迭�� ����
		String[] columnNames = {"��ȣ","�̸�","����","�̸���","���"};
		//���ڵ� ���� �����ϴ� 2���� �迭�� ����
		String[][]rowData = { 
									{"1","�̿��","25","lee@test.com" ," "},
									{"2","���ϱ�","27","jang@test.com" ," "},
									{"3","������","25","nam@test.com" ," "},
									{"4","������","26","park@test.com" ," "},
									};
		
		//�����͸� ������ model instance ����
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
		
		//dtmd�� method�� ����Ͽ� ������ �߰�
		//�迭�� �ִ� ���
		String[] data = {"5","�κ���","27","min@test.com"," "};
		dtm.addRow(data);
		
		//Vector�� �̿��� ���
		Vector<String> vt = new Vector<String>();
		vt.add("6");
		vt.add("�ſ���");
		vt.add("25");
		vt.add("sin@test.com");
		vt.add(" ");
		dtm.addRow(vt);
		
		
		//�����͸� ������ view�� �����ϰڽ��ϴ�.
		JTable jt = new JTable(dtm);
		
		//scrollbar�� ������ش�.
		JScrollPane jsp = new JScrollPane(jt);
		
		//border����
		jsp.setBorder(new TitledBorder("�л�����"));
		
		//���� ũ�� ����
		jt.setRowHeight(25);
		//column�� ���̸� ����
		jt.getColumnModel().getColumn(0).setPreferredWidth(20);
		jt.getColumnModel().getColumn(1).setPreferredWidth(120);
		jt.getColumnModel().getColumn(2).setPreferredWidth(80);
		jt.getColumnModel().getColumn(3).setPreferredWidth(150);
		
		//4.��ġ�����ڸ� ����
		setLayout(new BorderLayout());
		
		//5. ��ġ
		add("Center",jsp);
		
		//6.windowũ�⼳��
		setBounds(100, 100, 700, 200);
		setResizable(false);
		
		//7.����ڿ��� �����ֱ�
		setVisible(true);
		
		//8.window����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseJTable
	
	public static void main(String[] args) {
		new UseJTable();
	}

}
