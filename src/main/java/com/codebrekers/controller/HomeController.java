package com.codebrekers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codebrekers.entity.User;
import com.codebrekers.repository.UserRepository;

@RestController
public class HomeController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/get")
	public String createuser(@RequestBody User user) {
		System.out.println(user.getId());
		System.out.println(user.getTitle());
		userRepository.save(user);
		return "Working";
		
	}
	
	@GetMapping("/getall")
	public List<User> getAllUser(){
		return userRepository.findAll();
	}

}
