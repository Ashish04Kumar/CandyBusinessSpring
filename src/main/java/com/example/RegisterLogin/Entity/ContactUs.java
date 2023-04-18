package com.example.RegisterLogin.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contactus")
public class ContactUs {
	
	
	@Id
    @Column(name="contactus_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contactusid;
	
	private String name;
	private String email;
	private String message;
	public int getContactusid() {
		return contactusid;
	}
	public void setContactusid(int contactusid) {
		this.contactusid = contactusid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ContactUs(int contactusid, String name, String email, String message) {
		super();
		this.contactusid = contactusid;
		this.name = name;
		this.email = email;
		this.message = message;
	}
	
	
	public ContactUs()
	{
		
	}
	@Override
	public String toString() {
		return "ContactUs [contactusid=" + contactusid + ", name=" + name + ", email=" + email + ", message=" + message
				+ "]";
	}
	
	
}
