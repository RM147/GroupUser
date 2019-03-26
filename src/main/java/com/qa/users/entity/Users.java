package com.qa.users.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue
	private Long userID;

	private String forename;
	private String lastname;
	private String role;
	private String email;
	private String password;

	public Long getId() {
		return userID;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users(String forename, String lastname, String role, String email,String password) {
		this.forename = forename;
		this.lastname = lastname;
		this.role = role;
		this.email = email;
	}
	
	public Users() {
		
	}

}
