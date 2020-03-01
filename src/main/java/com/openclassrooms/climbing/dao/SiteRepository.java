package com.openclassrooms.climbing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openclassrooms.climbing.entities.Site;

public interface SiteRepository extends JpaRepository <Site,Integer> {

}
