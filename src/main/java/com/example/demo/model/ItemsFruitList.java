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
@Table(name="items_fruit_list")
public class ItemsFruitList {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fru_id")
    private String fruId;
    
    @Column(name="fru_name")
    private String fruName;

	public String getFruId() {
		return fruId;
	}

	public void setFruId(String fruId) {
		this.fruId = fruId;
	}

	public String getFruName() {
		return fruName;
	}

	public void setFruName(String fruName) {
		this.fruName = fruName;
	}


}
