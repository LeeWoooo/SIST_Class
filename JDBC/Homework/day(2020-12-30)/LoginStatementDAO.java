package day1230;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginStatementDAO {

	private static LoginStatementDAO lDAO;

	private LoginStatementDAO() {
	}// LoginDAO

	public static LoginStatementDAO getInstance() {
		if (lDAO == null) {
			lDAO = new LoginStatementDAO();
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
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pwd = "tiger";
		try {
			con = DriverManager.getConnection(url, db_id, db_pwd);
			// 3. query ���� ��ü ���
			stmt = con.createStatement();
			// 4. query ���� �� ��� ���
			StringBuilder selectId = new StringBuilder();
			selectId.append(" SELECT NAME ").append(" FROM TEST_LOGIN ").append(" WHERE id='").append(id)
					.append("' AND PASS='").append(passwd).append("'");

			rs = stmt.executeQuery(selectId.toString());

			if (rs.next()) {
				name = rs.getString("NAME");
			} // end if

		} finally {
			// 5. ���� ����
			if (rs != null) {
				rs.close();
			} // end if
			if (stmt != null) {
				stmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // end fianlly

		return name;
	}

}// class
