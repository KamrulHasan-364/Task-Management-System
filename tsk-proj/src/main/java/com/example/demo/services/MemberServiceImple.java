package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MemberEntity;
import com.example.demo.repository.MemberRepo;

@Service
public class MemberServiceImple implements MemberService {

	@Autowired
	MemberRepo memberep;
	@Override
	public void insert(MemberEntity memberEntity) {
		// TODO Auto-generated method stub
		this.memberep.save(memberEntity);
		
	}

	@Override
	public void update(MemberEntity memberEntity, long id) {
		// TODO Auto-generated method stub
		memberEntity.setMemberID(id);
		this.memberep.save(memberEntity);	
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		this.memberep.deleteById(id);
		
	}

	@Override
	public MemberEntity getMemberByName(String membername) {
		// TODO Auto-generated method stub
		MemberEntity findByName = this.memberep.findByName(membername);
		return findByName;
	}

	@Override
	public MemberEntity getMemberById(long id) {
		// TODO Auto-generated method stub
		MemberEntity findById = this.memberep.findById(id);
		return findById;
	}

	@Override
	public List<MemberEntity> getAllMember() {
		// TODO Auto-generated method stub
		
		List<MemberEntity> findAll = this.memberep.findAll();
		return findAll;
	}

	@Override
	public List<MemberEntity> getMemberByRoleId(long roleid) {
		// TODO Auto-generated method stub
		List<MemberEntity> memberByRoleId = this.memberep.getMemberByRoleId(roleid);
		return memberByRoleId;
	}

}
