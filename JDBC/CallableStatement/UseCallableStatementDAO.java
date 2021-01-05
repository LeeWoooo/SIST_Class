package day210105;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleTypes;

/**
 * procedure�� ����� CRUD
 * 
 * @author owner
 */
public class UseCallableStatementDAO {

	private static UseCallableStatementDAO ucsDAO;

	private UseCallableStatementDAO() {
	}

	public static UseCallableStatementDAO getInstance() {
		if (ucsDAO == null) {
			ucsDAO = new UseCallableStatementDAO();
		} // end if
		return ucsDAO;
	}// UseCallableStatementDAO

	private Connection getConnection() throws SQLException {
		Connection con = null;

		// 1.����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // end catch

		// 2. Ŀ�ؼǾ��
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pwd = "tiger";
		con = DriverManager.getConnection(url, id, pwd);

		return con;
	}// end getConnection

	public void insertTestProc() throws SQLException {
		Connection con = null;
		CallableStatement cstmt = null;
		// 1.
		// 2.
		int empno = 261;
		String ename = "�̿��";
		int SAL = 3000;
		try {
			con = getConnection();
			// 3.query���� ��ü ���
			cstmt = con.prepareCall("{ CALL INSERT_PROC(?,?,?,?,?)}");
			// 4. ���ε� ������ ���ֱ�
			// in parameter : Procedure�� �Է°� ����
			cstmt.setInt(1, empno);
			cstmt.setString(2, ename);
			cstmt.setInt(3, SAL);
			// out parameter : Procedure�� ó���� ������� �ޱ� ���� ����
			cstmt.registerOutParameter(4, Types.NUMERIC);
			cstmt.registerOutParameter(5, Types.VARCHAR);
			// 5. query���� : Procedure ȣ��
			cstmt.execute();
			// 6. out parameter �� �ޱ�.
			int cnt = cstmt.getInt(4);
			String msg = cstmt.getString(5);
			System.out.println(cnt + msg);
		} finally {
			// 7. ���� ����
			if (cstmt != null) {
				cstmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // finally

	}// insertTestProc

	public int updateTestProc() throws SQLException {
		int cnt = 0;
		Connection con = null;
		CallableStatement cstmt = null;
		// 1.
		// 2.
		int empno = 261;
		String ename = "���";
		int sal = 3500;
		try {
			con = getConnection();
			// 3. query ���� ��ü ���
			cstmt = con.prepareCall("{ CALL UPDATE_PROC(?,?,?,?,?) }");
			// 4. ���ε� ������ �� �ֱ�
			// in parameter
			cstmt.setInt(1, empno);
			cstmt.setString(2, ename);
			cstmt.setInt(3, sal);
			// out parameter
			cstmt.registerOutParameter(4, Types.NUMERIC);
			cstmt.registerOutParameter(5, Types.VARCHAR);
			// 5. query�� ���� : Procedure ����
			cstmt.execute();
			// 6. out parameter �� �ޱ�
			cnt = cstmt.getInt(4);
			String msg = cstmt.getString(5);
			System.out.println("Procedure���� ���� ��");
			System.out.println(cnt + "/" + msg);
		} finally {
			// 7. ���� ����
			if (cstmt != null) {
				cstmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // finally
		return cnt;
	}// updateTestProc

	public int deleteTesetProc() throws SQLException {
		int cnt = 0;
		Connection con = null;
		CallableStatement cstmt = null;
		// 1.
		// 2.
		int empno = 261;
		try {
			con = getConnection();
			// 3.
			cstmt = con.prepareCall("{ CALL DELETE_PROC(?,?,?)}");
			// 4.
			// in parameter
			cstmt.setInt(1, empno);
			// out parameter
			cstmt.registerOutParameter(2, Types.NUMERIC);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			// 5.
			cstmt.execute();
			// 6.
			cnt = cstmt.getInt(2);
			String msg = cstmt.getString(3);
			System.out.println("Procedure���� ���� ��");
			System.out.println(cnt + "/" + msg);
		} finally {
			// 7.
			if (cstmt != null) {
				cstmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // end finally

		return cnt;
	}// deleteTesetProc

	public List<ProcedureVO> selectProcedure(String hiredate) throws SQLException {
		List<ProcedureVO> list = new ArrayList<ProcedureVO>();
		// 1.
		// 2.
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			// 3. query ���� ��ü ����
			cstmt = con.prepareCall("{ CALL SELECT_PROC(? ,? ,? )}");
			// 4. ���ε� ������ ���ֱ�
			// in parameter
			cstmt.setString(1, hiredate);

			// out parameter
//			cstmt.registerOutParameter(2, Types.CURSOR); java���� �����ϴ� cursor�� ��� �Ұ�
			// SYS_RREFCURSOR�� �ޱ����� OracleTypes.CURSOR�� ����Ѵ�.
			cstmt.registerOutParameter(2, OracleTypes.CURSOR);
			cstmt.registerOutParameter(3, Types.VARCHAR);

			// 5. query�� ���� : Procedure ����
			cstmt.execute();

			// 6. out parameter�� ���
			rs = (ResultSet) cstmt.getObject(2);
			String msg = cstmt.getString(3);
			System.out.println(msg);

			ProcedureVO pVO = null;
			// 7. ��ȸ ��� ó��
			while (rs.next()) {
				pVO = new ProcedureVO(rs.getInt("DEPTNO"), rs.getString("DNAME"), rs.getString("LOC"),
						rs.getInt("EMPNO"), rs.getString("ENAME"), rs.getString("HIREDATE"));

				list.add(pVO);
			} // end while
		} finally {
			// ���� ����
			if (rs != null) {
				rs.close();
			} // end if
			if (cstmt != null) {
				cstmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // end finally
		return list;
	}// selectProcedure

	public static void main(String[] args) {
		UseCallableStatementDAO ucsDAO = UseCallableStatementDAO.getInstance();
		String hiredate = "1982";
		try {
			List<ProcedureVO> list = ucsDAO.selectProcedure(hiredate);
			if (list.isEmpty()) {
				System.out.println(hiredate);
				System.out.println("�ش� �⵵�� �Ի��� ����� �����ϴ�.");
			}
			for (ProcedureVO pVO : list) {
				System.out.println(pVO.toString());
			} // end for
		} catch (SQLException e) {
			e.printStackTrace();
		} // end catch
	}// main

}// class
