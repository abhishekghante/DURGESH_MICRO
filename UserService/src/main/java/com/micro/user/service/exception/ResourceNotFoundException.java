package com.micro.user.service.exception;

import com.micro.user.service.entity.User;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {		
		super("Resource not found exception");
	}
	
	public ResourceNotFoundException(String message) {		
		super(message);
	}
	
	
}
