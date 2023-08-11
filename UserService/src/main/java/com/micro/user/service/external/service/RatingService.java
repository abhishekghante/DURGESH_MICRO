package com.micro.user.service.external.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.micro.user.service.entity.Rating;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
	
	@GetMapping("/ratings/user/{userId}")
	List<Rating> getRatingByUserId(@PathVariable("userId") String userId);

}
