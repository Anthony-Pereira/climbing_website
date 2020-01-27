package com.openclassrooms.climbing;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClimbingController {
	
	@GetMapping ("/index")
	public ModelAndView showIndexController () {
		
		String viewName = "index.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/site")
	public ModelAndView showSiteController () {
		
		String viewName = "site.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/association")
	public ModelAndView showAssociationController () {
		
		String viewName = "association.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/evenement")
	public ModelAndView showEventController () {
		
		String viewName = "event.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/vocabulary")
	public ModelAndView showVocabularyController () {
		
		String viewName = "vocabulary.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/aboutUs")
	public ModelAndView showAboutUsController () {
		
		String viewName = "aboutUs.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/contact")
	public ModelAndView showContactController () {
		
		String viewName = "contact.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/termOfUse")
	public ModelAndView showTermOfUseController () {
		
		String viewName = "termOfUse.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/privacyPolicy")
	public ModelAndView showPrivacyPolicyController () {
		
		String viewName = "privacyPolicy.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/login")
	public ModelAndView showLoginController () {
		
		String viewName = "formSignIn.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/register")
	public ModelAndView showRegisterController () {
		
		String viewName = "formSignUp.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@PostMapping ("/formSignIn")
	public ModelAndView showFormSignInController () {
		
		String viewName = "formSignIn.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@PostMapping ("/formSignUp")
	public ModelAndView showFormSignUpController () {
		
		String viewName = "formSignUp.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}

}
