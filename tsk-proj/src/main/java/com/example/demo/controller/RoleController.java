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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.RoleAgain;
import com.example.demo.services.RoleServiceImpl;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleServiceImpl rolserimpl;

	@RequestMapping("/rolepage")
	public String insertrolepage() {

		return "roleform";
	}

	@RequestMapping("/tablepage")
	public String tablepage() {

		return "roletable";

	}

	@RequestMapping("/edit")
	public String editrole() {

		return "editrole";
	}
	
	@PostMapping("/saverole")
	@ResponseBody	
	public void inserRole(@ModelAttribute("roleagain")RoleAgain roleAgain ) {
		
		this.rolserimpl.insert(roleAgain);
	}
	
	@PutMapping("/edit/{id}")
	@ResponseBody
	public void editRole(@ModelAttribute("roleagain")RoleAgain roleAgain, @PathVariable("id") 
							long id) {
		
		this.rolserimpl.update(roleAgain, id);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public void deleteRole(@PathVariable("id") long id) {
		
		this.rolserimpl.delete(id);
		 
	}

	@GetMapping("/getrole/{id}")
	@ResponseBody
	public RoleAgain getrole(@PathVariable("id") long id) {
		
		RoleAgain role = this.rolserimpl.getRole(id);
		return role;
	}
	
	@GetMapping("/getall")
	@ResponseBody
	public List<RoleAgain> getallrole(){
		
		List<RoleAgain> allRole = this.rolserimpl.getAllRole();
		return allRole;
	}
	
	@GetMapping("/getbyname/{name}")
	@ResponseBody
	public RoleAgain getByrolname(@PathVariable("name") String name) {
		
		RoleAgain roleByName = this.rolserimpl.getRoleByName(name);
		return roleByName;
		
	}
	
}
