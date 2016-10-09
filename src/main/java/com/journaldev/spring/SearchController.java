package com.journaldev.spring;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.bean.Result;
import com.journaldev.spring.service.SearchService;

@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView init() {
		ModelAndView mav = new ModelAndView("search");
		return mav;
	}

	/**
	 * Recupération des resultats d'une recherce
	 * 
	 * @param searchText
	 * @return vue contenant les resultats
	 */
	@RequestMapping(value = "/search", params = "searchText", method = RequestMethod.GET)
	public ModelAndView searchProducts(@RequestParam("searchText") String searchText) {
		ModelAndView mav = new ModelAndView("search");
		Result result = new Result(searchText);
		// use service to find
		try {
			result = searchService.search(searchText);
		} catch (IOException e) {
			e.printStackTrace();
		}
		mav.addObject("result_bean", result);
		return mav;
	}

}
