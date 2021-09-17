package com.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hrms.entities.abstracts.User;

@Entity
@Table(name="jobseekers")
public class JobSeeker extends User{
	
	@Id
	@GeneratedValue
	@Column(name = "jobseeker_id")
	private int jobSeekerId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surName;
	
	@Column(name = "year_of_birth")
	private Date yearOfBirth;
	
	
	@Column(name = "national_identity")
	private String nationalIdentity;


	public JobSeeker() {
		super();
	}


	public JobSeeker(int jobSeekerId, String name, String surName, Date yearOfBirth, String nationalIdentity) {
		super();
		this.jobSeekerId = jobSeekerId;
		this.name = name;
		this.surName = surName;
		this.yearOfBirth = yearOfBirth;
		this.nationalIdentity = nationalIdentity;
	}


	public int getJobSeekerId() {
		return jobSeekerId;
	}


	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public Date getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(Date yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}


	public String getNationalIdentity() {
		return nationalIdentity;
	}


	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	
	

}
