package com.openclassrooms.climbing.entities;

import javax.persistence.Entity;

@Entity
public class InformationSite extends Site {
	
	public InformationSite() {};

	private String zone;
	private Integer way;
	private Integer lenght;
	private Integer listing;
	private String type;
	
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public Integer getWay() {
		return way;
	}
	public void setWay(Integer way) {
		this.way = way;
	}
	public Integer getLenght() {
		return lenght;
	}
	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}
	public Integer getListing() {
		return listing;
	}
	public void setListing(Integer listing) {
		this.listing = listing;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
