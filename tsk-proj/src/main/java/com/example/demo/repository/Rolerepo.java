package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RoleAgain;


public interface Rolerepo extends JpaRepository<RoleAgain, Long> {

}
