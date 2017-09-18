package com.phill.simpleCrud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Person {
	
	@Autowired
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	private String firstName;
	private String lastName;
}
