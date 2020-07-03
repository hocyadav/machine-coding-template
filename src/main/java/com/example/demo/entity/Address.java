package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class Address {
	@Id @GeneratedValue
	int id;
	String state;
	String city;
	public Address(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}
	
}
