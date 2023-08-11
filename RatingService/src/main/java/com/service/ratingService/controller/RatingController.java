package com.service.ratingService.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.ratingService.entity.Rating;
import com.service.ratingService.serv.RatingService;

@RestController
@RequestMapping(value = "/ratings")
public class RatingController {
	
	@Autowired
	RatingService ratingService;

    @PostMapping("/addRating")	
	public ResponseEntity<Rating> addRatig(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.addRating(rating));
	}
    
    @GetMapping("/getAllRating")	
   	public ResponseEntity<List<Rating>> getAllRating(){
   		
   		return ResponseEntity.ok(ratingService.getAllRating());
   	}
    
    
    @GetMapping("/user/{userId}")	
   	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
   		
   		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
   	}
    
    @GetMapping("/hotel/{hotelId}")	
   	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
   		
   		return ResponseEntity.ok(ratingService.getRatingByhotelId(hotelId));
   	}


	
}
