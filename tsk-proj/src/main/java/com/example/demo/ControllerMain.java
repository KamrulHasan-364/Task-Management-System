package com.example.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.MemberEntity;
import com.example.demo.model.entity.RoleAgain;
import com.example.demo.repository.MemberRepo;
import com.example.demo.repository.Rolerepo;

//@RestController
public class ControllerMain {

//	@Autowired
//	Rolerepo roleRepo;
//	
//	@Autowired
//	MemberRepo memberRepo;
//	
//	@RequestMapping("/addrole")
//	public String addrole() {
//		RoleAgain r1= new RoleAgain(); 
//		
//		r1.setName("Clark");
//		
//		roleRepo.save(r1);
//		
//		return "success";
//		
//	}
//	
//	@RequestMapping("/addmember")
//	public String addmember() {
//		List<RoleAgain> l = new ArrayList<RoleAgain>(); 
//		RoleAgain findByName = this.roleRepo.findByName("Manager");
//		RoleAgain findByName2 = this.roleRepo.findByName("Clark");
//		l.add(findByName);
//		l.add(findByName2);
//		MemberEntity m1= new MemberEntity();
//		
//		m1.setMemberName("Kamrul");
//		m1.setMemberPhone("34654654646");
//		
//		m1.setRoles(l);
//		
//		memberRepo.save(m1);
//		
//		return "success";
//		
//	}
//	
	

}
