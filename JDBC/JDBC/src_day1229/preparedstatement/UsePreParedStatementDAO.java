package day1229.preparedstatement;

import java.sql.SQLException;

public class UsePreParedStatementDAO {

	public void addEmp() {
		CpEmpAddVO ceaVO = new CpEmpAddVO(1111, "�̿��", "������", 5000, 5000);
		PreparedStatementDAO psdao = PreparedStatementDAO.getInstance();
		try {
			psdao.insertCpEmp(ceaVO);
			System.out.println(ceaVO.getEmpno() + "�� ��� �����߰� ����");
		} catch (SQLException e) {
			System.err.println("DB���� ������ �߻��Ͽ����ϴ�.");
			switch (e.getErrorCode()) {
			case 1438:
				System.out.println("�����ȣ�� 4�ڸ� �Է����ּ���.");
				break;
			case 12899:
				if (e.getMessage().contains("ENAME")) {
					System.out.println("�����ȣ�� 10byte �̳��� �Է����ּ���.");
				} // end if
				if (e.getMessage().contains("JOB")) {
					System.out.println("������ 9byte �̳��� �Է����ּ���.");
				} // end if
			}// end switch
			e.printStackTrace();
		} // end catch
	}// addEmp

	public void modifyEmp() {
		
		CpEmpModifyVO cemVo = new CpEmpModifyVO(1, "�븮", 5500, 6000);
		
		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		try {
			int rowCnt = psDAO.updateCpEmp(cemVo);
			if(rowCnt !=0) {
				System.out.println(cemVo.getEmpno() + "�� ����� ������ ����Ǿ����ϴ�.");
			}else {
				System.out.println(cemVo.getEmpno() + "�� ����� �������� �ʽ��ϴ�.\n�����ȣȮ�ο���");
			}
		} catch (SQLException e) {
			System.err.println("DB �۾� �� ���� �߻�");
			e.printStackTrace();
		}

		
	}// modifyEmp

	public void removeEmp() {

		PreparedStatementDAO psDAO = PreparedStatementDAO.getInstance();
		try {
			int empno = 1111;
			int rowCnt = psDAO.deleteCpEmp(empno);
			if(rowCnt != 0) {
				System.out.println(empno + "�� ����� ������ �����Ǿ����ϴ�.");
			}else {
				System.out.println(empno + "�� ����� �������� �ʽ��ϴ�.\n�����ȣȮ�ο���");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}//end catch
		
	}// removeEmp

	public void searchAllEmp() {

	}// searchAllEmp

	public void searchOneEmp() {

	}// searchOneEmp

	public static void main(String[] args) {
		UsePreParedStatementDAO upsDAO = new UsePreParedStatementDAO();
//		upsDAO.addEmp();
//		upsDAO.modifyEmp();
		upsDAO.removeEmp();
		

	}// main

}// class
