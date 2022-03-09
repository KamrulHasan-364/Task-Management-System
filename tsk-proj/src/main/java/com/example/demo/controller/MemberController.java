package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
import com.example.demo.repository.MemberRoleRepo;
import com.example.demo.services.MemberServiceImple;
import com.example.demo.services.RoleServiceImpl;

@Controller
@RequestMapping("/member")
//@SessionAttributes("roles")
public class MemberController {
	@Autowired
	RoleServiceImpl rolim;
	@Autowired
	MemberServiceImple membrim;
	@Autowired
	MemberRoleRepo memberRoleRepo;
	
	
 


	@GetMapping("/membertable")
	public String getallmem(ModelMap model) {

		List<MemberEntity> allmem = this.membrim.getAllMember();
		
		model.addAttribute("memberList", allmem);

		return "membertable";
	}

	@PostMapping("/savemem")
	@ResponseBody
	public String inserMem(@ModelAttribute("memberEntity") AddMemberDto dto, Model model) {

		AddMemberDto saveNewMember = this.membrim.saveNewMember(dto);

		model.addAttribute("memberName", saveNewMember);
		model.addAttribute("memberPhone", saveNewMember);
		model.addAttribute("selectrole", saveNewMember);

		return "redirect:/member/membertable";
	}
	
	
//	@RequestMapping("/edit")
//	public String editform() {
//
//		return "editformem";
//	}

//	@PostMapping("/savemem")
//	@ResponseBody
//	public AddMemberDto inserMem(@RequestBody AddMemberDto dto ) {
//		 AddMemberDto saveNewMember = this.membrim.saveNewMember(dto);
//		 return saveNewMember;
//	}

//	@PutMapping("/edit/{id}")
//	@ResponseBody
//	public void editMem(@RequestBody MemberEntity mem, @PathVariable("id") long id) {
//
//		this.membrim.update(mem, id);
//	}

//	@DeleteMapping("/delete/{id}")
//	@ResponseBody
//	public void deleteMem(@PathVariable("id") long id) {
//
//		this.membrim.delete(id);

//	}

//	@GetMapping("/getrole/{id}")
//	@ResponseBody
//	public MemberEntity getrole(@PathVariable("id") long id) {
//		
//		MemberEntity mem = this.membrim.getMemberById(id);
//		return mem;
//	}

//	@ModelAttribute("roles")
//	public List<RoleAgain> initializeProfiles() {
//		return rolim.getAllRole();
//	}

}
