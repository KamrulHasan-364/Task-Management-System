package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.demo.entity.MemberEntity;
import com.example.demo.entity.RoleAgain;
import com.example.demo.repository.MemberRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
public class UserRepositoryTest {

	@Autowired
	private MemberRepo memRepo;
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateRoles() {
		RoleAgain roleAgain1 = new RoleAgain("Manager");
		RoleAgain roleAgain2 = new RoleAgain("Officer");
		RoleAgain roleAgain3 = new RoleAgain("Clark");
		
		entityManager.persist(roleAgain1);
		entityManager.persist(roleAgain2);
		entityManager.persist(roleAgain3);
	}
	
	@Test
	public void testCreateNewUserWithOneRole() {
		RoleAgain roleAgain1=entityManager.find(RoleAgain.class, 1);
		MemberEntity memberEntity= new MemberEntity("Abul", "01521205896");
		memberEntity.addrole(roleAgain1);
		memRepo.save(memberEntity);
	}
}
