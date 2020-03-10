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
	
	public Site(Integer id, Integer height, Integer numberOfWay, Integer quotation, Integer department,
			Integer orientation, Boolean type, String titleSite, String description,
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
	private Integer id;
	private Integer height;
	private Integer numberOfWay;
	private Integer quotation;
	private Integer department;
	private Integer orientation;

	private Boolean type;

	private String titleSite;
	private String description;
	
	private Boolean officielLesAmisDeLescalade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getQuotation() {
		return quotation;
	}

	public void setQuotation(Integer quotation) {
		this.quotation = quotation;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	public Integer getOrientation() {
		return orientation;
	}

	public void setOrientation(Integer orientation) {
		this.orientation = orientation;
	}

	public Boolean getType() {
		return type;
	}

	public void setType(Boolean type) {
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