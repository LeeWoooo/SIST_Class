package day210104;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class UseCallableStatement {

	public UseCallableStatement() throws SQLException {

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

		Connection con = null;
		CallableStatement cstmt = null;
		try {
			con = DriverManager.getConnection(url, id,pwd);
			// 3. query���� ��ü ��� (�̸� ������ �� PLUS_PROC�� ȣ���� ���̴�. in 2�� out 1��)
			cstmt = con.prepareCall("{call PLUS_PROC(?,?,?)}");
			// 4. ���ε� ������ �� ���� (in parameter, out parameter)
			//in parameter
			int num1 = 100, num2 = 200;
			cstmt.setInt(1, num1);
			cstmt.setInt(2, num2);
			//out parameter : PL/SQL������ var�� �����ϴ� ���ε� ����
			cstmt.registerOutParameter(3, Types.NUMERIC);
			// 5. Procedure�� ����
			cstmt.execute();
			// 6. out parameter�� ������ �� ���
			int result = cstmt.getInt(3);
			System.out.println(num1 +"+"+num2+"="+result);
		} finally {
			// 7. ���� ����
			if (cstmt != null) {
				cstmt.close();
			} // end if
			if (con != null) {
				con.close();
			} // end if
		} // end finally
	}// UseCallableStatement

	public static void main(String[] args) {
		try {
			new UseCallableStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		} // end catch
	}// main
}// class
