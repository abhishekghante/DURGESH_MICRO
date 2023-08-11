package com.micro.hotel.HotelService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.hotel.HotelService.entity.Hotel;

@Service
public interface HotelService {

	public Hotel save(Hotel hotel);
	
	public Hotel gethotelId(String id);
	
	public List<Hotel> getAllHotel();
	
}
