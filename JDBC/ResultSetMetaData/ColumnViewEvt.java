package day210104;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ColumnViewEvt implements ActionListener {

	private ColumnView cv;

	public ColumnViewEvt(ColumnView cv) {
		this.cv = cv;
		setAllTable();
	}// ColumnViewEvt

	public void setAllTable() {
//		ColumnViewDAO cvDAO = ColumnViewDAO.getInstance();
//		try {
//			cv.getDcbmTableName().addAll(cvDAO.selectAllTablename());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}//end catch

		// JComboBox�� ���� �����ϴ� Model��ü�� ��´�.
		DefaultComboBoxModel<String> dcbm = cv.getDcbmTableName();
		// dbms���� ��ȸ�� ���̺� ���� ��´�.
		ColumnViewDAO cvDAO = ColumnViewDAO.getInstance();
		try {
			List<String> list = cvDAO.selectAllTablename();
			// Model ��ü�� ��ȸ�� ����� �����մϴ�.
//			dcbm.addAll(list);
			for (String table : list) {
				dcbm.addElement(table);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(cv, "�˼��մϴ�. ���̺���� ��ȸ�� �� �����ϴ�.");
			e.printStackTrace();
		} // end catch
	}// setAllTable

	public void setTableColumn(String tableName) {
		try {
			// �Էµ� ���̺� column������ ��ȸ�Ͽ�
			List<ColumnVO> columnData = ColumnViewDAO.getInstance().selectOneTable(tableName);
			// Model�� ����.
			DefaultTableModel dtm = cv.getDtmColumnView();
			dtm.setRowCount(0); // ���� �����ֱ� ���� ���� �ʱ�ȭ�Ѵ�.

			// ���� ���� �����ϱ� ���� Object[] ����
			Object[] rowData = null;
			ColumnVO cv = null;
			for (int i = 0; i < columnData.size(); i++) {
				cv = columnData.get(i);
				rowData = new Object[5];
				rowData[0] = Integer.valueOf(i + 1);
				rowData[1] = cv.getColumnName();
				rowData[2] = cv.getDataType();
				rowData[3] = cv.getPrecision();
				rowData[4] = cv.getNullFlag()==0? "NOT NULL" : "NULL";
				dtm.addRow(rowData);
			} // end for

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(cv, tableName + "���̺��� ������ ��ȸ�� �� �����ϴ�.");
			e.printStackTrace();
		} // end catch
	}// end setTableColumn

	@Override
	public void actionPerformed(ActionEvent ae) {
		String tableName = cv.getDcbmTableName().getElementAt(cv.getJcbTableName().getSelectedIndex());
		switch (JOptionPane.showConfirmDialog(cv, tableName + "�� ������ ��ȸ�Ͻðڽ��ϱ�?")) {
		case JOptionPane.OK_OPTION: {
			setTableColumn(tableName);
		} // end case
		}// end switch
	}// actionPerformed
}// class
