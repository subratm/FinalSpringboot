package com.caseStudy.SpringBootCaseStudy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")
	private long userId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="employee_Id")
	private int employee_Id;

	@OneToOne
	private Project project;
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployee_id() {
		return employee_Id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_Id = employee_id;
	}

	public User(long userId, String firstName, String lastName, int employee_id) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employee_Id = employee_id;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", employee_Id="
				+ employee_Id + "]";
	}
	

	
}
