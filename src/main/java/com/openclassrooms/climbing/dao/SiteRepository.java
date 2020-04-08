package com.openclassrooms.climbing.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openclassrooms.climbing.entities.Site;

public interface SiteRepository extends JpaRepository <Site,Long> {

	public List<Site> findByTitleSiteContains(String keyWord); //if Page to pageable take spring.data.domain
	
	// public List<Site> findByTitleSiteOrDepartmentOrType(String name,Integer department,String type); //if Page to pageable take spring.data.domain
	
}
