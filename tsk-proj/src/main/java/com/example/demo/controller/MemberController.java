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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.dto.AddMemberDto;
import com.example.demo.model.entity.MemberEntity;
import com.example.demo.model.entity.RoleAgain;
import com.example.demo.repository.MemberRepo;
import com.example.demo.services.MemberServiceImple;
import com.example.demo.services.RoleServiceImpl;

@Controller
@RequestMapping("/member")
@SessionAttributes("roles")
public class MemberController {
	@Autowired
	RoleServiceImpl rolim;
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
	public AddMemberDto inserMem(@RequestBody AddMemberDto dto ) {
		 AddMemberDto saveNewMember = this.membrim.saveNewMember(dto);
		 return saveNewMember;
	}
	
	@PutMapping("/edit/{id}")
	@ResponseBody
	public void editMem(@RequestBody MemberEntity mem, @PathVariable("id") 
							long id) {
		
		this.membrim.update(mem, id);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public void deleteMem(@PathVariable("id") long id) {
		
		this.membrim.delete(id);
		 
	}
	
//	@GetMapping("/getrole/{id}")
//	@ResponseBody
//	public MemberEntity getrole(@PathVariable("id") long id) {
//		
//		MemberEntity mem = this.membrim.getMemberById(id);
//		return mem;
//	}
	
	@GetMapping("/getall")
	@ResponseBody
	public List<MemberEntity> getallmem(){
		
		List<MemberEntity> allmem = this.membrim.getAllMember();
		

	    return allmem;
	}
	
	 @ModelAttribute("roles")
	    public List<RoleAgain> initializeProfiles() {
	        return rolim.getAllRole();
	    }
	 
}
