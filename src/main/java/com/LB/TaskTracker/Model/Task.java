package com.LB.TaskTracker.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	private String subject;
	
	private String body;
	
	private Integer userId;
	
	public Task() {
		super();
	}

	public Task(String subject, String body,Integer userId) {
		super();
		this.subject = subject;
		this.body = body;
		this.userId = userId;
	}

	
	public Integer getID() {
		return id;
	}
	public void setID(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
	
	
}
