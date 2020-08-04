package com.app.fooddelivery.fooddeliverysystem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.app.fooddelivery.fooddeliverysystem.entity.Food;

@Repository
public class FoodRepository {
	
	@PersistenceContext
	private EntityManager en;
	
	public List<Food> sortByPrice() {
		TypedQuery<Food> query = en.createQuery("select f from Food f order by f.price desc",Food.class);
		return query.getResultList();
	}
}
