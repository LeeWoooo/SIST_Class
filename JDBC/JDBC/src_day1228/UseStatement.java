package day1228;

import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * Statement�� ����� CRUD
 * 
 * @author owner
 */
public class UseStatement {

	private StatementCRUD stmtCRUD;

	public UseStatement() {
		stmtCRUD = new StatementCRUD();
	}

	public void addForm() {
		String csvData = JOptionPane.showInputDialog("�μ������߰� \n �Է� ex) �μ���ȣ,�μ���,��ġ");
		// ,�� ���еǾ� �Էµ� ���� �и��Ѵ�
		String[] processData = csvData.split(",");

		// �Էµ� ���� DBMS�� insert�ϱ� ���� �Է°��� VO�� �����Ѵ�.
		CPDeptVO cdVO = new CPDeptVO(Integer.parseInt(processData[0]), processData[1], processData[2]);

		try {
			stmtCRUD.insertProcess(cdVO);// �Էµ� ���� ��� ������ �ִ� VO�� �Է�.
			System.out.println(cdVO.getDeptno() + "�� �μ����� �߰� ����");
		} catch (SQLException e) { // method�ȿ��� �߻��ϴ� ��� ���ܸ� ��Ƽ� ó�� �� ���ִ�.
			System.out.println(cdVO.getDeptno() + "�� �μ����� �߰� ����");
			// SQLException�� error�ڵ带 �پ��ϰ� ��ȯ�Ѵ�.
			switch (e.getErrorCode()) {
			case 1:
				System.out.println("���� �μ� ��ȣ�� �����մϴ�.");
				break;
			case 1400:
				System.out.println("�μ����� �ݵ�� �Է��ؾ� �մϴ�.");
				break;
			case 1438:
				System.out.println("�μ���ȣ�� ���� 2�ڸ� �Դϴ�.");
				break;
			case 12899:
				System.out.println("�μ����̳� ��ġ�� ���ڼ��� Ȯ�����ּ���.\n�μ��� : 14byte ��ġ: 13byte");
				break;
			}
			e.printStackTrace();
		} // end catch

	}// insert

	public void modifyForm() {

		String csvData = JOptionPane.showInputDialog("�μ���������\n�μ���ȣ�� ��ġ�ϴ� �μ��� �μ���� ��ġ ���� \n�Է� ex) �μ���ȣ,�μ���,��ġ");
		// ,�� ���еǾ� �Էµ� ���� �и��Ѵ�
		String[] processData = csvData.split(",");

		// �Էµ� ���� DBMS�� insert�ϱ� ���� �Է°��� VO�� �����Ѵ�.
		CPDeptVO cdVO = new CPDeptVO(Integer.parseInt(processData[0]), processData[1], processData[2]);

		try {
			int cnt = stmtCRUD.updateProcess(cdVO);

			if (cnt == 0) {
				System.out.println(cdVO.getDeptno() + "�� �μ������� �������� �ʾҽ��ϴ�.\n�μ���ȣ�� Ȯ�����ּ���.");
			} else {
				System.out.println(cdVO.getDeptno() + "�� �μ������� �����Ǿ����ϴ�.");
			}
		} catch (SQLException e) {
			System.err.println("DB�۾� �� ���� �߻�");
			switch (e.getErrorCode()) {
			case 1400:
				System.out.println("�μ����� �ݵ�� �Է��ؾ� �մϴ�.");
				break;
			case 12899:
				System.out.println("�μ����̳� ��ġ�� ���ڼ��� Ȯ�����ּ���.\n�μ��� : 14byte ��ġ: 13byte");
				break;
			}
			e.printStackTrace();
		} // end catch

	}// updateForm

	public void removeForm() {
		String inputData = JOptionPane.showInputDialog("�μ���������\n�μ���ȣ�� ��ġ�ϴ� �μ��� ������ �����մϴ�. \nex) �μ���ȣ");

		int deptno = Integer.parseInt(inputData);
		try {
			int cnt = stmtCRUD.deleteProcess(deptno);
			if (cnt != 0) {
				System.out.println(deptno + "�� �μ������� �����Ǿ����ϴ�.");
			} else {
				System.out.println(deptno + "�� �μ������� �������� �ʾҽ��ϴ�.");
			}
		} catch (SQLException e) {
			System.err.println("DB�۾� �� ���� �߻�");
			e.printStackTrace();
		} // end catch
	}// removeForm

	public static void main(String[] args) {
		UseStatement us = new UseStatement();
//		us.addForm();
//		us.modifyForm();
		us.removeForm();
	}// main

}// class
