package com.app.fooddelivery.fooddeliverysystem.dao;

import org.springframework.stereotype.Service;

import com.app.fooddelivery.fooddeliverysystem.entity.Orders;

@Service
public interface OrderDao {
	
	public Orders saveOrder(Orders order);

}
