package com.sist.exam07;

public class BookDAO {
	
	private final int cnt;
	private final Book book;
	

	public BookDAO(Book book, int cnt) {
		super();
		this.book = book;
		this.cnt = cnt;
	}
	
	public void insertBook() {
		System.out.println("����" + book +"�� " +cnt+"�� ����Ͽ����ϴ�.");
	}

	
}
