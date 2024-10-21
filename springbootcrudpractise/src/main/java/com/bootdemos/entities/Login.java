package com.bootdemos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
	@Id
	private int lid;
	@Column
	private String uname,pwd;
	public Login()
	{
		
	}
	public Login(int lid, String uname, String pwd) {
		super();
		this.lid = lid;
		this.uname = uname;
		this.pwd = pwd;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Login [lid=" + lid + ", uname=" + uname + ", pwd=" + pwd + "]";
	}
	

}
