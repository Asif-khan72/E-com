package com.e_com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_com.response.ApiResponse;

@RestController
public class HomeController {
	@Autowired
	public ApiResponse apiResponse;
	
	@GetMapping
	public ApiResponse HomeControllerHandler()
	{
		apiResponse.setMessage("Welcome");
		return apiResponse;
	}

}
