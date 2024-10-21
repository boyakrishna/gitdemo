package com.bootdemos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootdemos.entities.Login;
@Repository
public interface Loginrepositary extends JpaRepository<Login,Integer>{

}
