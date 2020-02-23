package com.codebrekers.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.codebrekers.entity.User;
import com.codebrekers.repository.UserRepository;
import com.codebrekers.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createuser(@RequestBody User user) {

		return userRepository.save(user);

	}
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}

}
