package com.micro.hotel.HotelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.hotel.HotelService.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}
