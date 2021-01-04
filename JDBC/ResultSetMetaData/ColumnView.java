package day210104;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ColumnView extends JFrame {

	private JComboBox<String> jcbTableName;
	private DefaultComboBoxModel<String> dcbmTableName;
	private JTable jtabColumnView;
	private DefaultTableModel dtmColumnView;
	private JButton jbtnSearch;
	
	public ColumnView() {
		super("table column ��ȸ");
		
		dcbmTableName = new DefaultComboBoxModel<String>();
		jcbTableName = new JComboBox<String>(dcbmTableName);
		String[] columnNames= {"��ȣ","column��","Datatype","ũ��","NULL?"};
		dtmColumnView = new DefaultTableModel(columnNames,6);
		jtabColumnView = new JTable(dtmColumnView);
		
		//column�� ���� ����
		jtabColumnView.getColumnModel().getColumn(0).setPreferredWidth(40);
		jtabColumnView.getColumnModel().getColumn(1).setPreferredWidth(270);
		jtabColumnView.getColumnModel().getColumn(2).setPreferredWidth(140);
		jtabColumnView.getColumnModel().getColumn(3).setPreferredWidth(100);
		jtabColumnView.getColumnModel().getColumn(4).setPreferredWidth(60);
		
		
		//������ ���̼���
		jtabColumnView.setRowHeight(30);
		
		jbtnSearch = new JButton("��ȸ");
		
		JPanel jpNorth = new JPanel();
		jpNorth.add(new JLabel("���̺��"));		
		jpNorth.add(jcbTableName);
		jpNorth.add(jbtnSearch);
		
		JScrollPane jspCenter = new JScrollPane(jtabColumnView);
		add("North",jpNorth);
		add("Center",jspCenter);
		
		ColumnViewEvt cvEvt = new ColumnViewEvt(this);
		jbtnSearch.addActionListener(cvEvt);
		
		setLocationRelativeTo(null);
		setSize(550,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}// ColumnView

	public JComboBox<String> getJcbTableName() {
		return jcbTableName;
	}

	public DefaultComboBoxModel<String> getDcbmTableName() {
		return dcbmTableName;
	}

	public JTable getJtabColumnView() {
		return jtabColumnView;
	}

	public DefaultTableModel getDtmColumnView() {
		return dtmColumnView;
	}
	
	public JButton getJbtnSearch() {
		return jbtnSearch;
	}

	public static void main(String[] args) {
		new ColumnView();
	}

}//end class
