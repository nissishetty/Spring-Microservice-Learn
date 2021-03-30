package com.niswarth.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niswarth.model.Rating;
import com.niswarth.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingController {
	
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 5);
		
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getRatings(@PathVariable("userId") String userId) {
		List<Rating> rating =  Arrays.asList(
				new Rating("1234", 3),
				new Rating("5678", 4));
		UserRating userRating = new UserRating();
		userRating.setUserRating(rating);
		return userRating;
		
	}

}
