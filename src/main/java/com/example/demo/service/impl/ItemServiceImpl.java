package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.annotations.Any;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.util.ArrayUtils;

import com.example.demo.model.ItemPurchased;
import com.example.demo.model.ItemsFruitList;
import com.example.demo.model.ItemsList;
import com.example.demo.model.ItemsVegetableList;
import com.example.demo.repository.ItemPurchasedRepository;
import com.example.demo.repository.ItemsFruitListRepository;
import com.example.demo.repository.ItemsVegetableListRepository;
import com.example.demo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
    
	private ItemPurchasedRepository itemPurchasedRepository;
	private ItemsFruitListRepository itemsFruitListRepository;
	private ItemsVegetableListRepository itemsVegetableListRepository; 
	
	public ItemServiceImpl(ItemPurchasedRepository itemPurchasedRepository,
			ItemsFruitListRepository itemsFruitListRepository,
			ItemsVegetableListRepository itemsVegetableListRepository) {
		super();
		this.itemPurchasedRepository = itemPurchasedRepository;
		this.itemsFruitListRepository = itemsFruitListRepository;
		this.itemsVegetableListRepository = itemsVegetableListRepository;
	}
	
	@Override
	public ItemPurchased saveItemPurchased(ItemPurchased itemPurchased) {
		return itemPurchasedRepository.save(itemPurchased);
	}
	
	@Override
	public List<ItemsVegetableList> getVegetablesList() {
		return this.itemsVegetableListRepository.findAll();
	}
	
	@Override
	public List<ItemsFruitList> getFruitsList() {
		return this.itemsFruitListRepository.findAll();
	}

	@Override
	public List<ItemsList> getItemsList() {
		List<ItemsVegetableList> itemsVegetableList = this.getVegetablesList();
		List<ItemsFruitList> itemsFruitList = getFruitsList();
		List<ItemsList> allItemsList = new ArrayList<ItemsList>();;
		itemsVegetableList.forEach((veg) -> 
		{
	    ItemsList item =  new ItemsList();
		item.setItemId(veg.getVegId());
		item.setItemName(veg.getVegName());
		allItemsList.add(item);
		});
		itemsFruitList.forEach((fru) -> 
		{
	    ItemsList item =  new ItemsList();
		item.setItemId(fru.getFruId());
		item.setItemName(fru.getFruName());
		allItemsList.add(item);
		});
	    return allItemsList;
	}
}
