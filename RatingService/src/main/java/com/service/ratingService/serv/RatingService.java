package com.service.ratingService.serv;

import java.util.List;

import com.service.ratingService.entity.Rating;

public interface RatingService {

	public Rating addRating(Rating rating);
	List<Rating> getAllRating();
	public List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByhotelId(String hotelId);
	
	
}
