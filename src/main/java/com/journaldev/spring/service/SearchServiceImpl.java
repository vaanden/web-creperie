package com.journaldev.spring.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.journaldev.spring.bean.Item;
import com.journaldev.spring.bean.Result;
import com.journaldev.spring.bean.Review;
import com.journaldev.spring.model.Person;
import com.utils.AmazonSearch;

@Service
public class SearchServiceImpl implements SearchService {

	@Override
	public Result search(String searchText) throws IOException {
		// WebScrapping Amazon
		Result filledAmazon = AmazonSearch.searchReviews(searchText);
		// on appelle désormais le bean resultBean
		Result resultbean = filledAmazon;
		// recuperation de toute les review
		List<Review> lrb = resultbean.getResultReviews();
		// recuperation de tous les items
		List<Item> allitems = new ArrayList<Item>();
		// hashmap qui a chaque item associe les reviews
		HashMap<Item, List<Review>> hashmapKItemVReviews = new HashMap<Item, List<Review>>();
		// on veut insérer chaque item de la review dans allitems
		for (Review review : lrb) {
			boolean estPresent = false;
			Item reviewItem = review.getItem();
			for (Item allitemitem : allitems) {
				if (allitemitem.getItemLink() == reviewItem.getItemLink()) {
					estPresent = true;
					break;
				}
			}
			if (estPresent == false) {
				// l'item est ajouté à la liste de tous les items
				allitems.add(reviewItem);
				// la hashmap est remplie par une nouvelle clé
				List<Review> newitemReviews = new ArrayList<Review>();
				newitemReviews.add(review);
				hashmapKItemVReviews.put(reviewItem, newitemReviews);
			} else {
				// si l'item est déjà la on ajoute la review a l'objet
				// existant
				hashmapKItemVReviews.get(review.getItem()).add(review);
			}
		}

		resultbean.setItemReviewsMap(hashmapKItemVReviews);
		resultbean.setAllitems(allitems);

		return resultbean;

	}

	@Override
	public void updatePerson(Person p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub

	}

}
