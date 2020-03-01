package com.openclassrooms.climbing.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SiteController {
	
	@GetMapping ("/siteListing")
	public ModelAndView showListingController () {
		
		String viewName = "siteListing.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}

	@GetMapping ("/site")
	public ModelAndView showSiteController () {
		
		String viewName = "site.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
}
