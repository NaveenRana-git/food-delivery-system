package com.app.fooddelivery.fooddeliverysystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="food")
public class Food {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="food_id")
	private int id;
	
	@Column(name="food_item")
	private String item;
	
	@Column(name="price")
	private int price;
	
	@OneToMany(mappedBy="food")
	private List<Orders> order;
	
	public int getId() {
		return id;
	}
	
	public Food() {
		
	}

	public Food(int id, String item, int price) {
		this.id = id;
		this.item = item;
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", item=" + item + ", price=" + price + "]";
	}

	
}
