package com.manish.moviecatalogservice.models;

public class CatalogItem {
	private String id;
	private String desc;
	private int rating;
	
	public CatalogItem(String id, String desc, int rating) {
		this.id = id;
		this.desc = desc;
		this.rating = rating;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
