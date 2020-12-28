package day1224;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DB�� �����ؼ� cconnection ��� �� ����
 * 
 * @author owner
 */
public class Dbconn {

	public Dbconn() {

		// 1. Driver Loading
		try {
			//�ܺ� jar������ eclipse�� ����Ϸ��� build path�� �����Ͽ� ���
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // end catch

		//2. Loading�� Driver�� ����Ͽ� DB���� ���
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id="scott";
		String pass="tiger";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pass);
			System.out.println("DB���� ���� : " + con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		} finally {
//			if(con != null) {
//				try {
//					con.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}//end catch
//			}//end if
//		}// end finally
		
	}// Dbconn

	public static void main(String[] args) {
		new Dbconn();
	}// main

}// class
