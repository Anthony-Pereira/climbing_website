package com.openclassrooms.climbing.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="web_user")
public class User {
	
	public User() {};

	public User(String name, String surname,
			@Email @NotEmpty @Size(min = 2, max = 40, message = "Name must be between 2 and 40 characters long") String email,
			String password, Integer phone, String adress, String city, Integer zip, Boolean active) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.adress = adress;
		this.city = city;
		this.zip = zip;
		this.active = active;
	}

	
	private String name;
	private String surname;
	@Id
	@Email
	@NotEmpty
	@Size(min=2,max=40,message="Name must be between 2 and 40 characters long")
	@Column(unique=true)
	private String email;
	private String password;
	private Integer phone;
	private String adress;
	private String city;
	private Integer zip;
	private Boolean active;
	
	@OneToMany(mappedBy="user")
	private Collection<Comment> comment;
	
	@ManyToMany
	private Collection<Site> site;
	
	@ManyToMany
	private Collection<Topo> topo;
	
	@ManyToMany
	private Collection<Role> role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
