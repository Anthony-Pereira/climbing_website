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
	
	@GetMapping ("/climbingForm")
	public ModelAndView showClimbingControllerForm () {
		
		String viewName = "climbingForm";
		
		Map<String,Object> model = new HashMap<String,Object>();
		
		return new ModelAndView(viewName,model);
	}
	
	@PostMapping ("/climbingForm")
	public ModelAndView submitClimbingControllerForm () {
		
		return null;
	}

}
