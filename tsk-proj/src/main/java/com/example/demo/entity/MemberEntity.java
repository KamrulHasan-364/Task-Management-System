package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class MemberEntity {
	
	

	public MemberEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public MemberEntity(Long memberID, String memberName, String memberPhone, RoleAgain roleAgain) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long memberID;
	
	@Column
	private String memberName;
	private String memberPhone;
	
	@OneToMany
	@JoinColumn(name="id", nullable=false)
	private RoleAgain roleAgain;
	

	public Long getMemberID() {
		return memberID;
	}



	public void setMemberID(Long memberID) {
		this.memberID = memberID;
	}



	public String getMemberName() {
		return memberName;
	}



	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}



	public String getMemberPhone() {
		return memberPhone;
	}



	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}



	public RoleAgain getRoleAgain() {
		return roleAgain;
	}



	public void setRoleAgain(RoleAgain roleAgain) {
		this.roleAgain = roleAgain;
	}
	
	

//	public Long getRoleId() {
//		return roleId;
//	}
//
//
//
//	public void setRoleId(Long roleId) {
//		this.roleId = roleId;
//	}



	
	
}
