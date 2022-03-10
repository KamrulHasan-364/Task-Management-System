package com.example.demo.services;

import java.util.ArrayList;
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
public class MemberServiceImple {

	@Autowired
	MemberRepo memberep;

	@Autowired
	MemberRoleRepo mmRoleRepo;

	public MemberEntity insert(MemberEntity memberEntity) {

		return memberep.save(memberEntity);

	}

	public AddMemberDto saveNewMember(AddMemberDto dto) {
		MemberEntity me = getFromDto(dto);
		me = insert(me);

		final Long meId = me.getMemberID();

//		MemberRole mr = new MemberRole().setMemberId(meId).setRoleId(dto.getRoleId());

//		mmRoleRepo.save(mr);

		dto.getRoleIdList()
		   .parallelStream()
		   .map(it -> new MemberRole().setMemberId(meId).setRoleId(it))
		   .forEach(it -> mmRoleRepo.save(it));

		return dto;
	}

	private MemberEntity getFromDto(AddMemberDto dto) {
		MemberEntity me = new MemberEntity();
		me.setMemberName(dto.getMemberName());
		me.setMemberPhone(dto.getMemberPhone());

		return me;
	}

	public List<MemberEntity> getAllMember() {
		// TODO Auto-generated method stub

		List<MemberEntity> findAll = this.memberep.findAll();
		return findAll;
	}

}
