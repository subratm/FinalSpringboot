package com.caseStudy.SpringBootCaseStudy.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="projectId")
	private long projectId;
	
	@Column(name="projectName")
	private String projectName;
	
	@Column(name="startDate")
	private LocalDate startDate;
	
	@Column(name="endDate")
	private LocalDate endDate;
	
	@Column(name="priority")
	private int priority;

	@OneToOne
	private User user;
	
	
	@Column(name="noOfTasks")
	private int noOfTasks;
	
	
	public Project(long projectId, String projectName, LocalDate startDate, LocalDate endDate, int priority, User user,
			int noOfTasks) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.user = user;
		this.noOfTasks = noOfTasks;
	}


	public int getNoOfTasks() {
		return noOfTasks;
	}


	public void setNoOfTasks(int noOfTasks) {
		this.noOfTasks = noOfTasks;
	}


	public long getProjectId() {
		return projectId;
	}

	
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	

	public Project() {
		super();
	}
	
	
}
