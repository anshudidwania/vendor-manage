package com.manage.vendor.register.vo;

public class UserVO {
	
	private Long id;
	private String fname;
	private String lName;
	
	public UserVO() {
	}
	
	public UserVO(long incrementAndGet, String format) {
		this.id = incrementAndGet;
		this.fname = format;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	
}
