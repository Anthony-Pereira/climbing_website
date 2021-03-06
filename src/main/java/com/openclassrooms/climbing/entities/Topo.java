package com.openclassrooms.climbing.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Topo {
	
	public Topo() {};
	
	public Topo(Long id, String titleTopo, String description, String location, String releaseDate,
			Boolean available) {
		super();
		this.id = id;
		this.titleTopo = titleTopo;
		this.description = description;
		this.location = location;
		this.releaseDate = releaseDate;
		this.available = available;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titleTopo;
	private String description;
	private String location;
	private String releaseDate;
	private Boolean available;
	
	@ManyToMany(mappedBy="topo")
	private Collection<User> user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitleTopo() {
		return titleTopo;
	}
	public void setTitleTopo(String titleTopo) {
		this.titleTopo = titleTopo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
}
