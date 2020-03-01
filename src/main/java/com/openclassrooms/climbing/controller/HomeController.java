package com.openclassrooms.climbing.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.openclassrooms.climbing.dao.UserRepository;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/index")
	public ModelAndView showIndexController() {

		String viewName = "index.html";

		Map<String, Object> model = new HashMap<String, Object>();

		return new ModelAndView(viewName, model);
	}
	
}
