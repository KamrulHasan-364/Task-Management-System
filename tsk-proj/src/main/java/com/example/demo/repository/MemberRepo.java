package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MemberEntity;



public interface MemberRepo extends JpaRepository <MemberEntity, Long> {
	
}