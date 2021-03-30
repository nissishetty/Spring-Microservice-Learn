package com.niswarth.model;

public class Movie {
	private String movieId;
	private String movieName;

	public Movie(String movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public Movie() {

	}

	public String getMovieId() {
		return movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
