package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MemberEntity;
import com.example.demo.entity.RoleAgain;
import com.example.demo.repository.MemberRepo;

@Service
public class MemberService {

	@Autowired
	private MemberRepo memberRepo;
	
	
	public MemberEntity saveToDb() {
		
		
		MemberEntity memberEntity = new MemberEntity();
		
		memberEntity.setMemberName("Kamrul Hasan");
		memberEntity.setMemberPhone("01521205896");
		
//		memberEntity.setRoleId(1l);
		
		memberEntity=memberRepo.save(memberEntity);
		
		return memberEntity;
	}
}
