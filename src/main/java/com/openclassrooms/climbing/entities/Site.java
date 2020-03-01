package com.openclassrooms.climbing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Site {
	
	public Site () {};

	public Site(Integer id, String name, String location, Integer department, Boolean officielLesAmisDeLescalade) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.department = department;
		this.officielLesAmisDeLescalade = officielLesAmisDeLescalade;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String location;
	private Integer department;
	private Boolean officielLesAmisDeLescalade;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getDepartment() {
		return department;
	}
	public void setDepartment(Integer department) {
		this.department = department;
	}
	
	public Boolean getOfficielLesAmisDeLescalade() {
		return officielLesAmisDeLescalade;
	}
	public void setOfficielLesAmisDeLescalade(Boolean officielLesAmisDeLescalade) {
		this.officielLesAmisDeLescalade = officielLesAmisDeLescalade;
	}
	
}