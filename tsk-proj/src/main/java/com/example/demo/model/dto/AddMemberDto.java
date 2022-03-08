package com.example.demo.model.dto;

import java.util.List;

import com.example.demo.model.entity.MemberEntity;

public class AddMemberDto extends MemberEntity {

	private List<Long> roles;

	public List<Long> getRoles() {
		return roles;
	}

	public void setRoles(List<Long> roles) {
		this.roles = roles;
	}
}
