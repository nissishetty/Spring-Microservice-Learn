package com.niswarth.model;

public class Rating {
	private String movieId;
	private int rating;

	public Rating(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public Rating() {

	}

	public String getMovieId() {
		return movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
