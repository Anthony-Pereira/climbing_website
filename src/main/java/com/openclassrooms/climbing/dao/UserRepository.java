package com.openclassrooms.climbing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openclassrooms.climbing.entities.User;

public interface UserRepository extends JpaRepository <User,Integer> {

}
