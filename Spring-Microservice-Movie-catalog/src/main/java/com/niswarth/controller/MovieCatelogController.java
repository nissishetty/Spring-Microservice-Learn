package com.niswarth.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.niswarth.model.CatelogItems;
import com.niswarth.model.Movie;
import com.niswarth.model.Rating;
import com.niswarth.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatelogController {
	
	@Autowired
	private RestTemplate restTemp;
	
	
	@RequestMapping("/{userId}")
	public List<CatelogItems> getCatelogItems(String userId){
		
		UserRating ratings = restTemp.getForObject("http://localhost:8083/ratings/users/"+userId, UserRating.class);
		
		return ratings.getUserRating().stream().map(rating -> {
			
			//for each movie Id,call movie info service and get details
			Movie movie = restTemp.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			
			//put them all together
			return new CatelogItems(movie.getMovieName(), "Desc", rating.getRating());
		}).collect(Collectors.toList());
		
		
	}

}
