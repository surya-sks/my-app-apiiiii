package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bill;
import com.example.demo.model.BillLineItems;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeAbsence;
import com.example.demo.repository.BillLineItemsRepository;
import com.example.demo.repository.BillRepository;
import com.example.demo.repository.EmployeeAbsenceRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.BillService;
import com.example.demo.service.EmployeeService;

@Service
public class BillServiceImpl implements BillService{
	@Autowired
	private BillRepository billRepository;
	@Autowired
	private BillLineItemsRepository billLineItemsRepository;
	
	public BillServiceImpl(BillRepository billRepository, BillLineItemsRepository billLineItemsRepository) {
		super();
		this.billRepository = billRepository;
		this.billLineItemsRepository = billLineItemsRepository;
	}

	@Override
	public Integer saveBill(Bill bill) {
		 Bill savedBill = billRepository.save(bill);
		 return savedBill.getBillId();
	}

	@Override
	public BillLineItems saveBillLineItems(BillLineItems[] billLineItems) {
		for (BillLineItems billLineItem : billLineItems) {
			billLineItemsRepository.save(billLineItem);
			return billLineItem;
        }
		return null;
	}
}
