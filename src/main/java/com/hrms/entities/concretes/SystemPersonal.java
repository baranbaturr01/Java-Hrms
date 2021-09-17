package com.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hrms.entities.abstracts.User;

@Entity
@Table(name="system_personals")
public class SystemPersonal extends User{
	
	@Id
	@GeneratedValue
	@Column(name = "personal_id")
	private int personalId;
	
	@Column(name = "name")
	private String name;
	
	public SystemPersonal() {
		// TODO Auto-generated constructor stub
	}

	public SystemPersonal(int personalId, String name) {
		super();
		this.personalId = personalId;
		this.name = name;
	}

	public int getPersonalId() {
		return personalId;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
