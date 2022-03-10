package com.example.demo.model.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.entity.MemberEntity;
import com.example.demo.model.entity.RoleAgain;

public class AddMemberDto extends MemberEntity  {

	private List<Long> roleIdList;

	public List<Long> getRoleIdList() {
		return roleIdList;
	}

	public void setRoleIdList(List<Long> roleIdList) {
		this.roleIdList = roleIdList;
	}

	@Override
	public String toString() {
		return "AddMemberDto [roleIdList=" + roleIdList + "]";
	}

	
}
