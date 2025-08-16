package com.E_com.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.E_com.model.User;
import com.E_com.response.SignupRequest;

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

}
