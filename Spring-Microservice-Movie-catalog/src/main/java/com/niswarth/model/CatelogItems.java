package com.niswarth.model;

public class CatelogItems {
	private String name;
	private String desc;
	private int rating;

	public CatelogItems(String name, String desc, int rating) {
		super();
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public int getRating() {
		return rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
