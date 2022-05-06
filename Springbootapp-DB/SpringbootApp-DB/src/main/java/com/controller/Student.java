package com.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	int sid;
	String name;
	String email;
}
