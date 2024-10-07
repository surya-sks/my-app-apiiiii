package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bill;
import com.example.demo.model.BillLineItems;
import com.example.demo.model.Employee;
import com.example.demo.service.BillService;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://surya-sks.github.io/"})
@RequestMapping("/api/bill")
public class BillController {
	private BillService billService;
	
	public BillController(BillService billService) {
		super();
		this.billService = billService;
	}

	//create save bill REST API
	   @PostMapping("/saveBill")
	   public ResponseEntity<Integer> saveBill(@RequestBody Bill bill){
		   return new ResponseEntity<Integer>(billService.saveBill(bill), HttpStatus.CREATED);
	   }
	   
	 //create save bill lines items REST API
	   @PostMapping("/saveBillLineItems")
	   public ResponseEntity<BillLineItems> saveBillLineItems(@RequestBody BillLineItems[] billLineItems){
		   return new ResponseEntity<BillLineItems>(billService.saveBillLineItems(billLineItems), HttpStatus.CREATED);
	   }	   
}
