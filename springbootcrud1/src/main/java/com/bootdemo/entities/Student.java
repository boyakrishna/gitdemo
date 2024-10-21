package com.bootdemo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	@Column
	private String sname,mailid;
	public Student()
	{
		
	}
    public Student(int id, String sname, String mailid) {
		super();
		this.id= id;
		this.sname = sname;
		this.mailid = mailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", mailid=" + mailid + "]";
	}
    
	

}
