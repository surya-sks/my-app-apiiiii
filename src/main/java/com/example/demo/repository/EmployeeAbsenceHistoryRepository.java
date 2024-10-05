package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmployeeAbsenceHistory;

public interface EmployeeAbsenceHistoryRepository  extends JpaRepository<EmployeeAbsenceHistory, Long>{
	List<EmployeeAbsenceHistory> findByEmpNumber(long empNumber);
}
