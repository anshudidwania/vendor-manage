package com.manage.vendor.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.manage.vendor.user.vo.UserVO;


@Entity
@Table(name = "USER_MASTER")
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_ID")
    private Long id;
	
	@Column(name = "FIRST_NAME")
	private String fName;
	
	@Column(name = "LAST_NAME")
	private String lName;
	
	public User(){
		
	}
	
	public User(UserVO vo) {
		super();
		//this.id = vo.getId();
		this.fName = vo.getFName();
		this.lName = vo.getlName();
	}
	
	public void update(UserVO vo) {
		this.fName = vo.getFName();
		this.lName = vo.getlName();
	}
	
	public UserVO retrive() {
		UserVO vo = new UserVO();
		vo.setId(this.id);
		vo.setFName(this.fName);
		vo.setlName(this.lName);
		return vo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	

}
