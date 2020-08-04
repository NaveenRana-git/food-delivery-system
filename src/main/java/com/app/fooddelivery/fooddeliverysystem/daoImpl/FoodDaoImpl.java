package com.app.fooddelivery.fooddeliverysystem.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.fooddelivery.fooddeliverysystem.dao.FoodDao;
import com.app.fooddelivery.fooddeliverysystem.entity.Food;
import com.app.fooddelivery.fooddeliverysystem.repository.FoodRepository;

@Repository
public class FoodDaoImpl implements FoodDao{
	
	@Autowired
	private FoodRepository foodRepository;

	@Override
	public List<Food> sortByPrice() {
		return foodRepository.sortByPrice();
	}
	
	

}
