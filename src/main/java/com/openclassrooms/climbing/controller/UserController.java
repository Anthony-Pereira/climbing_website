package com.openclassrooms.climbing.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.openclassrooms.climbing.dao.UserRepository;
import com.openclassrooms.climbing.entities.User;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping ("/showSignUpForm")
	public ModelAndView showSignUpFormController () {
		
		String viewName = "showSignUpForm.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("user", new User());
		
		return new ModelAndView(viewName,model);
	}		
	
	@PostMapping ("/showSignUpForm")
	public ModelAndView submitSignUpFormController (User user) {
		
		userRepository.save(user);
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl("/showSignInForm");
		
		return new ModelAndView(redirect);
	}
	
	@GetMapping ("/showSignInForm")
	public ModelAndView showSignInFormController () {
		
		String viewName = "showSignInForm.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		model.put("user", new User());
		
		return new ModelAndView(viewName,model);
	}
	
	@PostMapping ("/showSignInForm")
	public ModelAndView submitSignInFormController (User user) {
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl("/index");
		
		return new ModelAndView(redirect);
	}
}
