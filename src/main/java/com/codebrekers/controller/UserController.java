package com.codebrekers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebrekers.entity.User;
import com.codebrekers.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public User createuser(@RequestBody User user) {

		return userService.createuser(user);

	}

	@GetMapping("/getallusers")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

}
