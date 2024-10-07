package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="bills")
public class Bill {    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToMany(mappedBy = "bill") // Define the relationship
    private int billId;
	
	@Column(name="customer_id")
    private int customerId;
	
	@Column(name="total_amount")
    private int totalAmount;
	
	@Column(name="date")
    private java.sql.Timestamp Date;
	
	@Column(name="payment_method")
    private String paymentMethod;
	
	@Column(name="status")
    private String status;

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public java.sql.Timestamp getDate() {
		return Date;
	}

	public void setDate(java.sql.Timestamp date) {
		Date = date;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
//	@OneToMany(mappedBy = "bill") // This establishes the relationship
//    private List<BillLineItems> billLineItems;

}
