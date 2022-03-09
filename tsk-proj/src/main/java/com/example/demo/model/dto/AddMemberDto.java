package com.example.demo.model.dto;

import java.util.List;

import com.example.demo.model.entity.MemberEntity;

public class AddMemberDto extends MemberEntity  {

	
	private Long roleId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	
}
