package com.app.fooddelivery.fooddeliverysystem.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.fooddelivery.fooddeliverysystem.entity.Food;

@Service
public interface FoodDao {
	
	public List<Food> sortByPrice();
}
