package com.LB.TaskTracker.Model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Task {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer ID;
	private String subject;
	private String body;
		
	
	public Task() {
		super();
	}

	public Task(String subject, String body) {
		super();
		this.subject = subject;
		this.body = body;
	}

	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
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
