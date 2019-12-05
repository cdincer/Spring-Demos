package com.test.springdemo.Hibernate.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="customer_detail")
public class CustomerDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="profile")
	private String profile;
	
	@Column(name="hobby")
	private String hobby;
	
	
	public CustomerDetail()
	{
		
	}


	public CustomerDetail(String profile, String hobby) {
		super();
		this.profile = profile;
		this.hobby = hobby;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	@Override
	public String toString() {
		return "CustomerDetail [id=" + id + ", profile=" + profile + ", hobby=" + hobby + "]";
	}

	
	
	
}
