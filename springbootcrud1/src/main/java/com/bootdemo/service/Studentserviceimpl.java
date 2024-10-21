package com.bootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootdemo.entities.Student;
import com.bootdemo.repositary.Studentrepositary;
@Service
public class Studentserviceimpl implements Studentservice{
	@Autowired
	private Studentrepositary sr;
	public Studentserviceimpl(Studentrepositary sr) {
		super();
		this.sr = sr;
	}

	@Override
	public String addStudent(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		return "inserted";
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> sl=sr.findAll();
		return sl;
	}

	@Override
	public String UpdStudent(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		return "updated";
	}

	@Override
	public String delStudent(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		return "deleted";
	}

}
