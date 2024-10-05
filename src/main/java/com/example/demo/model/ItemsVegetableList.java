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
@Table(name="items_vegetable_list")
public class ItemsVegetableList {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="veg_id")
    private String vegId;
    
    @Column(name="veg_name")
    private String vegName;

	public String getVegId() {
		return vegId;
	}

	public void setVegId(String vegId) {
		this.vegId = vegId;
	}

	public String getVegName() {
		return vegName;
	}

	public void setVegName(String vegName) {
		this.vegName = vegName;
	}
}
