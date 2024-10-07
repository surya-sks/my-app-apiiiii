package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BillLineItems;
import com.example.demo.model.Employee;

public interface BillLineItemsRepository extends JpaRepository<BillLineItems, Long>{

}
