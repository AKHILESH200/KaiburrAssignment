package com.kaiburr.task1.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	
	@Id
    private String id;
    private String name;
    private String assignee;
    private String project;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Date startTime;
    private String AkhileshProperty;
    
	public Task(String id, String name, String assignee, String project, Date startTime, String AkhileshProperty) {
		super();
		this.id = id;
		this.name = name;
		this.assignee = assignee;
		this.project = project;
		this.startTime = startTime;
		this.AkhileshProperty = AkhileshProperty;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getAkhileshProperty() {
		return AkhileshProperty;
	}
	public void setAkhileshProperty(String AkhileshProperty) {
		this.AkhileshProperty = AkhileshProperty;
	}
    

}

