package com.bootdemos.service;

import java.util.List;

import com.bootdemos.entities.Login;

public interface Loginservice {
	public String  addLogin(Login l);
	public List<Login> getLogins();
	public String UpdLogin(Login l);
	public String delLogin(int lid);
	

}
