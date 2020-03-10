package com.openclassrooms.climbing.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openclassrooms.climbing.entities.Site;

public interface SiteRepository extends JpaRepository <Site,Integer> {

	//@Query("SELECT titleSite,department,type,officielLesAmisDeLescalade") A tester si meilleur
	public List<Site> findByTitleSiteContains(String keyWord); //if Page to pageable take spring.data.domain
}
