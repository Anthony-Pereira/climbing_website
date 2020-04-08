package com.openclassrooms.climbing.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	private User userEmailDb;
	private User userPasswordDb;
	
	@GetMapping ("/showSignUpForm")
	public ModelAndView showSignUpFormController () {
		
		String viewName = "showSignUpForm.html";
	
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("user", new User());
		
		return new ModelAndView(viewName,model);
	}		
	
	@PostMapping ("/showSignUpForm")
	public ModelAndView submitSignUpFormController (@Valid User user, BindingResult bindingResult) {
				
		RedirectView redirect = new RedirectView();
		
		if(bindingResult.hasErrors()) {
			redirect.setUrl("/showSignUpForm");
			System.out.println("test 1 ");
		}else {
			userRepository.save(user);
			redirect.setUrl("/showSignInForm");
			System.out.println("test 2");
		}
		
		/*existsEmail = userRepository.existsUserByEmail(user.getEmail());
		
		if(!existsEmail) {
			userRepository.save(user);
			redirect.setUrl("/showSignInForm");
		}else {
			redirect.setUrl("/showSignUpForm");
			//redirect.addStaticAttribute("existsEmail", existsEmail);
		}*/
		
		System.out.println("test 3");

		
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
			
		userEmailDb=userRepository.findByEmailContains(user.getEmail());
		userPasswordDb=userRepository.findByPasswordContains(user.getPassword());
		
		if(user.getEmail().equals(userEmailDb.getEmail()) && user.getPassword().equals(userPasswordDb.getPassword())) {
			
			redirect.setUrl("/mySpace");
		}
		else if(!user.getEmail().equals(userEmailDb.getEmail()) || !user.getPassword().equals(userPasswordDb.getPassword())) {

			redirect.setUrl("/showSignIn");
		};
		
		return new ModelAndView(redirect);
	}
}
