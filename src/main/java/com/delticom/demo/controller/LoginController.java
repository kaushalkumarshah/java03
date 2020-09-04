package com.delticom.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.delticom.demo.model.User;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String loginForm() {
		
		return "login";
	}
	
	@PostMapping("/login")
	public  String checkUser(@ModelAttribute User user,Model model) {
		
		if(user.getUserName().equals("hari") && user.getPassword().equals("123")) {
			
			
			model.addAttribute("user",user.getUserName());
			//model.addAttribute("welcome","Welcome");
			return "home";
		}
		
		model.addAttribute("error","user does not exist");
		return "login";
	}

	/*Login Homework: Friday, 4Sep2020*/
}
