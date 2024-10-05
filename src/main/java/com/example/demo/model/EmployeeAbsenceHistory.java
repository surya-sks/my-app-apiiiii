package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employeeAbsenceHistory")
public class EmployeeAbsenceHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private long id;
	
	@Column(name="empNumber")
    private long empNumber;
	
	@Column(name="fromDate")
    private java.sql.Timestamp fromDate;
	
	@Column(name="toDate")
    private java.sql.Timestamp toDate;
	
	@Column(name="duration")
    private long duration;
	
	@Column(name="reason")
    private String reason;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(long empNumber) {
		this.empNumber = empNumber;
	}

	public java.sql.Timestamp getFromDate() {
		return fromDate;
	}

	public void setFromDate(java.sql.Timestamp fromDate) {
		this.fromDate = fromDate;
	}

	public java.sql.Timestamp getToDate() {
		return toDate;
	}

	public void setToDate(java.sql.Timestamp toDate) {
		this.toDate = toDate;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
    
	}
