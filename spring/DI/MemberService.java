package com.sist.exam03;

public class MemberService {

	private final UpdateInfo info;

	public MemberService(UpdateInfo info) {
		this.info = info;
	}



	public void update(String memberID) {
		System.out.println(memberID + "�� ������ " + info.getId() + "�� �����Ͽ����ϴ�.");
	}
}
