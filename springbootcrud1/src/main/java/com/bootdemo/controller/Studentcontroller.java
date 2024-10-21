package com.bootdemo.controller;

import java.util.List;

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

import com.bootdemo.entities.Student;
import com.bootdemo.service.Studentserviceimpl;
@RestController
@RequestMapping("/Studentdemo")
public class Studentcontroller {
	private Studentserviceimpl st;

	public Studentcontroller(Studentserviceimpl st) {
		super();
		this.st = st;
	}
@PostMapping("/addStudent")
public ResponseEntity<String> addStudent(@RequestBody Student s)
{
	st.addStudent(s);
	return new ResponseEntity<>("created",HttpStatus.CREATED);
}
@GetMapping("/Students")
public List<Student> getSudents()
{
	List<Student> sl=st.getStudents();
	return sl;
}
@PutMapping("/updStudent")
public ResponseEntity<String> updStudent(@RequestBody Student s)
{
	st.UpdStudent(s);
	return new ResponseEntity<>("updated",HttpStatus.OK);
}
@DeleteMapping("/delStudent/{id}")
public ResponseEntity<String> delStudent(@PathVariable("id") int id)
{
	st.delStudent(id);
	return new ResponseEntity<>("deleted",HttpStatus.ACCEPTED);	
}

}
