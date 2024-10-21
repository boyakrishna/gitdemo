package com.bootdemo.service;

import java.util.List;

import com.bootdemo.entities.Student;

public interface Studentservice {
	public String addStudent(Student s);
	public List<Student> getStudents();
	public String UpdStudent(Student s);
	public String delStudent(int id);

}
