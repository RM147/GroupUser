package com.qa.users.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.users.service.UserService;

@RestController
public class UserController {
	
	private UserService service;
	
	@PostMapping("/createUser")
	public void createUser() {
		
	}
	
	@GetMapping("/readeUser")
	public void getUser() {
		
	}
	
	@PutMapping("/createUser")
	public void updateUser() {
		
	}
	
	@DeleteMapping("/createUser")
	public void deleteUser() {
		
	}

}
