package com.openclassrooms.climbing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Site {
	
	public Site () {};
	
	public Site(Long id, Integer height, Integer numberOfWay, String quotation, Integer department,
			String orientation, String type, String titleSite, String description,
			Boolean officielLesAmisDeLescalade) {
		super();
		this.id = id;
		this.height = height;
		this.numberOfWay = numberOfWay;
		this.quotation = quotation;
		this.department = department;
		this.orientation = orientation;
		this.type = type;
		this.titleSite = titleSite;
		this.description = description;
		this.officielLesAmisDeLescalade = officielLesAmisDeLescalade;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer height;
	private Integer numberOfWay;
	private Integer department;
	
	private String quotation;
	private String orientation;
	private String type;
	private String titleSite;
	private String description;
	
	private Boolean officielLesAmisDeLescalade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getNumberOfWay() {
		return numberOfWay;
	}

	public void setNumberOfWay(Integer numberOfWay) {
		this.numberOfWay = numberOfWay;
	}

	public String getQuotation() {
		return quotation;
	}

	public void setQuotation(String quotation) {
		this.quotation = quotation;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitleSite() {
		return titleSite;
	}

	public void setTitleSite(String titleSite) {
		this.titleSite = titleSite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getOfficielLesAmisDeLescalade() {
		return officielLesAmisDeLescalade;
	}

	public void setOfficielLesAmisDeLescalade(Boolean officielLesAmisDeLescalade) {
		this.officielLesAmisDeLescalade = officielLesAmisDeLescalade;
	}
	
}