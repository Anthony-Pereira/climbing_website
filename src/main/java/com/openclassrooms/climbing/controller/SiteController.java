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
import com.openclassrooms.climbing.entities.Site;

@Controller
public class SiteController {
	
	@Autowired
	SiteRepository siteRepository;
	
	@GetMapping ("/site")
	public ModelAndView showSiteHomeController (Model siteObject) {
				
		//List<Site> listSite=siteRepository.findAll();
		//siteObject.addAttribute("listSiteByName", listSite);
		
		String viewName = "site.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("showSite", new Site());
		
		return new ModelAndView(viewName,model);
	}
	
	@PostMapping ("/site")
	public ModelAndView submitSiteHomeController (Site showSite) {

		RedirectView redirect = new RedirectView();
		redirect.setUrl("/site");
		
		return new ModelAndView(redirect);
	}
	
	@GetMapping ("/siteSearchResult")
	public ModelAndView showSiteSearchController (@RequestParam(name="keyWord",defaultValue="") String keyWord) {
				
		List<Site> listSiteSearch=siteRepository.findByTitleSiteContains(keyWord);
		
		String viewName = "siteSearch.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("searchResult", listSiteSearch);
		model.put("keyWord", keyWord); 
		
		return new ModelAndView(viewName,model);
	}
	
	@GetMapping ("/siteForm")
	public ModelAndView showSiteController (Model siteObject,@RequestParam (name="page", defaultValue="0") int page) {
				
		Page<Site> pageSite=siteRepository.findAll(PageRequest.of(page,5));
		siteObject.addAttribute("listSite",pageSite.getContent());
		siteObject.addAttribute("pageNumber",new int [pageSite.getTotalPages()]);
		siteObject.addAttribute("currentPage",page);	
		
		String viewName = "siteForm.html";
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("siteObject", new Site());
		
		return new ModelAndView(viewName,model);
	}
	
	@PostMapping ("/siteForm")
	public ModelAndView addSiteController(Site siteObject) {
		
		siteRepository.save(siteObject);
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl("/siteForm");
		
		return new ModelAndView(redirect);
	}
	
	@GetMapping("/siteDelete")
	public ModelAndView deleteSiteController(Long id,Integer currentPage) {
		
		siteRepository.deleteById(id);
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("siteObject",new Site());
		
		RedirectView redirect = new RedirectView();
		redirect.setUrl("/siteForm");
		
		return new ModelAndView(redirect,model);
	}


}
