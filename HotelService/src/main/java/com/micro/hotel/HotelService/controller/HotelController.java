package com.micro.hotel.HotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.hotel.HotelService.entity.Hotel;
import com.micro.hotel.HotelService.service.HotelService;
import com.micro.hotel.HotelService.serviceImp.HotelServiceImpl;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	
	@Autowired
	HotelService service;
	
	@PostMapping("/addHotel")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
		return ResponseEntity.ok(service.save(hotel));
	}
	
	@GetMapping("/{hotelID}")
	public ResponseEntity<Hotel> addHotel(@PathVariable String hotelID){
		return ResponseEntity.ok(service.gethotelId(hotelID));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> addHotel(){
		return ResponseEntity.ok(service.getAllHotel());
	}
	
	

}
