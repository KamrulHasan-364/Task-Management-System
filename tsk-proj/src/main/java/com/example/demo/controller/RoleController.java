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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.entity.RoleAgain;
import com.example.demo.services.RoleServiceImpl;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleServiceImpl rolserimpl;

	@GetMapping("/roletable")
	public String getallrole(ModelMap model){
		
		List<RoleAgain> allRole = this.rolserimpl.getAllRole();
		model.addAttribute("dataList", allRole);
		
		return "roletable";
	}


	
	@PostMapping("/saveform")
	
	public String insertRole(@ModelAttribute("roleEntity") RoleAgain roleAgain, Model model ) {
		
		RoleAgain name= this.rolserimpl.insert(roleAgain);
		model.addAttribute("name", name);
		return "redirect:/role/roletable";
	}
	
	@GetMapping("/list")
	@ResponseBody
	public List<RoleAgain> getRoles() {
		List<RoleAgain> allRole = this.rolserimpl.getAllRole();
		return allRole;
	}
	

	
	
//	@RequestMapping("/roleform")
//	public String insertrolepage(Model model) {
//		RoleAgain roleAgain= new RoleAgain();
//		model.addAttribute("roleEntity", roleAgain);
//		return "roletable";
//	}
//	@RequestMapping("/roletable")
//	public String tablepage() {
//		//roleform
//		return "roletable";
//
//	}
	
//	@RequestMapping("/edit")
//	public String editrole() {
//
//		return "editrole";
//	}
	
//	@PutMapping("/edit/{id}")
//	@ResponseBody
//	public void editRole(@ModelAttribute("roleagain")RoleAgain roleAgain, @PathVariable("id") 
//							long id) {
//		
//		this.rolserimpl.update(roleAgain, id);
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	@ResponseBody
//	public void deleteRole(@PathVariable("id") long id) {
//		
//		this.rolserimpl.delete(id);
//		 
//	}

//	@GetMapping("/getrole/{id}")
//	@ResponseBody
//	public RoleAgain getrole(@PathVariable("id") long id) {
//		
//		RoleAgain role = this.rolserimpl.getRole(id);
//		return role;
//	}
	

	

	
//	@GetMapping("/getbyname/{name}")
//	@ResponseBody
//	public RoleAgain getByrolname(@PathVariable("name") String name) {
//		
//		RoleAgain roleByName = this.rolserimpl.getRoleByName(name);
//		return roleByName;
//		
//	}
	
}
