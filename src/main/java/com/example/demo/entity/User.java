package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class User {
	@Id @GeneratedValue
	int userid;
	String name;
	
	@OneToOne //required single variable //working
	Address address;

	public User(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
//	@ManyToOne //required single variable //working
//	Address address2;
	
//	@OneToMany//requiredlist type : List<Address> address; : working
//	List<Address> address;
	
}
