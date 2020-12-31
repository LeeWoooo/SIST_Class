package day1231;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	private static LoginDAO lDAO;

	private LoginDAO() {
	}// LoginDAO

	public static LoginDAO getInstance() {
		if(lDAO == null) {
			lDAO = new LoginDAO();
		}//end if
		return lDAO;
	}// getInstance

	// �α��ο� ������ �̸��� ��ȯ�Ѵ�,
	public String login(String id, String pwd) throws SQLException {
		String name = "";
		// id,pwd ��ȿ�� �˻�
		id = id.replaceAll("'", "").replaceAll(" ", "").replaceAll("-", "");
		pwd = pwd.replaceAll("'", "").replaceAll(" ", "").replaceAll("-", "");

		// 1.����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // end catch
			// 2.Ŀ�ؼ� ���
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String dbid = "scott";
		String dbpwd = "tiger";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, dbid, dbpwd);
			// 3.Ŀ�ؼ����� ���� query�� ���� ��ü ���
			StringBuilder loginQuery = new StringBuilder();
			loginQuery
			.append(" SELECT NAME ")
			.append(" FROM TEST_LOGIN " )
			.append(" WHERE ID = ? AND PASS = ? ");
			pstmt = con.prepareStatement(loginQuery.toString());
			// 4.���ε� ������ ���ֱ�
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			// 5.query���� �� ������.
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				name = rs.getString("NAME");
			}//end if
			
		} finally {
			// 6.���� ����
			if (rs != null) {
				rs.close();
			} // end close
			if (pstmt != null) {
				pstmt.close();
			} // end close
			if (con != null) {
				con.close();
			} // end close
		} // end finally

		return name;
	}//login
	
//	public static void main(String[] args) {
//		LoginDAO lDAO = LoginDAO.getInstance();
//		
//		try {
//			String temp = lDAO.login("lee","123");
//			System.out.println(temp);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}// class
