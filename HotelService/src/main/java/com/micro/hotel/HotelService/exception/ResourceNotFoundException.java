package com.micro.hotel.HotelService.exception;


public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		
		super("Resouce not found exception");
	}
	
	public ResourceNotFoundException(String message) {
		
		super(message);
	}
	
}
