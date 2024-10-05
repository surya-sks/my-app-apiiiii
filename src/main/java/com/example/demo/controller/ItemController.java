package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.annotations.Any;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeAbsence;
import com.example.demo.model.ItemPurchased;
import com.example.demo.model.ItemsFruitList;
import com.example.demo.model.ItemsList;
import com.example.demo.model.ItemsVegetableList;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.ItemService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "https://surya-sks.github.io/"})
@RequestMapping("/api/items")
public class ItemController {
   private ItemService itemService;

   public ItemController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}
   
   //build save items purchased api
   @PostMapping("/saveItemPurchased")
   public ResponseEntity<ItemPurchased> saveItemPurchased(@RequestBody ItemPurchased itemPurchased){
	   return new ResponseEntity<ItemPurchased>(itemService.saveItemPurchased(itemPurchased), HttpStatus.CREATED);
   }
   
 //get all vegetables REST API
   @GetMapping("/getVegetablesList")
   public List<ItemsVegetableList> getVegetablesList(){
	   return itemService.getVegetablesList();   
   }
   
 //get all fruits REST API
   @GetMapping("/getFruitsList")
   public List<ItemsFruitList> getFruitsList(){
	   return itemService.getFruitsList();   
   }
  
 //get all items REST API
//  
   @GetMapping("/getItemsList")
   public List<ItemsList> getItemsList(){
	   return itemService.getItemsList();    
   }
}
