package com.micro.hotel.HotelService.serviceImp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.hotel.HotelService.entity.Hotel;
import com.micro.hotel.HotelService.exception.ResourceNotFoundException;
import com.micro.hotel.HotelService.repository.HotelRepo;
import com.micro.hotel.HotelService.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepo hotelRepo;
	

	@Override
	public Hotel save(Hotel hotel) {
		hotel.setId(String.valueOf(UUID.randomUUID()));
		return hotelRepo.save(hotel);
	}

	@Override
	public Hotel gethotelId(String id) {
		
		return hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("the hotel id not present in our database"));
		}
		
	@Override
	public List<Hotel> getAllHotel() {// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

}
