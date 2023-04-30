package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.repo.UserRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserRepo repo;
	
	@PostMapping("/user/signup")
	public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user) {
		
	 System.out.println("Controller called");
	 return ResponseEntity.ok(repo.save(user));
		
		
	}
}
