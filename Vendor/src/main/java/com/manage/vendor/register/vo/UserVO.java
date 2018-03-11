package com.manage.vendor.register.vo;

import com.manage.vendor.register.entity.User;

public class UserVO {
	
	private Long id;
	private String fName;
	private String lName;
	
	public UserVO() {
	}
	
	public UserVO(User user) {
		this.id = user.getId();
		this.fName = user.getfName();
		this.lName = user.getlName();
	}
	
	public UserVO(long incrementAndGet, String format) {
		this.id = incrementAndGet;
		this.fName = format;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFName() {
		return fName;
	}
	public void setFName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	
}
