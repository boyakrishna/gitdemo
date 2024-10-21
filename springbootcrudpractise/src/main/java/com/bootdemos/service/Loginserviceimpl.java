package com.bootdemos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootdemos.entities.Login;
import com.bootdemos.repository.Loginrepositary;
@Service
public class Loginserviceimpl implements Loginservice {
	@Autowired
	private Loginrepositary lu;

	public Loginserviceimpl(Loginrepositary lu) {
		super();
		this.lu = lu;
	}

	@Override
	public String addLogin(Login l) {
		// TODO Auto-generated method stub
		lu.save(l);
		return "inserted";
	}

	@Override
	public List<Login> getLogins() {
		// TODO Auto-generated method stub
		List<Login>us=lu.findAll();
		return us;
	}

	@Override
	public String UpdLogin(Login l) {
		// TODO Auto-generated method stub
		lu.save(l);
		return "updated";
	}

	@Override
	public String delLogin(int lid) {
		// TODO Auto-generated method stub
		lu.deleteById(lid);
		return "deleted";
	}

}
