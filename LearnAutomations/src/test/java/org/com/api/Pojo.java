package org.com.api;

import java.util.List;

public class Pojo {
	private String Firstname;
	private String Lastname;
	private String Email;
	private List Skills;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List getSkills() {
		return Skills;
	}
	public void setSkills(List skills) {
		Skills = skills;
	}
	
	
}
