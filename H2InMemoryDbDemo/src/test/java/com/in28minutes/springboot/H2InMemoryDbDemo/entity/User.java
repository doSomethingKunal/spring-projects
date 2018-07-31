package com.in28minutes.springboot.H2InMemoryDbDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery (query = "select u from User u", name = "query_find_all_users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String role;
	
	protected User() {	
	}
	
	public User(String name, String role) {
		this.name = name;
		this.role = role;
	}

}
