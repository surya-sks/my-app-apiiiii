package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Bill;
import com.example.demo.model.Employee;

public interface BillRepository extends JpaRepository<Bill, Long>{

}
