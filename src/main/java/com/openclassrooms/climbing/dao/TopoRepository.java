package com.openclassrooms.climbing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openclassrooms.climbing.entities.Topo;

public interface TopoRepository extends JpaRepository <Topo,Integer> {

}
