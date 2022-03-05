package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RoleAgain;
import com.example.demo.repository.Rolerepo;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	Rolerepo rolrep;
	
	@Override
	public void insert(RoleAgain roleAgain) {
		// TODO Auto-generated method stub
		this.rolrep.save(roleAgain);
	}

	@Override
	public void update(RoleAgain roleAgain, long roleid) {
		// TODO Auto-generated method stub
		roleAgain.setId(roleid);
		this.rolrep.save(roleAgain);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		this.rolrep.deleteById(id);
	}

	@Override
	public RoleAgain getRoleByName(String rolename) {
		// TODO Auto-generated method stub
		RoleAgain findByName = this.rolrep.findByName(rolename);
		return findByName;
	}

	@Override
	public RoleAgain getRole(long roleid) {
		// TODO Auto-generated method stub
		
		RoleAgain byId = this.rolrep.getById(roleid);
		return byId;
	}

	@Override
	public List<RoleAgain> getAllRole() {
		// TODO Auto-generated method stub
		List<RoleAgain> findAll = this.rolrep.findAll();
		return findAll;
	}

	
}