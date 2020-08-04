package com.app.fooddelivery.fooddeliverysystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.fooddelivery.fooddeliverysystem.dao.OrderDao;
import com.app.fooddelivery.fooddeliverysystem.entity.Orders;

@RestController
@RequestMapping("/foodapi")
public class OrderController {
	
	private OrderDao dao;
	
	@Autowired
	public OrderController(OrderDao theOrderDao) {
		dao = theOrderDao;
	}
	
	@PostMapping("/orders")
	public Orders saveOrder(@RequestBody Orders od) {
		return dao.saveOrder(od);
		
	}
	
}
