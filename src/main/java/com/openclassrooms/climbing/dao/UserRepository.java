package com.openclassrooms.climbing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openclassrooms.climbing.entities.User;

public interface UserRepository extends JpaRepository <User,String> {
	
	public User findByEmailContains(String email);
	
	public User findByPasswordContains(String password);
	
	//public Boolean existsUserByEmail(String email); meme chose que annotation famille des contraintes @NotNull, @NotEmpty et @NotBlank dans la validation du bean

}
