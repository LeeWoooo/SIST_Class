package day1228;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementCRUD {

	public void insertProcess(CPDeptVO cdVO) throws SQLException {
		// 1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // end catch
		// 2. �ε��� ����̹��� ����Ͽ� connection ���.
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pwd = "tiger";
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			// 3. connection���� ���� query�� ���� ��ü ���
			stmt = con.createStatement();
			// 4. query�� ���� �� ��� ���.
			String insertQuery = new StringBuilder("INSERT INTO CP_DEPT VALUES (").append(cdVO.getDeptno()).append(",'")
					.append(cdVO.getDname()).append("','").append(cdVO.getLoc()).append("')").toString();
			stmt.executeUpdate(insertQuery);
		} finally {
			// 5 ���� ����
			if (stmt != null) {
				stmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // end finally

	}// insertProcess

	public int updateProcess(CPDeptVO cdVO) throws SQLException {
		int rowCnt = 0;

		// 1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		Statement stmt = null;
		try {
			// 2. Ŀ�ؼ� ���
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pwd = "tiger";

			con = DriverManager.getConnection(url, id, pwd);
			// 3. ������ ���� ��ü ���
			stmt = con.createStatement();
			// 4. ������ ���� �� ��� ���
			String updateCP_DEPT = new StringBuilder("UPDATE CP_DEPT SET DNAME ='").append(cdVO.getDname())
					.append("',LOC = '").append(cdVO.getLoc()).append("' WHERE DEPTNO =").append(cdVO.getDeptno())
					.toString();

			rowCnt = stmt.executeUpdate(updateCP_DEPT);
		} finally {
			// 5. ���� ����
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}

		return rowCnt;
	}// updateProcess

	public int deleteProcess(int deptno) throws SQLException {
		int rowCnt = 0;

		// 1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2. Ŀ�ؼ� ���
		Connection con = null;
		Statement stmt = null;

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pwd = "tiger";

		try {
			con = DriverManager.getConnection(url, id, pwd);
			// 3. ������ ���� ��ü ���
			stmt = con.createStatement();
			// 4. ������ ���� �� ��� ���
			String deleteCP_DEPT = new StringBuilder("DELETE FROM CP_DEPT WHERE DEPTNO =").append(deptno).toString();
			rowCnt = stmt.executeUpdate(deleteCP_DEPT);
		} finally {
			// 5. ���� ����
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return rowCnt;
	}// deleteProcess

}// class
