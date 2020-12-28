package day1228.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementCRUD {

	public void insertForm() throws SQLException {
		// 1. ����̺꿬��
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // end catch
		// 2. ���� ��ü ���
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pwd = "tiger";

		Statement stmt = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			// 3. Ŀ�ؼ����� ���� query���� ��ü ���
			stmt = con.createStatement();
			// 4. query���� �� ��� ���
			String insertCP_EMP3 = new StringBuilder("INSERT INTO CP_EMP3 VALUES (").append(2222).append(",'������',")
					.append("SYSDATE,").append(20).append(",'���',").append(3000).append(")").toString();
			stmt.executeUpdate(insertCP_EMP3);
		} finally {
			//5.�������
			if (stmt != null) {
				stmt.close();
			}//end if
			if (con != null) {
				con.close();
			}//end if
		}// end finally
	}//insertForm
	
	public void updateForm() throws SQLException {
		//1. ����̺� ����
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		//2. ���� ��ü ���.
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pwd = "tiger";
		
		Statement stmt = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			//3. Ŀ�ؼǿ��� query ���� ��ü ���.
			stmt = con.createStatement();
			//4. 4. query���� �� ��� ���
			String updateCP_EMP3 = new StringBuilder("UPDATE CP_EMP3 SET ").append("DEPTNO = 50,").append("JOB = '����',").append("SAL = 3200 ")
					.append("WHERE EMPNO = 2222").toString();
			stmt.executeUpdate(updateCP_EMP3);
		}finally {
			//5.���� ����
			if(stmt != null) {
				stmt.close();
			}//end if
			if(con != null) {
				con.close();
			}//end if
		}//end finally
	}//updateForm
	
	
	public void deleteForm() throws SQLException {
		//1.����̺� ����
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end catch
		
		//2. ���� ��ü ���.
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pwd = "tiger";
		
		Statement stmt = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			//3. ���� ��ü���� query���� ��ü ���.
			stmt = con.createStatement();
			//4. query ���� �� ��� ���
			String deleteCP_EMP3 ="DELETE FROM CP_EMP3 WHERE EMPNO = 2222";
			stmt.executeUpdate(deleteCP_EMP3);
		}finally {
			//5.���� ����
			if(stmt !=null) {
				stmt.close();
			}//end if
			if(con != null) {
				con.close();
			}//end if
		}//end finally
		
	}//deleteForm
	
	
}// class
