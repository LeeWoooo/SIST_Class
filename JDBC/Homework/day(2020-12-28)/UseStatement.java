package day1228.work;

import java.sql.SQLException;

public class UseStatement {

	private StatementCRUD stmt;

	public UseStatement() {
		stmt = new StatementCRUD();
	}//UseStatement

	public void addForm() {
		try {
			stmt.insertForm();
			System.out.println("���� �߰� �Ǿ����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���� �߰��� �����Ͽ����ϴ�.");
			e.printStackTrace();
		} // end catch
	}// end addForm

	public void modifyForm() {
		try {
			stmt.updateForm();
			System.out.println("���� ������Ʈ �Ǿ����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���� ������Ʈ�� �����Ͽ����ϴ�.");
			e.printStackTrace();
		} // end catch
	}// modifyForm

	public void removeForm() {
		try {
			stmt.deleteForm();
			System.out.println("���� ���� �Ǿ����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���� ������ �����Ͽ����ϴ�.");
			e.printStackTrace();
		} // end catch
	}// end removeForm

	public static void main(String[] args) {

		UseStatement us = new UseStatement();
//		us.addForm();
//		us.modifyForm();
		us.removeForm();
	}// main

}// class
