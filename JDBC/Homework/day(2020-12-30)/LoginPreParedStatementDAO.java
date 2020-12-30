package day1230;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPreParedStatementDAO {

	private static LoginPreParedStatementDAO lDAO;

	private LoginPreParedStatementDAO() {
	}// LoginDAO

	public static LoginPreParedStatementDAO getInstance() {
		if (lDAO == null) {
			lDAO = new LoginPreParedStatementDAO();
		} // end if
		return lDAO;
	}// getInstance

	public String login(String id, String passwd) throws SQLException {
		String name = "";
		
		id=id.replaceAll("'", "").replaceAll("-", "").replaceAll(" ", "");
		
		// 1. ����̹� �δ�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. Ŀ�ؼ� ���
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pwd = "tiger";
		try {
			con = DriverManager.getConnection(url, db_id, db_pwd);
			// 3. query ���� ��ü ���
			StringBuilder selectId = new StringBuilder();
			selectId.append(" SELECT NAME ").append(" FROM TEST_LOGIN ")
			.append(" WHERE id=?")
			.append(" AND PASS=?");
			pstmt = con.prepareStatement(selectId.toString());
			// 4. ���ε� ������ �� �ֱ�
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			// 5. query ���� �� ��� ���
			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString("NAME");
			} // end if

		} finally {
			// 5. ���� ����
			if (rs != null) {
				rs.close();
			} // end if
			if (pstmt != null) {
				pstmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // end fianlly

		return name;
	}

}// class
