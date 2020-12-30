package day1229.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * PreparedStatement�� ����Ͽ� query���� �����ϴ� ��
 * 
 * @author owner
 */
public class PreparedStatementDAO {

	private static PreparedStatementDAO psDAO;

	/**
	 * �ܺο��� ��ü������ �� ���� ������
	 */
	private PreparedStatementDAO() {
	}// PreparedStatementDAO

	/**
	 * �ϳ��� �����Ǵ� ��ü�� ��ȯ�ϴ� ��.
	 * 
	 * @return singleton ��ü
	 */
	public static PreparedStatementDAO getInstance() { // lazy init ������ singleton
		if (psDAO == null) {
			psDAO = new PreparedStatementDAO();
		} // end if
		return psDAO;
	}// PreparedStatementDAO

	/**
	 * Ŀ�ؼ��� ��ȯ�ϴ� ���� �ϴ� method
	 * 
	 * @return Connection
	 * @throws SQLException
	 */
	private Connection getConnection() throws SQLException {
		// 1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // end catch
			// 2. Ŀ�ؼ� ���
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pwd = "tiger";
		Connection con = DriverManager.getConnection(url, id, pwd);
		return con;
	}// getConnection

	public void insertCpEmp(CpEmpAddVO ceaVO) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 1. ����̹� �ε�
			// 2. Ŀ�ؼ� ���
			con = getConnection();
			// 3. query ������ü ���
			String insertEmp = "INSERT INTO CP_EMP2 VALUES (?,?,?,?,?,SYSDATE)";
			pstmt = con.prepareStatement(insertEmp);
			// 4. ���ε� ������ ���ֱ�
			pstmt.setInt(1, ceaVO.getEmpno());
			pstmt.setString(2, ceaVO.getEname());
			pstmt.setString(3, ceaVO.getJob());
			pstmt.setInt(4, ceaVO.getSal());
			pstmt.setInt(5, ceaVO.getComm());
			// 5. query ���� �� ��� ���
			pstmt.executeUpdate(); // query���� ������ �� query���� �Ű������� ���� �ʴ´�.
		} finally {
			// 6. ���� ����
			if (pstmt != null) {
				pstmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // end finally
	}// insertCpEmp

	public int updateCpEmp(CpEmpModifyVO cemVO) throws SQLException {
		int rowCnt = 0;
		// 1.����̹� �ε�
		// 2.Ŀ�ؼ� ���
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			// 3.query ���� ��ü ���.
			String updateEmp = 
			new StringBuilder()
			.append("UPDATE CP_EMP2 ")
			.append("SET JOB=?,SAL=?,COMM=? ")
			.append("WHERE EMPNO = ?").toString();
			pstmt = con.prepareStatement(updateEmp);
			// 4.���ε庯���� �� �ֱ�
			pstmt.setString(1, cemVO.getJob());
			pstmt.setInt(2, cemVO.getSal());
			pstmt.setInt(3, cemVO.getComm());
			pstmt.setInt(4, cemVO.getEmpno());
			// 5.query ���� �� ��� ���
			rowCnt = pstmt.executeUpdate();
		} finally {
			// 6.���� ����
			if (pstmt != null) {
				pstmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // end finally
		return rowCnt;
	}// insertCpEmp

	
	public int deleteCpEmp(int empno) throws SQLException {
		int rowCnt = 0;
		//1.����̹� �ε�
		//2.Ŀ�ؼ� ���
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = getConnection();
			//3.query ���� ��ü ���
			String deleteEmp = "DELETE FROM CP_EMP2 WHERE EMPNO = ?";
			pstmt = con.prepareStatement(deleteEmp);
			//4.���ε� ������ ���ֱ�
			pstmt.setInt(1, empno);
			//5.query ���� �� ��� ���
			rowCnt = pstmt.executeUpdate();
		}finally {
			//6.���� ����
			if(pstmt != null) {
				pstmt.close();
			}//end if
			if(con != null) {
				con.close();
			}//end if
		}// end finally
		return rowCnt;
	}// insertCpEmp
	
//	public static void main(String[] args) {
//		
//		try {
//			PreparedStatementDAO.getInstance().deleteCpEmp(1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public List<CpEmpAllVO> selectAllCpEmp() throws SQLException {

		return null;
	}// insertCpEmp

	public CpEmpOneVO selectOneCpEmp(int empno) throws SQLException {

		return null;
	}// insertCpEmp

}// class
