package com.codebrekers.service;

import java.util.List;


import com.codebrekers.entity.User;


public interface UserService {

	User createuser(User user);

	List<User> getAllUser();

}
