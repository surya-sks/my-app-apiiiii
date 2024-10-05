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
@Table(name="item_purchased")
public class ItemPurchased {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private long id;
	
    @Column(name="date")
    private java.sql.Timestamp date;
    
    @Column(name="itemName")
    private String itemName;
    
    @Column(name="quantityName")
    private String quantityName;
    
    @Column(name="quantity")
    private int quantity;
    
    @Column(name="quantityToKgOrPiece")
    private int quantityToKgOrPiece;
    
    @Column(name="totalQuantityInKgOrPiece")
    private int totalQuantityInKgOrPiece;
    
    @Column(name="totalBuyingAmount")
    private int totalBuyingAmount;
    
    @Column(name="buyingAmountForQuantity")
    private int buyingAmountForQuantity;
    
    @Column(name="expectedSellingAmount")
    private int expectedSellingAmount;
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.sql.Timestamp getDate() {
		return date;
	}

	public void setDate(java.sql.Timestamp date) {
		this.date = date;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getQuantityName() {
		return quantityName;
	}

	public void setQuantityName(String quantityName) {
		this.quantityName = quantityName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantityToKgOrPiece() {
		return quantityToKgOrPiece;
	}

	public void setQuantityToKgOrPiece(int quantityToKgOrPiece) {
		this.quantityToKgOrPiece = quantityToKgOrPiece;
	}

	public int getTotalQuantityInKgOrPiece() {
		return totalQuantityInKgOrPiece;
	}

	public void setTotalQuantityInKgOrPiece(int totalQuantityInKgOrPiece) {
		this.totalQuantityInKgOrPiece = totalQuantityInKgOrPiece;
	}

	public int getTotalBuyingAmount() {
		return totalBuyingAmount;
	}

	public void setTotalBuyingAmount(int totalBuyingAmount) {
		this.totalBuyingAmount = totalBuyingAmount;
	}

	public int getBuyingAmountForQuantity() {
		return buyingAmountForQuantity;
	}

	public void setBuyingAmountForQuantity(int buyingAmountForQuantity) {
		this.buyingAmountForQuantity = buyingAmountForQuantity;
	}

	public int getExpectedSellingAmount() {
		return expectedSellingAmount;
	}

	public void setExpectedSellingAmount(int expectedSellingAmount) {
		this.expectedSellingAmount = expectedSellingAmount;
	}

	public int getExpectedSellingAmountForQuantity() {
		return expectedSellingAmountForQuantity;
	}

	public void setExpectedSellingAmountForQuantity(int expectedSellingAmountForQuantity) {
		this.expectedSellingAmountForQuantity = expectedSellingAmountForQuantity;
	}

	@Column(name="expectedSellingAmountForQuantity")
    private int expectedSellingAmountForQuantity;
}
