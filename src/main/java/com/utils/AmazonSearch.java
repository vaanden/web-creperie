/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.io.IOException;

import com.journaldev.spring.bean.Result;

/**
 *
 * @author Yoni
 */
public class AmazonSearch {

	public static Result searchReviews(String searchText) throws IOException {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

		Result resultBean = new Result(searchText);

		// Set the service:
		com.ECS.client.jax.AWSECommerceService service = new com.ECS.client.jax.AWSECommerceService();

		// Set the service port:
		service.setHandlerResolver(new AwsHandlerResolver("9WBwAy1IpiJ+dwI+pgZhDz1B4Evbv0ytYKH3sDHt"));

		com.ECS.client.jax.AWSECommerceServicePortType port = service.getAWSECommerceServicePort();

		// Get the operation object:
		com.ECS.client.jax.ItemSearchRequest itemRequest = new com.ECS.client.jax.ItemSearchRequest();

		// Fill in the request object:
		itemRequest.setKeywords(searchText);
		com.ECS.client.jax.ItemSearch ItemElement = new com.ECS.client.jax.ItemSearch();

		itemRequest.setSearchIndex("Marketplace");

		ItemElement.setAWSAccessKeyId("AKIAJZIMPTO4GELNXXPQ");
		ItemElement.setAssociateTag("reviewsprojec-20");
		ItemElement.getRequest().add(itemRequest);
		ItemElement.setMarketplaceDomain("www.amazon.com");
		// Call the Web service operation and store the response
		// in the response object:

		com.ECS.client.jax.ItemSearchResponse response = port.itemSearch(ItemElement);
		return resultBean;
	}
}
