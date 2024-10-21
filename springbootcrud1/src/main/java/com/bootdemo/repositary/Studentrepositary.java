package com.bootdemo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootdemo.entities.Student;
@Repository
public interface Studentrepositary extends JpaRepository<Student,Integer>{

}
