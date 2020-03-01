package com.openclassrooms.climbing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	
	public Comment() {};
	
	public Comment(Integer id, String title_comment, String message, User user) {
		super();
		this.id = id;
		this.titleComment = title_comment;
		this.message = message;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titleComment;
	private String message;
	
	@ManyToOne
	private User user;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle_comment() {
		return titleComment;
	}
	public void setTitle_comment(String title_comment) {
		this.titleComment = title_comment;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
