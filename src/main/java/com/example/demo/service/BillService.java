package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Bill;
import com.example.demo.model.BillLineItems;
import com.example.demo.model.Employee;

public interface BillService {
	Integer saveBill(Bill bill);
	BillLineItems saveBillLineItems(BillLineItems[] billLineItems);
}
