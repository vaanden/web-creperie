/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.journaldev.spring.bean.Item;
import com.journaldev.spring.bean.Result;
import com.journaldev.spring.bean.Review;

/**
 *
 * @author Yoni
 */
public class AmazonSearch {

	private final static String URL_AMAZON = "http://www.amazon.fr/s/ref=nb_sb_noss_1?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&url=search-alias%3Daps&field-keywords=";
	private static String URL_REVIEWSLIST_AMAZON;

	public static Result searchReviews(String searchText) throws IOException {

		Result resultBean = new Result(searchText);

		// Récupération de la page Amazon correspondant à la recherche
		Document amazonResearchResultPage = Jsoup.connect(getSearchUrl(searchText)).ignoreContentType(true).ignoreHttpErrors(true).timeout(10000).get();

		Elements itemList = amazonResearchResultPage.select("li.s-result-item[data-asin~=B\\s*]");
		if (itemList != null && !itemList.isEmpty()) {
			for (Element element : itemList) {
				Item itemBean = new Item();
				itemBean.setItemName(element.getElementsByClass("s-access-title").text());
				itemBean.setItemLink(element.getElementsByClass("s-access-detail-page").attr("href"));
				itemBean.setItemPhotoLink(element.getElementsByTag("img").attr("src"));
				String itemID = element.getElementsByAttribute("data-asin").attr("data-asin");

				// Récupération de la page commentaire correspondant à l'item
				getReviewsListUrl(itemID, Integer.toString(1));
				Document amazonItemReviewsFirstPage = Jsoup.connect(URL_REVIEWSLIST_AMAZON).get();
				// Le nombre de page de reviews
				Elements pagination = amazonItemReviewsFirstPage.select("ul.a-pagination li.a-last");
				int maxPage = 1;
				if (pagination != null && !pagination.isEmpty()) {
					maxPage = Integer.parseInt(pagination.first().previousElementSibling().text());
				}

				// Iteration sur toutes les pages
				for (int numPage = 1; numPage <= maxPage; numPage++) {
					getReviewsListUrl(itemID, Integer.toString(numPage));
					Document amazonItemReviewsPageN = Jsoup.connect(URL_REVIEWSLIST_AMAZON).get();
					// Récupération des commentaires
					Elements reviewsList = amazonItemReviewsPageN.select("div.review");
					for (Element el : reviewsList) {
						Review review = new Review();
						review.setSource("amazon");
						review.setTitre(el.getElementsByClass("review-title").text());
						review.setDate(el.getElementsByClass("review-date").text());
						review.setDescription(el.getElementsByClass("review-text").text());
						review.setNote(getReviewNote(el));
						review.setItem(itemBean);
						resultBean.addReview(review);
					}
				}
			}
		}
		return resultBean;
	}

	private static String getSearchUrl(String searchText) {
		return (URL_AMAZON + searchText);
	}

	private static void getReviewsListUrl(String itemID, String numPage) {
		URL_REVIEWSLIST_AMAZON = "http://www.amazon.fr/product-reviews/" + itemID
				+ "/ref=cm_cr_pr_viewopt_rvwer?ie=UTF8&showViewpoints=1&sortBy=recent&reviewerType=avp_only_reviews&pageNumber="
				+ numPage;
	}

	private static int getReviewNote(Element el) {
		int note = 0;
		Pattern p1 = Pattern.compile("(\\d.\\d).*");
		Pattern p2 = Pattern.compile("(\\d).*");
		Matcher m1 = p1.matcher(el.getElementsByClass("a-icon-alt").text());
		Matcher m2 = p2.matcher(el.getElementsByClass("a-icon-alt").text());
		if (m1.matches()) {
			String str = m1.group(1);
			str = str.substring(0, str.length() - 2);// on enleve le ",0" à la
														// fin de la string
			note = Integer.parseInt(str);
		} else if (m2.matches()) {
			note = Integer.parseInt(m2.group(1));
		}
		return note;
	}
}
