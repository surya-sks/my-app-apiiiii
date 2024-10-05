package com.example.demo.service;

import java.util.List;

import org.hibernate.annotations.Any;

import com.example.demo.model.ItemPurchased;
import com.example.demo.model.ItemsFruitList;
import com.example.demo.model.ItemsList;
import com.example.demo.model.ItemsVegetableList;

public interface ItemService {
     ItemPurchased saveItemPurchased(ItemPurchased itemPurchased);
     List<ItemsVegetableList> getVegetablesList();
     List<ItemsFruitList> getFruitsList();
     List<ItemsList> getItemsList();
}
