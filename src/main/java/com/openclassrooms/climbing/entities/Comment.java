package com.openclassrooms.climbing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	
	public Comment() {};
	
	public Comment(Long id, String titleComment, String message) {
		super();
		this.id = id;
		this.titleComment = titleComment;
		this.message = message;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titleComment;
	private String message;
	
	@ManyToOne
	private User user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
