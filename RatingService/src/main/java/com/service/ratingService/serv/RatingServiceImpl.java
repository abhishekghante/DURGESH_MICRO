package com.service.ratingService.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.ratingService.Repository.RatingRepo;
import com.service.ratingService.entity.Rating;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	RatingRepo ratingRepo;
	
	
	@Override
	public Rating addRating(Rating rating) {
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByhotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByHotelId(hotelId);
	}

}
