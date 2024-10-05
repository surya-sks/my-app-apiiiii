package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
//@Entity
public class ItemsList {
    private String itemId;
    private String itemName;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
