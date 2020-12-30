package day1229.work;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UseWorkPreparedStatementDAO{

	private List<WorkEmpAllVO> list;

	public UseWorkPreparedStatementDAO() {
		try {
			searchAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch

		StringBuilder output = new StringBuilder();
		if (list.isEmpty()) {
			output.append("��ȸ�� ��� ������ �����ϴ�.");
		}else {
		output.append("�����ȣ\t�����\t�μ���ȣ\t����\t���ʽ�\t����\n");
		output.append("----------------------------------------------------------------------------------------------------------------------\n");
		for(int i = 0; i <list.size(); i++) {
			output.append(list.get(i).getEmpno()).append("\t").append(list.get(i).getEname()).append("\t").append(list.get(i).getDeptno())
			.append("\t").append(list.get(i).getSal()).append("\t").append(list.get(i).getSal()).append("\t").append(list.get(i).getJob())
			.append("\n");
		}//end for
		output.append("----------------------------------------------------------------------------------------------------------------------\n");
		output.append("��ü [").append(list.size()).append("��] ��ȸ");
		}//end else
		
		JTextArea jta = new JTextArea(20,50);
		JScrollPane jsp = new JScrollPane(jta);
		jta.append(output.toString());
		JOptionPane.showMessageDialog(null, jsp);
	}//UseWorkPreparedStatementDAO
	
	public void searchAll() throws SQLException{
		WorkPreparedStatementDAO wpsDAO = WorkPreparedStatementDAO.getInstance();
			list = wpsDAO.selectAllEmp();
	}//end searchAll
	
	
	public static void main(String[] args) {
		new UseWorkPreparedStatementDAO();
	}// end main

}
