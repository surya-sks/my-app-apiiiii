package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ItemPurchased;

public interface ItemPurchasedRepository extends JpaRepository<ItemPurchased, Long>{

}
