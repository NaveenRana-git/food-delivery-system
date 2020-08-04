package com.app.fooddelivery.fooddeliverysystem.daoImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.fooddelivery.fooddeliverysystem.dao.OrderDao;
import com.app.fooddelivery.fooddeliverysystem.entity.Orders;
import com.app.fooddelivery.fooddeliverysystem.repository.OrderRepository;


@Repository
public class OrderDaoImpl implements OrderDao {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Orders saveOrder(Orders order) {
		return orderRepository.saveOrder(order);
	}

}
