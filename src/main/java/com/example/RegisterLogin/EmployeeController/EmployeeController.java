package com.example.RegisterLogin.EmployeeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Entity.ContactUs;
import com.example.RegisterLogin.Service.EmployeeService;
import com.example.RegisterLogin.payload.reponse.LoginMesage;
import com.example.RegisterLogin.Repo.contactRepo;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")

public class EmployeeController {
	
@Autowired
private contactRepo contactRepo; 
	
@Autowired
private EmployeeService employeeService;


	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
	{
		String id = employeeService.addEmployee(employeeDTO);
		return id;
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
	{
		LoginMesage loginMessage = employeeService.loginEmployee(loginDTO);
		return ResponseEntity.ok(loginMessage);
	}
	
	@PostMapping("/contact")
	public void  saveEmployee(@RequestBody ContactUs contactUs)
	{
		contactRepo.save(contactUs);
	}
}
