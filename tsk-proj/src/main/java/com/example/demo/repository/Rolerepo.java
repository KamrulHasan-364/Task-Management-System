package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.entity.RoleAgain;


public interface Rolerepo extends JpaRepository<RoleAgain, Long> {

	public RoleAgain findByName(String name); 
	
}
