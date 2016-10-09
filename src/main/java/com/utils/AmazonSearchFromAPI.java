/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.io.IOException;

import com.amazon.webservices.AWSECommerceService.ItemSearchRequest;
import com.amazon.webservices.AWSECommerceService.Request;
import com.journaldev.spring.bean.Result;

/**
 *
 * @author Daniel
 */
public class AmazonSearchFromAPI {

	public static Result searchReviews(String searchText) throws IOException {

		Result resultBean = new Result(searchText);
		ItemSearchRequest itemRequest = new ItemSearchRequest();
		itemRequest.setKeywords(searchText);
		Request request = new Request();
		request.setItemSearchRequest(itemRequest);

		return resultBean;
	}
}
