package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.dto.AddMemberDto;
import com.example.demo.model.entity.MemberEntity;
import com.example.demo.model.entity.MemberRole;
import com.example.demo.repository.MemberRepo;
import com.example.demo.repository.MemberRoleRepo;
import com.example.demo.repository.Rolerepo;

@Service
public class MemberServiceImple implements MemberService {

	@Autowired
	MemberRepo memberep;
	
	@Autowired
	MemberRoleRepo mmRoleRepo;
	
	@Autowired
	Rolerepo roleRepo;
	
	@Override
	public MemberEntity insert(MemberEntity memberEntity) {
		
		return memberep.save(memberEntity);
		
	}
	
	public AddMemberDto saveNewMember(AddMemberDto dto) {
		MemberEntity me = getFromDto(dto);
		me = insert(me);
		
		final Long meId = me.getMemberID();
		
		dto.getRoles()
		   .parallelStream()
		   .map(it->new MemberRole().setMemberId(meId).setRoleId(it))
		   .forEach(it->mmRoleRepo.save(it));
		
		return dto;
	}
	
	private MemberEntity getFromDto(AddMemberDto dto) {
		MemberEntity me = new MemberEntity();
		me.setMemberName(dto.getMemberName());
		me.setMemberPhone(dto.getMemberPhone());
		
		return me;
	}

	@Override
	public void update(MemberEntity memberEntity, long id) {
		
		MemberEntity m = memberep.findById(1l).get();
		// TODO Auto-generated method stub
		memberEntity.setMemberID(id);
		this.memberep.save(memberEntity);	
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		this.memberep.deleteById(id);
		
	}

//	@Override
//	public MemberEntity getMemberByName(String membername) {
//		// TODO Auto-generated method stub
//		MemberEntity findByName = this.memberep.findByMemberName(membername);
//		return findByName;
//	}
//
//	@Override
//	public MemberEntity getMemberById(long id) {
//		// TODO Auto-generated method stub
//		MemberEntity findById = this.memberep.findById(id);
//		return findById;
//	}

	@Override
	public List<MemberEntity> getAllMember() {
		// TODO Auto-generated method stub
		
		List<MemberEntity> findAll = this.memberep.findAll();
		return findAll;
	}

//	@Override
//	public List<MemberEntity> getMemberByRoleId(long roleid) {
//		// TODO Auto-generated method stub
//		List<MemberEntity> memberByRoleId = this.memberep.getMemberByRoleId(roleid);
//		return memberByRoleId;
//	}

}
