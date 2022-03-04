package com.example.demo.entity;

import java.util.HashSet;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	
	


	public MemberEntity(String memberName, String memberPhone) {
		super();
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}

	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name="member_role",
				joinColumns = @JoinColumn(name="memberID"),
				inverseJoinColumns = @JoinColumn(name="id"))
	private Set<RoleAgain> roles = new HashSet<>();

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

	public Set<RoleAgain> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleAgain> roles) {
		this.roles = roles;
	}
	
	public void addrole(RoleAgain role) {
		this.roles.add(role);
	}
	



	
	
}
