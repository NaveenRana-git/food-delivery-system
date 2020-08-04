package com.app.fooddelivery.fooddeliverysystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.fooddelivery.fooddeliverysystem.dao.RestaurantDao;
import com.app.fooddelivery.fooddeliverysystem.entity.Restaurant;

@RestController
@RequestMapping("/restaurant")
public class ResteurantController {
	
	@Autowired
	private RestaurantDao restDao;
	
	@GetMapping("/get/filterbyRating")
	public List<Restaurant> sortByRating(){
		return restDao.sortByRating();
	}

}
