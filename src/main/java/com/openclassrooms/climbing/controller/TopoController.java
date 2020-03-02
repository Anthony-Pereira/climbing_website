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
	
	Topo topo = new Topo();
	
	@GetMapping ("/mySpace")
	public ModelAndView showTopoController (Model topo) {
		
		
		List<Topo> topos=topoRepository.findAll();
		topo.addAttribute("topoList",topos);

		String viewName = "mySpace.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("topo", new Topo());
		
		return new ModelAndView(viewName,model);
	}
	
	@PostMapping ("/mySpace")
	public ModelAndView addTopoController (Topo topo) {
		
		topoRepository.save(topo);
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl("/mySpace");
		
		return new ModelAndView(redirect);
	}

}