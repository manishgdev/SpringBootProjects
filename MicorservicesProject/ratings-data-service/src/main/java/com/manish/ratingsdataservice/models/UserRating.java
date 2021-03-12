package com.manish.ratingsdataservice.models;

import java.util.List;

public class UserRating {
	
	private List<Rating> userRatingList;
	
	public UserRating(List<Rating> userRatingList) {
		this.setUserRatingList(userRatingList);
	}

	public List<Rating> getUserRatingList() {
		return userRatingList;
	}

	public void setUserRatingList(List<Rating> userRatingList) {
		this.userRatingList = userRatingList;
	}
	
	
}
