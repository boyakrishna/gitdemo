package com.bootdemos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootdemos.entities.Login;
import com.bootdemos.service.Loginserviceimpl;
@RestController
@RequestMapping("/logindemo")
public class Logincontroller {
	@Autowired
	private Loginserviceimpl lt;

	public Logincontroller(Loginserviceimpl lt) {
		super();
		this.lt = lt;
	}
@PostMapping("/addlogin")
public ResponseEntity<String> addlogin(@RequestBody Login l)
{
	lt.addLogin(l);
	return new ResponseEntity<>("created",HttpStatus.CREATED);
}
@GetMapping("/users")
public List<Login> getLogins()
{
	List<Login>us=lt.getLogins();
	return us;
}
@PutMapping("/updlogin")
public ResponseEntity<String>updlogin(@RequestBody Login l)
{
	lt.UpdLogin(l);
	return new ResponseEntity<>("updated",HttpStatus.OK);
}
@DeleteMapping("/dellogin/{lid}")
public ResponseEntity<String>dellogin(@PathVariable("lid") int lid)
{
	lt.delLogin(lid);
	return new ResponseEntity<>("deleted",HttpStatus.ACCEPTED);
}
}
