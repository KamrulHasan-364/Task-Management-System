package com.example.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MemberRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private Long roleId;

	@Column
	private Long memberId;

	public Long getId() {
		return id;
	}

	public MemberRole setId(Long id) {
		this.id = id;
		return this;
	}

	public Long getRoleId() {
		return roleId;
	}

	public MemberRole setRoleId(Long roleId) {
		this.roleId = roleId;
		return this;
	}

	public Long getMemberId() {
		return memberId;
	}

	public MemberRole setMemberId(Long memberId) {
		this.memberId = memberId;
		return this;
	}

	@Override
	public String toString() {
		return "MemberRole [id=" + id + ", roleId=" + roleId + ", memberId=" + memberId + "]";
	}

}
