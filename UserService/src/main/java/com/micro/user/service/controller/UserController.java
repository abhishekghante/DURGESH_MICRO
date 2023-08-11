package com.micro.user.service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.user.service.entity.User;
import com.micro.user.service.service.UserService;
import com.micro.user.service.serviceImpl.UserServiceImpl;

@RequestMapping("/users")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> createUser(@RequestBody User user){		 
		User createdUser = userService.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Optional<User>> getUserId(@PathVariable String userId){		 
		Optional<User> user = userService.findByID(userId);
		return ResponseEntity.ok(user);
	}
		
	@GetMapping
	public ResponseEntity<List<User>> gelAllUser(){		 
		List<User> allUser= userService.getAllUsers();
		return ResponseEntity.ok(allUser);
	}

}
