package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.MemberEntity;
import com.example.demo.entity.RoleAgain;
import com.example.demo.services.MemberService;
import com.example.demo.services.RoleService;

@SpringBootTest
class TskProjApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	private @Autowired RoleService rs;
	
//	@Test
//	public void tesSaveRole() {
//		RoleAgain ob = rs.saveToDb();
//		assertNotNull(ob);
//	}
	
	private @Autowired MemberService ms;
	

	
	
	

}
