package day210104;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColumnViewDAO {

	private static ColumnViewDAO cvDAO;

	private ColumnViewDAO() {
	}

	public static ColumnViewDAO getInstance() {
		if (cvDAO == null) {
			cvDAO = new ColumnViewDAO();
		} // end if
		return cvDAO;
	}// getInstance

	private Connection getConnection() throws SQLException {
		// 1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2. Ŀ�ؼ� ���
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pwd = "tiger";

		Connection con = DriverManager.getConnection(url, id, pwd);

		return con;
	}// getConnection

	public List<String> selectAllTablename() throws SQLException {
		List<String> list = new ArrayList<String>();

		// 1.����̹� �ε�
		// 2.Ŀ�ؼ� ���
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			// 3. query ���� ��ü ���
			String selectTable = "SELECT TNAME FROM TAB";
			pstmt = con.prepareStatement(selectTable);
			// 4. ���ε� ���� ���ֱ�
			// 5. query ���� �� ������
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("TNAME"));
			} // end while
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		} // end finally

		return list;
	}// selectAllTablename

	public List<ColumnVO> selectOneTable(String tableName) throws SQLException {
		List<ColumnVO> list = new ArrayList<ColumnVO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 1.
			// 2.
			con = getConnection();
			// 3.
//			String selectTable = "SELECT * FROM ?"; //���̺� ���� ���ε� ����(?)�� ó���� �� ����.
//			���̺� ���̳� column���� ���ε� ������ ������� �ʰ� query���� ���� �־� �ڵ��Ѵ�.
			StringBuilder selectTable = new StringBuilder();
			selectTable.append(" SELECT * FROM ").append(tableName);

			pstmt = con.prepareStatement(selectTable.toString());
			// 4.
//			pstmt.setString(1, tableName);
			// 5.
			rs = pstmt.executeQuery();
//			ResultSetMetaData�� ���
			ResultSetMetaData rsmd = rs.getMetaData();
			
			ColumnVO cVO = null;
			for(int i = 1; i<=rsmd.getColumnCount(); i ++) {
				cVO=new ColumnVO(rsmd.getColumnName(i), rsmd.getColumnTypeName(i), rsmd.getPrecision(i),rsmd.isNullable(i));
				list.add(cVO);
//			System.out.println(rsmd.getColumnName(i));
//			System.out.println(rsmd.getColumnType(i));
//			System.out.println(rsmd.getPrecision(i));
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		} // end finally
		return list;
	}// selectOneTable

//	public static void main(String[] args) {
//		try {
//			System.out.println(ColumnViewDAO.getInstance().selectOneTable("EMP"));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}// class
