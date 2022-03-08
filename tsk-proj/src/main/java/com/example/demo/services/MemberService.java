package com.example.demo.services;

import java.util.List;

import com.example.demo.model.entity.MemberEntity;



public interface MemberService {


	public MemberEntity insert (MemberEntity memberEntity);
	
	public void update(MemberEntity memberEntity, long id);
	
	public void delete (long id);
//	public MemberEntity getMemberByName(String membername);
	
//	public MemberEntity getMemberById(long id);
	
	public List<MemberEntity> getAllMember();
	
//	public  List<MemberEntity> getMemberByRoleId(long roleid);
}
