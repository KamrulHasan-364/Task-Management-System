package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.MemberEntity;
import com.example.demo.model.entity.MemberRole;
import com.example.demo.model.entity.RoleAgain;
import com.example.demo.repository.MemberRoleRepo;
import com.example.demo.repository.Rolerepo;

@Service
public class RoleServiceImpl  {

	@Autowired
	Rolerepo rolrep;

	
	public List<RoleAgain> getAllRole() {
		// TODO Auto-generated method stub
		List<RoleAgain> findAll = this.rolrep.findAll();
		return findAll;
	}

	
	public RoleAgain insert(RoleAgain roleAgain) {
		// TODO Auto-generated method stub
		RoleAgain save = this.rolrep.save(roleAgain);
		return save;
	}

	
	
	
	
	
	
	
	
	
	
	
	
//	public RoleAgain getRole(long roleid) {
//		// TODO Auto-generated method stub
//
//		RoleAgain byId = this.rolrep.getById(roleid);
//		return byId;
//	}



}
