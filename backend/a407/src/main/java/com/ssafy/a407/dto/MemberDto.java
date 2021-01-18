package com.ssafy.a407.dto;

public class MemberDto {
	private int gmid;
	private int gid;
	private String email;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int gmid, int gid, String email) {
		super();
		this.gmid = gmid;
		this.gid = gid;
		this.email = email;
	}

	public int getGmid() {
		return gmid;
	}

	public void setGmid(int gmid) {
		this.gmid = gmid;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDto [gmid=" + gmid + ", gid=" + gid + ", email=" + email + "]";
	}
	
	
}
