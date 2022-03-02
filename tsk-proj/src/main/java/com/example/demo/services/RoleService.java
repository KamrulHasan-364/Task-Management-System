package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RoleAgain;
import com.example.demo.repository.Rolerepo;

@Service
public class RoleService {

	@Autowired
	private Rolerepo  rolerep;
	
	public RoleAgain saveToDb() {

		RoleAgain rolen = new RoleAgain();
		rolen.setName("Manager");
		
		rolen = rolerep.save(rolen);
		System.out.println(rolen.toString());
		
		return rolen;
	}
}
