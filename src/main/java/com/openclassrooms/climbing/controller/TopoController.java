package com.openclassrooms.climbing.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.openclassrooms.climbing.dao.SiteRepository;
import com.openclassrooms.climbing.dao.TopoRepository;
import com.openclassrooms.climbing.entities.Site;
import com.openclassrooms.climbing.entities.Topo;

@Controller
public class TopoController {

	@Autowired
	TopoRepository topoRepository;

	@Autowired
	SiteRepository siteRepository;

	@GetMapping("/topoForm")
	public ModelAndView showTopoController(Model topoObject,
			@RequestParam(name = "page", defaultValue = "0") int page){

		Page<Topo> pageTopo = topoRepository.findAll(PageRequest.of(page, 5));

		topoObject.addAttribute("listTopo", pageTopo.getContent());
		topoObject.addAttribute("pageNumber", new int[pageTopo.getTotalPages()]);
		topoObject.addAttribute("currentPage", page);

		String viewName = "topoForm.html";

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("topoObject", new Topo());

		return new ModelAndView(viewName, model);
	}

	@PostMapping("/topoForm")
	public ModelAndView addTopoController(Topo topoObject) {

		topoRepository.save(topoObject);

		RedirectView redirect = new RedirectView();
		redirect.setUrl("/topoForm");

		return new ModelAndView(redirect);
	}

	@GetMapping("/topoDelete")
	public ModelAndView deleteMySpaceController(Integer id,Integer currentPage) {

		topoRepository.deleteById(id);	

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("topoObject", new Topo());

		RedirectView redirect = new RedirectView();
		redirect.setUrl("/topoForm");

		return new ModelAndView(redirect, model);
	}

}