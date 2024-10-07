package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="billLineItems")
public class BillLineItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lineItemId;
	
//	@ManyToOne // Defines a many-to-one relationship
//    @JoinColumn(name = "bill_id", nullable = false) // Specifies the foreign key column
//    private Bill bill;
	
	@Column(name="bill_id")
    private int billId;
	
	@Column(name="product_id")
    private int productId;
	
	@Column(name="quantity")
    private int quantity;
	
	@Column(name="unit_price")
    private int unitPrice;
	
	@Column(name="total_price")
    private int totalPrice;

	public long getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(long lineItemId) {
		this.lineItemId = lineItemId;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
