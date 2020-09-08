package com.delticom.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.delticom.demo.model.Employee;
import com.delticom.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("/employee")
	public String employeeForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "employee_form";
	}
	
	//TODO: ListEmployee {tomorrow 9 Sep 2020}
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee emp) {
		
		empservice.addEmployee(emp);
		
		return "redirect:/employee";
		
	}
}
