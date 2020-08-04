package com.app.fooddelivery.fooddeliverysystem.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.fooddelivery.fooddeliverysystem.dao.RestaurantDao;
import com.app.fooddelivery.fooddeliverysystem.entity.Restaurant;
import com.app.fooddelivery.fooddeliverysystem.repository.RestaurantRepository;

@Repository
public class RestaurantDaoImpl implements RestaurantDao {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Override
	public List<Restaurant> sortByRating() {
		return restaurantRepository.sortByRating();
	}
	
}
