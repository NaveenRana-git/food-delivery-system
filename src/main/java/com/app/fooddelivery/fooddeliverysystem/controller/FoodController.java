package com.app.fooddelivery.fooddeliverysystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.fooddelivery.fooddeliverysystem.dao.FoodDao;
import com.app.fooddelivery.fooddeliverysystem.entity.Food;

	

@RestController()
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private FoodDao foodDao;
	
	@GetMapping("/get/all")
	public List<Food> sortByPrice(){
		return foodDao.sortByPrice();
	} 
	
}
