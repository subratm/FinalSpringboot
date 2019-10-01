package com.caseStudy.SpringBootCaseStudy.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="taskId")
	private long taskId;
	
	@Column(name="taskName")
	private String taskName;
	
	@Column(name="parentTask")
	private String parentTask;
	
	@Column(name="priority")
	private int priority;
	
	@Column(name="startDate")
	private LocalDate startDate;

	@Column(name="endDate")
	private LocalDate endDate;

	@OneToOne
	private User user;
	
	
	@OneToOne
	private Project project;
	
	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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

	public Task() {
		super();
	}

	public Task(long taskId, String taskName, String parentTask, int priority, LocalDate startDate, LocalDate endDate) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.parentTask = parentTask;
		this.priority = priority;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	
	
	
}
