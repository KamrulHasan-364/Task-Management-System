package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.MemberEntity;
import com.example.demo.entity.RoleAgain;
import com.example.demo.repository.MemberRepo;
import com.example.demo.services.MemberServiceImple;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberServiceImple membrim;
	
	@RequestMapping("/memberform")
	public String memberform() {
		
		return "memberform";
	}
	
	@RequestMapping("/edit")
	public String editform() {
		
		return "editformem";
	}
	
	@RequestMapping("/membertable")
	public String memtable() {
		
		return "membertable";
	}
	
	@PostMapping("/savemem")
	@ResponseBody	
	public void inserRole(@ModelAttribute("mem")MemberEntity mem ) {
		
		this.membrim.insert(mem);
	}
	
	@PutMapping("/edit/{id}")
	@ResponseBody
	public void editRole(@ModelAttribute("mem")MemberEntity mem, @PathVariable("id") 
							long id) {
		
		this.membrim.update(mem, id);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public void deleteRole(@PathVariable("id") long id) {
		
		this.membrim.delete(id);
		 
	}
	
	@GetMapping("/getrole/{id}")
	@ResponseBody
	public MemberEntity getrole(@PathVariable("id") long id) {
		
		MemberEntity mem = this.membrim.getMemberById(id);
		return mem;
	}
	
	@GetMapping("/getall")
	@ResponseBody
	public List<MemberEntity> getallmem(){
		
		List<MemberEntity> allmem = this.membrim.getAllMember();
		return allmem;
	}
	
}
