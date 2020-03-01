package com.openclassrooms.climbing.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.openclassrooms.climbing.dao.TopoRepository;
import com.openclassrooms.climbing.entities.Topo;

@Controller
public class TopoController {
	
	@Autowired
	TopoRepository topoRepository;
	
	Topo model2 = new Topo();
	
	@GetMapping ("/mySpace")
	public ModelAndView showTopoController (Model model2) {
		
		
		List<Topo> topos=topoRepository.findAll();
		model2.addAttribute("topoList",topos);
		model2.mergeAttributes(topos);
		
		String viewName = "mySpace.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("topo", new Topo());
		
		//ModelAndView modelAndView = new ModelAndView("mySpace");
		
		//List<Topo> topos=topoRepository.findAll();
		//model.addAttribute("topoList",topos);
		
		return new ModelAndView(viewName,model);
	}
	
	/*public ModelAndView passParametersWithModelAndView() {
	    ModelAndView modelAndView = new ModelAndView("viewPage");
	    modelAndView.addObject("message", "Baeldung");
	    return modelAndView;*/
	
	@PostMapping ("/mySpace")
	public ModelAndView addTopoController (Topo topo) {
		
		topoRepository.save(topo);
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl("/mySpace");
		
		return new ModelAndView(redirect);
	}

}