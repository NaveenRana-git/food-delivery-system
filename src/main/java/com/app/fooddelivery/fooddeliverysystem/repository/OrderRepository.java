package com.app.fooddelivery.fooddeliverysystem.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.app.fooddelivery.fooddeliverysystem.entity.Orders;


@Repository
public class OrderRepository {

	@PersistenceContext
	private EntityManager en;
	
	public Orders saveOrder(Orders order) {
		if(order.getOrderID() == null) {
			en.persist(order);
		}else {
			en.merge(order);
		}
		return order;
	}
}
