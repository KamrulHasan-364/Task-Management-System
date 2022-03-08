package com.example.demo.model.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class MemberEntity {
	
	

	


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long memberID;
	
	@Column
	private String memberName;
	@Column
	private String memberPhone;

	public MemberEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberEntity(String memberName, String memberPhone) {
		super();
		
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	
	}

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

	@Override
	public String toString() {
		return "MemberEntity [memberID=" + memberID + ", memberName=" + memberName + ", memberPhone=" + memberPhone
				+ ".";
	}
	
	
	
	



	
	
}
