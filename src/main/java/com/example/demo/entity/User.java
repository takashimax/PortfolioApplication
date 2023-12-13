package com.example.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@EntityScan
@Table(name = "user")
@Data
public class User {

	@Id
	@Column(value = "id")
	private Integer id;
	
	@Column(value = "name")
	private String name;
	
	@Column(value = "password")
	private String password;
	
	@Column(value = "email")
	private String email;
}