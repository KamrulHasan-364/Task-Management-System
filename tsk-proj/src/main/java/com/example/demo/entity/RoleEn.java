package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table
//@EntityListeners(AuditingEntityListener.class)
public class RoleEn {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String roleName;
	public RoleEn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoleEn(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	public Long getid() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "RoleEn [id=" + id + ", roleName=" + roleName + "]";
	}
	
	

}
