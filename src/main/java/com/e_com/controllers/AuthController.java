package com.e_com.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_com.model.User;
import com.e_com.response.SignupRequest;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@PostMapping("/signup")
	public ResponseEntity<User> createUserHandler(@RequestBody SignupRequest req)  
	{   
		
		User user=new User();
		user.setEmail(req.getEmail());
		user.setFullName(req.getFullName());
		return ResponseEntity.ok(user);
		
	}
	
	@GetMapping("/test")
	public String testApi() {
	    return "API is working!";
	}
	
	@GetMapping("/ping")
	public String ping() {
	    return "Server is up!";
	}



}
