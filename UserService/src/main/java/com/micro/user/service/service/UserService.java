package com.micro.user.service.service;

import java.util.List;
import java.util.Optional;

import com.micro.user.service.entity.User;

public interface UserService {
	
	User save(User user);
	
	Optional<User> findByID(String userID);
	
	List<User> getAllUsers();

}
