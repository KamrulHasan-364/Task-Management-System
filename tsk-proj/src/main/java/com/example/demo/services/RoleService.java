package com.example.demo.services;

import java.util.List;

import com.example.demo.model.entity.RoleAgain;

public interface RoleService {

	public RoleAgain insert(RoleAgain roleAgain);
		
	public void update(RoleAgain roleAgain, long roleid);
	
	public void delete (long id);
	public RoleAgain getRoleByName(String rolename);
	
	public RoleAgain getRole(long roleid);
	public List<RoleAgain> getAllRole();
}
