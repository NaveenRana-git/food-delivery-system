package com.app.fooddelivery.fooddeliverysystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	private Integer orderID;
	
	@Column(name = "food_id")
	private int foodID;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "total_price")
	private int totalPrice;
	
	@ManyToOne()
	private Food food;
		
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	public Orders() {
		
	}

	public Orders(int orderID, int foodID, int quantity, int totalPrice) {
		this.orderID = orderID;
		this.foodID = foodID;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getFoodID() {
		return foodID;
	}

	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", foodID=" + foodID + ", quantity=" + quantity + ", totalPrice="
				+ totalPrice + "]";
	}
	
	
	

}
