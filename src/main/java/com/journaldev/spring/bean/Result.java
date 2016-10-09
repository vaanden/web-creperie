package com.journaldev.spring.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Result {
	private String searchText;
	private List<Review> reviewList;
	private HashMap<Item, List<Review>> itemReviewsMap;
	private List<Item> allitems;

	public Result(String searchText, List<Review> pReviewList) {
		this.searchText = searchText;
		this.reviewList = pReviewList;
	}

	public Result(String searchText) {
		this.searchText = searchText;
		this.reviewList = new ArrayList<Review>();

	}

	public List<Review> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	public HashMap<Item, List<Review>> getItemReviewsMap() {
		return itemReviewsMap;
	}

	public void setItemReviewsMap(HashMap<Item, List<Review>> hashmapKItemVReviews) {
		this.itemReviewsMap = hashmapKItemVReviews;
	}

	public List<Item> getAllitems() {
		return allitems;
	}

	public void setAllitems(List<Item> allitems) {
		this.allitems = allitems;
	}

	public void addReview(Review reviewBean) {
		this.reviewList.add(reviewBean);
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String pSearchText) {
		this.searchText = pSearchText;
	}

	public List<Review> getResultReviews() {
		return this.reviewList;
	}

	public void setResultIReviews(List<Review> pReviewList) {
		this.reviewList = pReviewList;
	}
}
