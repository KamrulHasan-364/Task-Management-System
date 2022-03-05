package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.MemberEntity;



public interface MemberRepo extends JpaRepository <MemberEntity, Long> {
	@Query("select m from MemberEntity m where m.memberName=:memberName")
	public MemberEntity findByName(@Param("memberName") String memberName);
	
	@Query("select m from MemberEntity m where m.memberID=:memberID")
	public MemberEntity findById(@Param("memberID") long memberID);
	
	@Query("select m from MemberEntity m where m.RoleAgain.id=:roleId")
	public List<MemberEntity> getMemberByRoleId(@Param("roleId") long roleId );
}
