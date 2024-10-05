package com.example.demo.model;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empNumber;
	
	@Column(name="name", nullable = false)
    private String name;
	
	@Column(name="role")
    private String role;
	
	@Column(name="location")
    private String location;
	
	@Column(name="contactNumber")
    private Number contactNumber;

	public long getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(long empNumber) {
		this.empNumber = empNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Number getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Number contactNumber) {
		this.contactNumber = contactNumber;
	}
    
	}

