package com.app.fooddelivery.fooddeliverysystem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.app.fooddelivery.fooddeliverysystem.entity.Restaurant;

@Repository
public class RestaurantRepository {
	
	@PersistenceContext
	private EntityManager en;
	
	public List<Restaurant> sortByRating() {
		TypedQuery<Restaurant> query = en.createQuery("select r from Restaurant r order by r.rest_rating desc",Restaurant.class);
		return query.getResultList();
	}

}
