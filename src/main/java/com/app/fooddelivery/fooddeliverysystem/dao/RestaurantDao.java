package com.app.fooddelivery.fooddeliverysystem.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.fooddelivery.fooddeliverysystem.entity.Restaurant;

@Service
public interface RestaurantDao {
	public List<Restaurant> sortByRating();

}
