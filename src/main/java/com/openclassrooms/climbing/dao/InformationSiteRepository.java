package com.openclassrooms.climbing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openclassrooms.climbing.entities.InformationSite;

public interface InformationSiteRepository extends JpaRepository <InformationSite,Integer> {

}
