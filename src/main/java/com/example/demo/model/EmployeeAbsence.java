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
@Table(name="employeeAbsence")
public class EmployeeAbsence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empNumber;
	
	@Column(name="name")
    private String name;
	
	@Column(name="leaveBalance")
    private long leaveBalance;

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

	public long getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(long leaveBalance) {
		this.leaveBalance = leaveBalance;
	}
}


