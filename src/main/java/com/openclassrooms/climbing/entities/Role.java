package com.openclassrooms.climbing.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Role {
	
	@Id
	@Size(min=3,max=20,message="Role must be between 3 and 20 characters long")
	String role;

}
