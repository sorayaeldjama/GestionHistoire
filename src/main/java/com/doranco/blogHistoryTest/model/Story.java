package com.doranco.blogHistoryTest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Story {
	@Id
	@GeneratedValue
	@Column(unique =true)
	private Long id ; 
	private String author ; 
	private String content ;
	
	public Story(Long id, String author, String content) {
		super();
		this.id = id;
		this.author = author;
		this.content = content;
	}

	public Story() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	} 	
	
	
}
